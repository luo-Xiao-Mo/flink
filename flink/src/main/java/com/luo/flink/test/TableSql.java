package com.luo.flink.test;

import com.alibaba.fastjson.JSON;
import com.luo.flink.entity.business.GyMlTjzy;
import com.luo.flink.service.dao.AbstractService;
import com.luo.flink.service.dao.GyMlTjzyService;
import org.apache.flink.configuration.Configuration;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.table.api.TableResult;
import org.apache.flink.table.api.bridge.java.StreamTableEnvironment;

public class TableSql {

    public static void main(String[] args) {

        Configuration configuration = new Configuration();
        configuration.setString("table.exec.sink.not-null-enforce", "drop");
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment(configuration);
        //final StreamExecutionEnvironment env = StreamExecutionEnvironment.createLocalEnvironment();
        StreamTableEnvironment tableEnv = StreamTableEnvironment.create(env);

//        Configuration configuration = tableEnv.getConfig().getConfiguration();
//        configuration.setString("table.exec.sink.not-null-enforcer", "drop");
        String creatSql = "CREATE TABLE GY_ML_TJZY (\n" +
                "     CODE STRING,\n" +
                "     NAME STRING,\n" +
                "     PRIMARY KEY(CODE) NOT ENFORCED\n" +
                "     ) WITH (\n" +
                "     'connector' = 'oracle-cdc',\n" +
                "     'hostname' = '172.10.120.86',\n" +
                "     'port' = '1521',\n" +
                "     'username' = 'TEST_SHANGHAIJCPT_DB_FLINK',\n" +
                "     'password' = 'Abc123!@Gwssi',\n" +
                "     'database-name' = 'ora12c',\n" +
                "     'schema-name' = 'TEST_SHANGHAIJCPT_DB_FLINK',\n" +
                "     'table-name' = 'GY_ML_TJZY',\n" +
                "     'debezium.log.mining.continuous.mine'='true',\n" +
                "     'debezium.log.mining.strategy'='online_catalog',\n" +
                "     'debezium.database.tablename.case.insensitive'='false',\n" +
                "     'scan.startup.mode' = 'initial')";
        tableEnv.executeSql(creatSql);
        TableResult tableResult = tableEnv.executeSql("select * from GY_ML_TJZY");

        AbstractService<GyMlTjzy> abstractService = new GyMlTjzyService();
        tableResult.collect().forEachRemaining(item -> {
            GyMlTjzy info = GyMlTjzy.builder().king(item.getKind().shortString())
                    .CODE(String.valueOf(item.getField("CODE")))
                    .NAME(String.valueOf(item.getField("NAME")))
                    .build();
            System.out.println(JSON.toJSONString(info));

//            abstractService.invoke(info);
        });

        tableResult.print();
    }
}
