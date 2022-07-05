package com.luo.flink.service;

import com.luo.flink.entity.business.Info;
import org.apache.flink.table.api.TableResult;
import org.apache.flink.table.api.bridge.java.StreamTableEnvironment;

public class GyMlTjzyTaskService extends AbstractTaskService{
    @Override
    String getSql() {
        return "CREATE TABLE GY_ML_TJZY (\n" +
                "     code STRING,\n" +
                "     name STRING,\n" +
                "     PRIMARY KEY(CODE) NOT ENFORCED\n" +
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
                "     'scan.startup.mode' = 'initial')";
    }

    @Override
    TableResult getTableResult(StreamTableEnvironment tableEnv) {
        return tableEnv.executeSql("select * from GY_ML_TJZY");
    }

    @Override
    void handlerTableResult(TableResult tableResult) {
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
