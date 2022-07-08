package com.luo.flink.util;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.google.common.base.Charsets;
import com.google.common.io.Resources;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Enumeration;
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
        JSONObject jsonObject = readJson("task.json");
        JSONArray jsonArray = null;
        if (!jsonObject.isEmpty()) {
            jsonArray = jsonObject.getJSONArray("task");
        }
        return jsonArray;
    }

    public static JSONObject readJson(String sourceName) {
        if (StringUtils.isEmpty(sourceName)) throw new IllegalArgumentException("文件名称不能为空");
        ClassLoader classLoader = ReflectUtil.class.getClassLoader();
        JSONObject jsonObject = new JSONObject();

        try {
            Enumeration<URL> resources = classLoader.getResources(sourceName);
            if (resources.hasMoreElements()) {
                URL url = resources.nextElement();
                String json = Resources.toString(url, Charsets.UTF_8);
                jsonObject.putAll(JSON.parseObject(json));
            }
        } catch (Exception e) {
            log.error("读取任务文件异常", e.getMessage());
        }
        return jsonObject;
    }
}
