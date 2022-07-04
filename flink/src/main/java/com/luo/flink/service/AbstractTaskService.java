package com.luo.flink.service;

import org.apache.flink.configuration.Configuration;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.table.api.TableResult;
import org.apache.flink.table.api.bridge.java.StreamTableEnvironment;

public abstract class AbstractTaskService {


    public void exec() {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        env.setParallelism(1);
        StreamTableEnvironment tableEnv = StreamTableEnvironment.create(env);
        Configuration configuration = tableEnv.getConfig().getConfiguration();
        configuration.setString("table.exec.sink.not-null-enforcer", "drop");
        tableEnv.executeSql(getSql());
        handlerTableResult(getTableResult(tableEnv));
    }

    abstract String getSql();

    abstract TableResult getTableResult(StreamTableEnvironment tableEnv);


    abstract void handlerTableResult(TableResult tableResult);
}


