package com.luo.flink.template;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.common.base.Joiner;
import com.luo.flink.util.ResourceUtil;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import lombok.extern.slf4j.Slf4j;

import java.io.*;
import java.util.Map;
import java.util.Properties;

@Slf4j
public class FreeTemplate {

    private volatile static FreeTemplate instance;
    private Configuration configuration;
    private String freeName;

    public String getFreeName() {
        return freeName;
    }

    public FreeTemplate setFreeName(String freeName) {
        this.freeName = freeName;
        return this;
    }

    public static FreeTemplate getInstance() {
        if (instance == null) {
            synchronized (FreeTemplate.class) {
                if (instance == null) {
                    instance = new FreeTemplate();
                }
            }
        }
        return instance;
    }

    /**
     * 模版私有构造方法
     */
    private FreeTemplate() {
        configuration = new Configuration(Configuration.VERSION_2_3_28);
        configuration.setDefaultEncoding("utf-8");
        configuration.setClassForTemplateLoading(this.getClass(), "/template");
    }

    public String generateStr() {
        return generateTemplateStr("table.ftl", freeName);
    }

    /**
     * 将模版内容转换为对应的字符串类型
     *
     * @param templatePath 当前的模版路径
     */
    private String generateTemplateStr(String templatePath, String type) {
        String content = null;
        try {
            Writer writer = new StringWriter();
            generateTemplate(templatePath, writer, type);
            content = writer.toString();
            writer.flush();
            writer.close();
            return content;
        } catch (Exception e) {
            log.error("加载模版异常:", e.getMessage());
        }
        return content;
    }

    /**
     * 将数据填充回模版
     *
     * @param templatePath 模版文件名称
     * @param writer       流对象
     */
    private void generateTemplate(String templatePath, Writer writer, String type) throws IOException, TemplateException {
        Map<String, Object> map = addMap(type);
        Template template;
        template = configuration.getTemplate(templatePath);
        template.process(map, writer);
    }

    /**
     * 数据map中填写相关数据源的对象信息
     *
     * @param type 数据类型
     */
    private Map<String, Object> addMap(String type) {
        //读取oracle文件信息
        Properties properties = ResourceUtil.readPro("oracleSource.properties");
        //读取当前配置的表属性信息
        JSONObject jsonObject = ResourceUtil.readJson("template/table.json");
        if (jsonObject == null || !jsonObject.containsKey(type)) {
            throw new RuntimeException(String.format("该%s对应的属性信息未配置", type));
        }
        JSONObject o1 = jsonObject.getJSONObject(type);
        TemplateEntity templateEntity = JSONObject.parseObject(JSON.toJSONString(o1),
                TemplateEntity.class);
        Map<String, Object> dataMap = templateEntity.entityToMap();
        dataMap.put("properties", Joiner.on(",").join(templateEntity.getProperties()) + ",");
        dataMap.put("connector", properties.getProperty("connector"));
        dataMap.put("hostName", properties.getProperty("hostName"));
        dataMap.put("port", properties.getProperty("port"));
        dataMap.put("userName", properties.getProperty("username"));
        dataMap.put("password", properties.getProperty("password"));
        return dataMap;
    }
}

