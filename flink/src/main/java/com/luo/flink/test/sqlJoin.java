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
import org.apache.flink.streaming.api.windowing.time.Time;
import org.apache.flink.streaming.api.windowing.windows.TimeWindow;
import org.apache.flink.streaming.util.keys.KeySelectorUtil;
import org.apache.flink.table.api.EnvironmentSettings;
import org.apache.flink.table.api.bridge.java.StreamTableEnvironment;
import org.apache.flink.table.planner.plan.logical.TumblingGroupWindow;

import javax.xml.crypto.KeySelector;
import java.util.Arrays;
import java.util.Properties;

public class sqlJoin {


    public static void main(String[] args) throws Exception {
        Configuration configuration =  new Configuration();
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

        env.addSource(new SourceFunction<Object>() {
            @Override
            public void run(SourceContext<Object> sourceContext) throws Exception {

            }

            @Override
            public void cancel() {

            }
        });


        //DataStreamSource<String> localhost = env.socketTextStream("localhost", 8888);
        DataStreamSource<Info> integerDataStreamSource1 = env.fromCollection(
                Arrays.asList(
                        Info.builder().SID("1").SNAME("1").build(),
                        Info.builder().SID("2").SNAME("2").build(),
                        Info.builder().SID("3").SNAME("3").build()));
        DataStreamSource<GyMlTjzy> integerDataStreamSource2 = env.fromElements(
                GyMlTjzy.builder().code("1").name("1").build(),
                GyMlTjzy.builder().code("3").name("3").build());
        DataStreamSource<Long> longDataStreamSource = env.generateSequence(1, 100);

//        StopWatch stopWatch = new StopWatch();
//        stopWatch.start();
//        long time = stopWatch.getTime();


        DataStreamSink<InfoJoinyMlTjzy> join = integerDataStreamSource1
                .join(integerDataStreamSource2)
                .where(Info:: getSID)
                .equalTo(GyMlTjzy :: getCode)
                .window(TumblingEventTimeWindows.of(Time.seconds(300))).apply(
                        new JoinFunction<Info,GyMlTjzy,InfoJoinyMlTjzy>() {
                            @Override
                            public InfoJoinyMlTjzy join(Info info, GyMlTjzy gyMlTjzy) throws Exception {
                                return InfoJoinyMlTjzy.builder().SEX(info.getSEX()).SID(info.getSID()).code(gyMlTjzy.getCode()).build();
                            }
                        }
                ).print();;

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
