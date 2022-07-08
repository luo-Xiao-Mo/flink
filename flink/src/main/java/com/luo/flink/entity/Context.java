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
        readTask();
        //只有任务不为空,才会初始化线程池执行任务
        if (serviceList != null && !serviceList.isEmpty()) {
            executorService = new ThreadPoolExecutor(serviceList.size(), serviceList.size(),
                    0L, TimeUnit.MICROSECONDS, new LinkedBlockingQueue<>());
        }
    }

    /**
     * 任务执行方法
     * 默认一个线程一个任务
     */
    public void exec() {
        if (serviceList != null && !serviceList.isEmpty()) {
            serviceList.forEach(item -> executorService.submit(new SqlTask(item)));
        }
    }

    /**
     * 反射读取所有任务类的子类
     */
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

    /**
     * 配置文件读取当前的执行任务类初始化
     */
    private static void readTask() {
        JSONArray jsonArray = ResourceUtil.readJson();
        if (jsonArray != null) {
            for (Object item : jsonArray) {
                try {
                    Class<?> aClass = Class.forName(item.toString());
                    if (!AbstractTaskService.class.isAssignableFrom(aClass)) {
                        throw new RuntimeException("当前配置信息不是任务类类型");
                    }
                    serviceList.add((AbstractTaskService) aClass.newInstance());
                } catch (Exception e) {
                    log.error(String.format("初始化任务类异常:【%s】", e.getMessage()));
                }
            }
        }
    }
}
