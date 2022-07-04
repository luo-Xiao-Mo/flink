package com.luo.flink.main;

import com.luo.flink.entity.Table;
import com.luo.flink.entity.Task;
import com.luo.flink.sink.OracleSink;
import org.apache.flink.streaming.api.functions.sink.RichSinkFunction;


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


