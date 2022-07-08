package com.luo.flink.template;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.TypeReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TemplateEntity {
    //flink表的表名称
    private String infoName;
    //flink表的主键
    private String pkey;
    //flink表的数据库名称
    private String dataBaseName;
    //flink表的schem名称
    private String schemName;
    //flink表的源表名称
    private String tableName;
    //flink表的属性名称
    private JSONArray properties;


    public Map<String, Object> entityToMap() {
        return JSON.parseObject(JSON.toJSONString(this),
                new TypeReference<Map<String, Object>>() {
                });
    }
}
