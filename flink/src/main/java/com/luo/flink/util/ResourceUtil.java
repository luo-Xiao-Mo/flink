package com.luo.flink.util;


import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.io.InputStream;
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
}
