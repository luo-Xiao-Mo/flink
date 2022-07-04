package com.luo.flink.entity;

import com.luo.flink.service.AbstractTaskService;

public class SqlTask implements Runnable {

    public AbstractTaskService abstractTaskService;

    public SqlTask(AbstractTaskService abstractTaskService) {
        this.abstractTaskService = abstractTaskService;
    }

    @Override
    public void run() {
        abstractTaskService.exec();
    }
}
