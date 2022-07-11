package com.luo.flink.service.task;

import com.luo.flink.template.FreeTemplate;
import org.apache.flink.configuration.Configuration;
import org.apache.flink.streaming.api.CheckpointingMode;
import org.apache.flink.streaming.api.environment.CheckpointConfig;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.table.api.TableResult;
import org.apache.flink.table.api.bridge.java.StreamTableEnvironment;
import org.apache.flink.types.Row;

import java.sql.Timestamp;

public abstract class AbstractTaskService {

    protected FreeTemplate freeTemplate = FreeTemplate.getInstance();


    public void exec() {
        //创建flink流环境
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        //设置每5秒做一次ck
        env.enableCheckpointing(5000);
        //指定ck的一致性语意
        env.getCheckpointConfig().setCheckpointingMode(CheckpointingMode.EXACTLY_ONCE);
        //指定从ck自动重启的策略
        env.getCheckpointConfig().enableExternalizedCheckpoints(CheckpointConfig.
                ExternalizedCheckpointCleanup.RETAIN_ON_CANCELLATION);
        //设置并行度为1
        env.setParallelism(1);
        //创建表环境
        StreamTableEnvironment tableEnv = StreamTableEnvironment.create(env);
        //配置表环境信息
        Configuration configuration = tableEnv.getConfig().getConfiguration();
        configuration.setString("table.exec.sink.not-null-enforcer", "drop");
        //执行创建flink表sql
        tableEnv.executeSql(getSql());
        //读取内存表sql信息
        handlerTableResult(getTableResult(tableEnv));
    }

    abstract String getSql();


    abstract TableResult getTableResult(StreamTableEnvironment tableEnv);


    abstract void handlerTableResult(TableResult tableResult);


    TableResult defaultTableResult(StreamTableEnvironment tableEnv) {
        return tableEnv.executeSql("select * from " + freeTemplate.getFreeName());
    }

    static Timestamp getTimestamp(Row row, String key) {
        return null;
    }
}


