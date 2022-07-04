package com.luo.flink.main;

import com.luo.flink.entity.Table;
import com.luo.flink.entity.Task;
import com.luo.flink.sink.OracleSink;
import com.luo.flink.util.DruidUtil;
import org.apache.flink.streaming.api.functions.sink.RichSinkFunction;

import java.sql.Connection;
import java.sql.PreparedStatement;


public class SourceStream {


    public static void main(String[] args) throws Exception {
        Table table = new Table("TEST_SHANGHAIJCPT_DB_FLINK.MESSAGE", "SID");
        RichSinkFunction<String> oracleSink = new OracleSink(table);
        Task task = Task.builder()
                .richSinkFunction(oracleSink)
                .schema("FAMILY")
                .tableName("FAMILY.INFO")
                .build();
        task.exec();

    }
}


