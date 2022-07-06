package com.luo.flink.service.task;

import org.apache.flink.configuration.Configuration;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.table.api.TableResult;
import org.apache.flink.table.api.bridge.java.StreamTableEnvironment;
import org.apache.flink.types.Row;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

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

    public Timestamp getTimestamp(Row row, String key) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSxxx");
        ZonedDateTime zonedDateTime = ZonedDateTime.parse(String.valueOf(row.getField(key)), formatter);
        return new Timestamp(Instant.from(zonedDateTime).toEpochMilli());
    }
}


