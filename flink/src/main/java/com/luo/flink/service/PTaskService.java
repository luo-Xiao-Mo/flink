package com.luo.flink.service;

import com.luo.flink.entity.business.P;
import org.apache.flink.table.api.TableResult;
import org.apache.flink.table.api.bridge.java.StreamTableEnvironment;

public class PTaskService extends AbstractTaskService {

    @Override
    String getSql() {
        return "CREATE TABLE p1 (\n" +
                "     ID INT,\n" +
                "     NAME STRING,\n" +
                "     PRIMARY KEY(ID) NOT ENFORCED\n" +
                "     ) WITH (\n" +
                "     'connector' = 'oracle-cdc',\n" +
                "     'hostname' = 'localhost',\n" +
                "     'port' = '1521',\n" +
                "     'username' = 'family',\n" +
                "     'password' = 'zyhcdc',\n" +
                "     'database-name' = 'XE',\n" +
                "     'schema-name' = 'FAMILY',\n" +
                "     'table-name' = 'p1',\n" +
                "     'debezium.log.mining.continuous.mine'='true',\n" +
                "     'debezium.log.mining.strategy'='online_catalog',\n" +
                "     'debezium.database.tablename.case.insensitive'='false',\n" +
                "     'scan.startup.mode' = 'initial')";
    }

    @Override
    TableResult getTableResult(StreamTableEnvironment tableEnv) {
        return tableEnv.executeSql("select * from p1");
    }

    @Override
    void handlerTableResult(TableResult tableResult) {
        AbstractService<P> abstractService = new PService();
        tableResult.collect().forEachRemaining(item -> {
            P p = P.builder().king(item.getKind().shortString())
                    .ID(String.valueOf(item.getField("ID")))
                    .NAME(String.valueOf(item.getField("NAME")))
                    .build();
            abstractService.invoke(p);
        });
    }
}
