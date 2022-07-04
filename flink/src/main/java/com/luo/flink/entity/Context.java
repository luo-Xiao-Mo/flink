package com.luo.flink.entity;

import com.luo.flink.service.AbstractTaskService;
import com.luo.flink.service.InfoTaskService;
import com.luo.flink.service.PTaskService;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Context {

    private static List<AbstractTaskService> serviceList = new ArrayList<>();


    private static ExecutorService executorService;

    static {
        serviceList.add(new InfoTaskService());
        serviceList.add(new PTaskService());
        executorService = new ThreadPoolExecutor(serviceList.size(), serviceList.size(),
                0L, TimeUnit.MICROSECONDS, new LinkedBlockingQueue<>());
    }

    public void exec() {
        if (serviceList != null && !serviceList.isEmpty()) {
            serviceList.forEach(item -> {
                SqlTask sqlTask = new SqlTask(item);
                executorService.submit(sqlTask);
            });
        }
    }
}
