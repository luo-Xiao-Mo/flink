package com.luo.flink.service.task;

import com.alibaba.fastjson.JSON;
import com.luo.flink.entity.business.GyMlTjzy;
import com.luo.flink.service.dao.AbstractService;
import com.luo.flink.service.dao.GyMlTjzyService;
import org.apache.flink.table.api.TableResult;
import org.apache.flink.table.api.bridge.java.StreamTableEnvironment;

public class GyMlTjzyTaskService extends AbstractTaskService {
    @Override
    String getSql() {
        return "CREATE TABLE GY_ML_TJZY (\n" +
                "     CODE STRING,\n" +
                "     NAME STRING,\n" +
                "     PRIMARY KEY(CODE) NOT ENFORCED\n" +
                "     ) WITH (\n" +
                "     'connector' = 'oracle-cdc',\n" +
                "     'hostname' = 'localhost',\n" +
                "     'port' = '1521',\n" +
                "     'username' = 'family',\n" +
                "     'password' = 'zyhcdc',\n" +
                "     'database-name' = 'XE',\n" +
                "     'schema-name' = 'FAMILY',\n" +
                "     'table-name' = 'GY_ML_TJZY',\n" +
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
        AbstractService<GyMlTjzy> abstractService = new GyMlTjzyService();
        tableResult.collect().forEachRemaining(item -> {
            GyMlTjzy info = GyMlTjzy.builder().king(item.getKind().shortString())
                    .code(String.valueOf(item.getField("CODE")))
                    .name(String.valueOf(item.getField("NAME")))
                    .build();
            System.out.println(JSON.toJSONString(info));
            abstractService.invoke(info);
        });
    }
}
