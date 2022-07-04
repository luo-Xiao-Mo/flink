package com.luo.flink.main;

import com.luo.flink.entity.business.Info;
import com.luo.flink.service.AbstractService;
import com.luo.flink.service.InfoService;
import org.apache.flink.configuration.Configuration;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.table.api.TableResult;
import org.apache.flink.table.api.bridge.java.StreamTableEnvironment;


public class SourceSql {

    public static void main(String[] args) {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        env.setParallelism(1);
        env.disableOperatorChaining();
        StreamTableEnvironment tableEnv = StreamTableEnvironment.create(env);
        Configuration configuration = tableEnv.getConfig().getConfiguration();
        configuration.setString("table.exec.sink.not-null-enforcer", "drop");
        tableEnv.executeSql("CREATE TABLE info (\n" +
                "     SID INT,\n" +
                "     SNAME STRING,\n" +
                "     SEX STRING,\n" +
                "     PRIMARY KEY(SID) NOT ENFORCED\n" +
                "     ) WITH (\n" +
                "     'connector' = 'oracle-cdc',\n" +
                "     'hostname' = 'localhost',\n" +
                "     'port' = '1521',\n" +
                "     'username' = 'family',\n" +
                "     'password' = 'zyhcdc',\n" +
                "     'database-name' = 'XE',\n" +
                "     'schema-name' = 'FAMILY',\n" +
                "     'table-name' = 'INFO',\n" +
                "     'debezium.log.mining.continuous.mine'='true',\n" +
                "     'debezium.log.mining.strategy'='online_catalog',\n" +
                "     'debezium.database.tablename.case.insensitive'='false',\n" +
                "     'scan.startup.mode' = 'initial')");
        TableResult tableResult = tableEnv.executeSql("select * from info");
        AbstractService<Info> abstractService = new InfoService();

        tableResult.collect().forEachRemaining(item -> {
            Info info = Info.builder().king(item.getKind().shortString())
                    .SEX(String.valueOf(item.getField("SEX")))
                    .SID(String.valueOf(item.getField("SID")))
                    .SNAME(String.valueOf(item.getField("SNAME")))
                    .build();
            abstractService.invoke(info);
        });
    }
}






