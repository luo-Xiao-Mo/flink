package com.luo.flink.service.task;

import com.luo.flink.util.DruidUtil;
import org.apache.flink.configuration.Configuration;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.table.api.TableResult;
import org.apache.flink.table.api.bridge.java.StreamTableEnvironment;
import org.apache.flink.types.Row;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

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

    static Timestamp getTimestamp(Row row, String key) {
        return null;
//        ZoneId zoneIdShanghai = ZoneId.of("Asia/Shanghai");
//        Object o = row.getField(key);
//        if (o == null) return null;
//        String dateString = String.valueOf(o);
//        long value = string2long(dateString, zoneIdShanghai);
//        return new Timestamp(value);
    }

    private static long string2long(String dateString, ZoneId zoneId) {
        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        formatter.withZone(zoneId);
        LocalDateTime localDateTime = LocalDateTime.parse(dateString, formatter);
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, zoneId);
        return Instant.from(zonedDateTime).toEpochMilli();
    }

    static Timestamp getTimestamp() {
        ZoneId zoneIdShanghai = ZoneId.of("Asia/Shanghai");
        String o = "1970-01-01T00:00:00.008";
        String dateString = String.valueOf(o);
        long value = string2long(dateString, zoneIdShanghai);
        System.out.println(value);
        return new Timestamp(value);
    }

    public static void main(String[] args) throws Exception {
        Connection connection = DruidUtil.getConn();
        String sql = "insert into TEST_SHANGHAIJCPT_DB_FLINK.info(SID,SNAME,SEX,SER,SEC)values(?,?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        String info = UUID.randomUUID().toString().substring(0, 30);
        preparedStatement.setString(1, info);
        preparedStatement.setString(2, info);
        preparedStatement.setString(3, info);
        preparedStatement.setTimestamp(4, null);
        preparedStatement.setString(5, "我们是");
        preparedStatement.execute();
    }
}


