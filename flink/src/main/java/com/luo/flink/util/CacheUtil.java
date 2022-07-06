package com.luo.flink.util;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;


@Slf4j
public class CacheUtil {

    private CacheUtil() {
    }

    private static class Singleton {
        private static final Cache loadingCache = getCache();
    }

    public static Cache getInstance() {
        return Singleton.loadingCache;
    }

    private static Cache<String, Object> getCache() {
        return CacheBuilder.newBuilder()
                .concurrencyLevel(10)
                //设置写缓存后1天过期
                .expireAfterWrite(60 * 24, TimeUnit.MINUTES)
                //设置缓存容器的初始容量为5
                .initialCapacity(5)
                //设置缓存最大容量为2000
                .maximumSize(2000)
                //设置要统计缓存的命中率
                .recordStats()
                //设置缓存的移除通知
                .removalListener(notification -> log.info(notification.getKey() + "被移除了，原因： " +
                        notification.getCause()))
                .build();
    }
}

