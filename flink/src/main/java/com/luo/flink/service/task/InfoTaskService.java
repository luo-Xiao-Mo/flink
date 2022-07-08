package com.luo.flink.service.task;

import com.luo.flink.entity.business.Info;
import com.luo.flink.service.dao.AbstractService;
import com.luo.flink.service.dao.InfoService;
import org.apache.flink.table.api.TableResult;
import org.apache.flink.table.api.bridge.java.StreamTableEnvironment;

public class InfoTaskService extends AbstractTaskService {
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

    @Override
    String getSql() {
        return freeTemplate.setFreeName("info").generateStr();
    }

    @Override
    TableResult getTableResult(StreamTableEnvironment tableEnv) {
        return defaultTableResult(tableEnv);
    }
}
