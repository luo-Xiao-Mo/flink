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
import org.apache.flink.api.common.ExecutionConfig;
import org.apache.flink.api.common.functions.CoGroupFunction;
import org.apache.flink.api.common.functions.MapFunction;
import org.apache.flink.configuration.Configuration;
import org.apache.flink.streaming.api.CheckpointingMode;
import org.apache.flink.streaming.api.TimeCharacteristic;
import org.apache.flink.streaming.api.datastream.*;
import org.apache.flink.streaming.api.environment.CheckpointConfig;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.api.functions.source.SourceFunction;
import org.apache.flink.streaming.api.windowing.assigners.TumblingProcessingTimeWindows;
import org.apache.flink.streaming.api.windowing.time.Time;
import org.apache.flink.util.Collector;

import java.util.Properties;

public class JoinTable {


    public static void main(String[] args) throws Exception {


        Configuration configuration = new Configuration();
        configuration.setString("table.exec.sink.not-null-enforce", "drop");
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment(configuration);
        env.setParallelism(1);
        //env.setStreamTimeCharacteristic(TimeCharacteristic.ProcessingTime);

        ExecutionConfig config = env.getConfig();
        config.setAutoWatermarkInterval(2000);
        //设置没5秒做一次checkpoint
//        env.enableCheckpointing(3000);
//        //指定ck的一致性语意
//        env.getCheckpointConfig().setCheckpointingMode(CheckpointingMode.EXACTLY_ONCE);
//        //指定从ck自动重启的策略
//        env.getCheckpointConfig().enableExternalizedCheckpoints(CheckpointConfig.ExternalizedCheckpointCleanup.RETAIN_ON_CANCELLATION);
        env.setParallelism(1);


        // 处理数据
        SingleOutputStreamOperator<Info> InfoStream = env.addSource(getSource("INFO")).map((MapFunction<String, Info>) json -> {
            ArchiveLog log = JSON.parseObject(json, ArchiveLog.class);
            System.out.println("Info++++++++++++"+log.getAfter());
            Info info = JSON.parseObject(log.getAfter(), Info.class);
            return info;
        });

        SingleOutputStreamOperator<GyMlTjzy> GyMlTjzyStream = env.addSource(getSource("GY_ML_TJZY")).map((MapFunction<String, GyMlTjzy>) json -> {
            ArchiveLog log = JSON.parseObject(json, ArchiveLog.class);
            System.out.println("GyMlTjzy++++++++++++"+log.getAfter());
            GyMlTjzy gyMlTjzy = JSON.parseObject(log.getAfter(), GyMlTjzy.class);
            return gyMlTjzy;
        });


        DataStreamSink<InfoJoinyMlTjzy> goGorup = InfoStream
                .coGroup(GyMlTjzyStream)
                .where(Info::getSID)
                .equalTo(GyMlTjzy::getCODE)
                .window(TumblingProcessingTimeWindows.of(Time.seconds(50))).allowedLateness(Time.seconds(1)).apply(
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
        env.execute();
    }



    private static DebeziumSourceFunction<String> getSource(String tableNname) {
        return OracleSource.<String>builder()
                .hostname("172.10.120.86")
                .port(1521)
                .database("ora12c")
                .schemaList("TEST_SHANGHAIJCPT_DB_FLINK")
                .tableList("TEST_SHANGHAIJCPT_DB_FLINK."+tableNname)
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
