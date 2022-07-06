package com.luo.flink.entity;

import com.alibaba.fastjson.JSONArray;
import com.luo.flink.service.task.AbstractTaskService;
import com.luo.flink.util.ReflectUtil;
import com.luo.flink.util.ResourceUtil;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@Slf4j
public class Context {

    private static List<AbstractTaskService> serviceList = new ArrayList<>();


    private static ExecutorService executorService;

    static {
//        addTaskService();
        readTask();
        if (serviceList != null && !serviceList.isEmpty()) {
            executorService = new ThreadPoolExecutor(serviceList.size(), serviceList.size(),
                    0L, TimeUnit.MICROSECONDS, new LinkedBlockingQueue<>());
        }
    }

    public void exec() {
        if (serviceList != null && !serviceList.isEmpty()) {
            serviceList.forEach(item -> {
                SqlTask sqlTask = new SqlTask(item);
                executorService.submit(sqlTask);
            });
        }
    }

    private static void addTaskService() {
        Set<Class> classes = ReflectUtil.getSub(AbstractTaskService.class);
        if (classes != null && !classes.isEmpty()) {
            for (Class c : classes) {
                try {
                    serviceList.add((AbstractTaskService) c.newInstance());
                } catch (Exception e) {
                    log.error(String.format("反射异常:【%s】", e.getMessage()));
                }
            }
        }
    }

    private static void readTask() {
        JSONArray jsonArray = ResourceUtil.readJson();
        if (jsonArray != null) {
            for (Object item : jsonArray) {
                try {
                    Class<?> aClass = Class.forName(item.toString());
                    serviceList.add((AbstractTaskService) aClass.newInstance());
                } catch (Exception e) {
                    log.error(String.format("初始化任务类异常:【%s】", e.getMessage()));
                }
            }
        }
    }
}
