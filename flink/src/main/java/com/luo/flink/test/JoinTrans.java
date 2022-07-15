package com.luo.flink.test;

import com.alibaba.fastjson.JSON;
import com.luo.flink.entity.ArchiveLog;
import com.luo.flink.entity.business.GyMlTjzy;
import com.luo.flink.entity.business.Info;
import com.luo.flink.entity.business.InfoJoinyMlTjzy;
import com.luo.flink.util.ResourceUtil;
import com.ververica.cdc.connectors.oracle.OracleSource;
import com.ververica.cdc.connectors.oracle.table.StartupOptions;
import com.ververica.cdc.debezium.DebeziumSourceFunction;
import com.ververica.cdc.debezium.JsonDebeziumDeserializationSchema;
import org.apache.commons.lang3.time.StopWatch;
import org.apache.flink.api.common.functions.CoGroupFunction;
import org.apache.flink.api.common.functions.JoinFunction;
import org.apache.flink.api.common.functions.MapFunction;
import org.apache.flink.configuration.Configuration;
import org.apache.flink.streaming.api.CheckpointingMode;
import org.apache.flink.streaming.api.TimeCharacteristic;
import org.apache.flink.streaming.api.datastream.*;
import org.apache.flink.streaming.api.environment.CheckpointConfig;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.api.functions.source.SourceFunction;
import org.apache.flink.streaming.api.windowing.assigners.TumblingEventTimeWindows;
import org.apache.flink.streaming.api.windowing.assigners.TumblingProcessingTimeWindows;
import org.apache.flink.streaming.api.windowing.time.Time;
import org.apache.flink.streaming.api.windowing.windows.TimeWindow;
import org.apache.flink.streaming.util.keys.KeySelectorUtil;
import org.apache.flink.table.api.EnvironmentSettings;
import org.apache.flink.table.api.bridge.java.StreamTableEnvironment;
import org.apache.flink.table.planner.plan.logical.TumblingGroupWindow;
import org.apache.flink.util.Collector;

import javax.xml.crypto.KeySelector;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Properties;

public class JoinTrans {


    public static void main(String[] args) throws Exception {
        Configuration configuration = new Configuration();
        configuration.setString("table.exec.sink.not-null-enforce", "drop");
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment(configuration);
        env.setParallelism(1);
        env.setStreamTimeCharacteristic(TimeCharacteristic.ProcessingTime);
//        //设置没5秒做一次checkpoint
//        env.enableCheckpointing(3000);
//        //指定ck的一致性语意
//        env.getCheckpointConfig().setCheckpointingMode(CheckpointingMode.EXACTLY_ONCE);
//        //指定从ck自动重启的策略
//        env.getCheckpointConfig().enableExternalizedCheckpoints(CheckpointConfig.ExternalizedCheckpointCleanup.RETAIN_ON_CANCELLATION);
//        env.setParallelism(1);
//        DataStreamSource<String> source = env.addSource(getSource());

        DataStreamSource<Info> data1 = env.addSource(new SourceFunction<Info>() {
            int count = 0; // 每1秒产生一个数字，拼接字符串作为数据源事件发送出去。

            @Override
            public void run(SourceContext<Info> ctx) throws Exception {
                int i = 0;
                while (true) {
                    i++;
                    Info info = Info.builder().SID(i + "").SNAME(i * 4 + "").build();
                    ctx.collect(info);
                    count++;
                    Thread.sleep(1000);
                }
            }

            @Override
            public void cancel() {
            }
        });


        DataStreamSource<GyMlTjzy> data2 = env.addSource(new SourceFunction<GyMlTjzy>() {
            int count = 0; // 每1秒产生一个数字，拼接字符串作为数据源事件发送出去。

            @Override
            public void run(SourceContext<GyMlTjzy> ctx) throws Exception {
                int i = 0;
                while (true) {
                    i++;
                    GyMlTjzy info = GyMlTjzy.builder().CODE(i + "").NAME(i * 2 + "").build();
                    ctx.collect(info);
                    ctx.collectWithTimestamp(info,0);
                    count++;
                    Thread.sleep(1500);
                }
            }

            @Override
            public void cancel() {
            }
        });


        //DataStreamSource<String> localhost = env.socketTextStream("localhost", 8888);
       /* DataStreamSource<Info> integerDataStreamSource1 = env.fromCollection(
                Arrays.asList(
                        Info.builder().SID("1").SNAME("1").build(),
                        Info.builder().SID("2").SNAME("2").build(),
                        Info.builder().SID("3").SNAME("3").build()));
        DataStreamSource<GyMlTjzy> integerDataStreamSource2 = env.fromElements(
                GyMlTjzy.builder().code("1").name("1").build(),
                GyMlTjzy.builder().code("3").name("3").build());
        DataStreamSource<Long> longDataStreamSource = env.generateSequence(1, 100);*/

//        StopWatch stopWatch = new StopWatch();
//        stopWatch.start();
//        long time = stopWatch.getTime();


        // 这是 从join实现
//        DataStreamSink<InfoJoinyMlTjzy> join = data1
//                .join(data2)
//                .where(Info::getSID)
//                .equalTo(GyMlTjzy::getCode)
//                .window(TumblingProcessingTimeWindows.of(Time.seconds(20))).apply(
//                        new JoinFunction<Info, GyMlTjzy, InfoJoinyMlTjzy>() {
//                            @Override
//                            public InfoJoinyMlTjzy join(Info info, GyMlTjzy gyMlTjzy) throws Exception {
//                                return InfoJoinyMlTjzy.builder().SNAME(info.getSNAME()).SID(info.getSID()).code(gyMlTjzy.getCode()).name(gyMlTjzy.getName()).build();
//                            }
//                        }
//                ).print();

        // 这是 从Group实现
        DataStreamSink<InfoJoinyMlTjzy> goGorup = data1
                .coGroup(data2)
                .where(Info::getSID)
                .equalTo(GyMlTjzy::getCODE)
                .window(TumblingProcessingTimeWindows.of(Time.seconds(5))).apply(
                        new CoGroupFunction<Info, GyMlTjzy, InfoJoinyMlTjzy>() {
                            @Override
                            public void coGroup(Iterable<Info> iterable_Info, Iterable<GyMlTjzy> iterable_GyMlTjzy, Collector<InfoJoinyMlTjzy> collector) throws Exception {
                                for (Info info : iterable_Info) {
                                    boolean flag = false;
                                    for (GyMlTjzy gyMlTjzy : iterable_GyMlTjzy) {
                                        // 右流中有对应的记录
                                        collector.collect(InfoJoinyMlTjzy.builder().SNAME(info.getSNAME()).SID(info.getSID()).code(gyMlTjzy.getCODE()).name(gyMlTjzy.getNAME()).build());
                                        flag = true;
                                    }
                                    if (!flag) {
                                        // 右流中没有对应的记录
                                        collector.collect(InfoJoinyMlTjzy.builder().SNAME(info.getSNAME()).SID(info.getSID()).build());
                                    }
                                }
                            }
                        }
                ).print();

        /*AllWindowedStream<String, TimeWindow> map = source.map((MapFunction<String, String>) j -> {
            ArchiveLog log = JSON.parseObject(j, ArchiveLog.class);
            System.out.println(JSON.toJSONString(log));
            return JSON.toJSONString(log);
        }).windowAll(TumblingEventTimeWindows.of(Time.seconds(100)));
        //map.print();*/

        env.execute();

    }

    private static DebeziumSourceFunction<String> getSource() {
        Properties pros = ResourceUtil.readPro("oracleSink.properties");
        return OracleSource.<String>builder()
                .hostname("172.10.120.86")
                .port(1521)
                .database("ora12c")
                .schemaList("TEST_SHANGHAIJCPT_DB_FLINK")
                .tableList("TEST_SHANGHAIJCPT_DB_FLINK.GY_ML_TJZY")
                .username("TEST_SHANGHAIJCPT_DB_FLINK")
                .password("Abc123!@Gwssi")
                .debeziumProperties(getProperties())
                .deserializer(new JsonDebeziumDeserializationSchema())
                .startupOptions(StartupOptions.initial())
                .build();
    }

    /**
     * 构建源对象配置
     */
    private static Properties getProperties() {
        Properties pros = new Properties();
        pros.setProperty("debezium.log.mining.strategy", "online_catalog");
        pros.setProperty("debezium.log.mining.continuous.mine", "true");
        pros.setProperty("scan.startup.mode", "initial");
        pros.setProperty("database.tablename.case.insensitive", "false");
        return pros;
    }
}
