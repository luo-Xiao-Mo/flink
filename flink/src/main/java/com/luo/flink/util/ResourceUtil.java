package com.luo.flink.util;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.google.common.base.Charsets;
import com.google.common.io.Resources;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;

@Slf4j
public class ResourceUtil {


    /**
     * 读取资源文件信息
     *
     * @param filesName 读取的资源文件名称
     **/
    public static Properties readPro(String filesName) {
        Properties pro = new Properties();
        InputStream in = ResourceUtil.class.getClassLoader()
                .getResourceAsStream(filesName);
        try {
            pro.load(in);
        } catch (IOException e) {
            log.error("加载配置文件异常");
        }
        return pro;
    }

    public static JSONArray readJson() {
        ClassLoader classLoader = ReflectUtil.class.getClassLoader();
        JSONObject jsonObject = new JSONObject();
        JSONArray jsonArray = null;
        try {
            Enumeration<URL> resources = classLoader.getResources("task.json");
            if (resources.hasMoreElements()) {
                URL url = resources.nextElement();
                String json = Resources.toString(url, Charsets.UTF_8);
                jsonObject.putAll(JSON.parseObject(json));
            }
        } catch (Exception e) {
            log.error("读取任务文件异常", e.getMessage());
        }
        if (!jsonObject.isEmpty()) {
            jsonArray = jsonObject.getJSONArray("task");
        }
        return jsonArray;
    }
}
