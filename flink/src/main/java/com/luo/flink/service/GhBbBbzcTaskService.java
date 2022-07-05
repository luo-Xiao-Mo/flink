package com.luo.flink.service;

import org.apache.flink.table.api.TableResult;
import org.apache.flink.table.api.bridge.java.StreamTableEnvironment;

public class GhBbBbzcTaskService extends AbstractTaskService{
    @Override
    String getSql() {
        return null;
    }

    @Override
    TableResult getTableResult(StreamTableEnvironment tableEnv) {
        return null;
    }

    @Override
    void handlerTableResult(TableResult tableResult) {

    }
}
