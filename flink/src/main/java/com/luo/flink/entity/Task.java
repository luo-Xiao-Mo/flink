package com.luo.flink.entity;

import com.alibaba.fastjson.JSON;
import com.luo.flink.util.ResourceUtil;
import com.ververica.cdc.connectors.oracle.OracleSource;
import com.ververica.cdc.connectors.oracle.table.StartupOptions;
import com.ververica.cdc.debezium.DebeziumSourceFunction;
import com.ververica.cdc.debezium.JsonDebeziumDeserializationSchema;
import lombok.Builder;
import org.apache.commons.lang3.StringUtils;
import org.apache.flink.api.common.functions.MapFunction;
import org.apache.flink.configuration.Configuration;
import org.apache.flink.streaming.api.CheckpointingMode;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.datastream.SingleOutputStreamOperator;
import org.apache.flink.streaming.api.environment.CheckpointConfig;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.api.functions.sink.RichSinkFunction;

import java.util.Properties;
import java.util.UUID;


@Builder
public class Task {

    //任务的sink 用来定义任务的输出
    private RichSinkFunction<String> richSinkFunction;
    //任务的配置 用来定义构建环境的配置
    private Configuration configuration;
    //当前任务的名称
    private String taskName;
    //当前的表名称
    private String tableName;
    //当前的数据库对象集合
    private String schema;


    /**
     * 执行任务总方法
     */
    public void exec() throws Exception {
        validateParm();
        configuration.setString("table.exec.sink.not-null-enforce", "drop");
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment(configuration);
        //设置没5秒做一次checkpoint
        env.enableCheckpointing(3000);
        //指定ck的一致性语意
        env.getCheckpointConfig().setCheckpointingMode(CheckpointingMode.EXACTLY_ONCE);
        //指定从ck自动重启的策略
        env.getCheckpointConfig().enableExternalizedCheckpoints(CheckpointConfig.ExternalizedCheckpointCleanup.RETAIN_ON_CANCELLATION);
        env.setParallelism(1);
        DataStreamSource<String> source = env.addSource(getSource());
        SingleOutputStreamOperator<String> archiveLog = source.map((MapFunction<String, String>) json -> {
            ArchiveLog log = JSON.parseObject(json, ArchiveLog.class);
            System.out.println(JSON.toJSONString(log));
            return JSON.toJSONString(log);
        });
        archiveLog.addSink(richSinkFunction);
        env.execute(taskName);
    }

    /**
     * 构建源对象配置
     */
    private Properties getProperties() {
        Properties pros = new Properties();
        pros.setProperty("debezium.log.mining.strategy", "online_catalog");
        pros.setProperty("debezium.log.mining.continuous.mine", "true");
        pros.setProperty("scan.startup.mode", "initial");
        pros.setProperty("database.tablename.case.insensitive", "false");
        return pros;
    }

    /**
     * 验证源环境参数
     */
    private void validateParm() {
        if (StringUtils.isEmpty(taskName)) taskName = UUID.randomUUID().toString();
        if (StringUtils.isEmpty(schema)) throw new RuntimeException("数据源schema不能为空");
        if (StringUtils.isEmpty(tableName)) throw new RuntimeException("数据表不能为空");
        if (richSinkFunction == null) throw new RuntimeException("数据输出不能为空");
        this.schema = schema.toUpperCase();
        this.tableName = tableName.toUpperCase();
        if (configuration == null) this.configuration = new Configuration();
    }


    /**
     * 构建源对象
     */
    private DebeziumSourceFunction<String> getSource() {
        Properties pros = ResourceUtil.readPro("source.properties");
        return OracleSource.<String>builder()
                .hostname(pros.getProperty("sourceUrl"))
                .port(1521)
                .database(pros.getProperty("dataBase"))
                .schemaList(schema)
                .tableList(tableName)
                .username(pros.getProperty("sourceName"))
                .password(pros.getProperty("password"))
                .debeziumProperties(getProperties())
                .deserializer(new JsonDebeziumDeserializationSchema())
                .startupOptions(StartupOptions.initial())
                .build();
    }
}
