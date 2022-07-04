package com.luo.flink.util;

import org.reflections.Reflections;

import java.util.Set;

public class ReflectUtil {


    private static Reflections reflections = new Reflections("com.luo.flink.*");

    @SuppressWarnings("unchecked")
    public static Set<Class> getSub(Class c) {
        return reflections.getSubTypesOf(c);
    }
}
