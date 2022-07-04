package com.luo.flink.sink;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.luo.flink.entity.ArchiveLog;
import com.luo.flink.entity.Table;
import org.apache.commons.lang3.StringUtils;

public class JdbcEngine implements Engine {

    private static final long serialVersionUID = 1L;

    @Override
    public String insert(ArchiveLog log, Table table) {
        validate(table);
        JSONObject afterObj = JSON.parseObject(log.getAfter());
        StringBuilder keyBuilder = new StringBuilder();
        StringBuilder valueBuilder = new StringBuilder();
        for (String item : afterObj.keySet()) {
            keyBuilder.append(item).append(",");
            valueBuilder.append("'").append(afterObj.get(item)).append("'").append(",");
        }
        String key = keyBuilder.substring(0, keyBuilder.length() - 1);
        String value = valueBuilder.substring(0, valueBuilder.length() - 1);
        return "insert into " + table.getTableName() + "(" + key + ") values(" + value + ")";
    }

    @Override
    public String update(ArchiveLog log, Table table) {
        validate(table);
        JSONObject afterObj = JSON.parseObject(log.getAfter());
        StringBuilder updateBuilder = new StringBuilder();
        StringBuilder idBuilder = new StringBuilder();
        for (String item : afterObj.keySet()) {
            if (item.equalsIgnoreCase(table.getKey())) {
                idBuilder.append("'").append(afterObj.get(item)).append("'");
            } else {
                updateBuilder.append(item).append("=").append("'").append(afterObj.get(item)).append("'").append(",");
            }
        }
        String keyValue = updateBuilder.substring(0, updateBuilder.length() - 1);
        String id = idBuilder.toString();
        return "update " + table.getTableName() + " set " + keyValue + " where " + table.getKey() + " = " + id;
    }


    @Override
    public String delete(ArchiveLog log, Table table) {
        validate(table);
        String before = log.getBefore();
        JSONObject deleteObj = JSON.parseObject(before);
        String id = deleteObj.get(table.getKey()).toString();
        return "delete from " + table.getTableName() + " where " + table.getKey() + " = " + id;

    }

    private void validate(Table table) {
        if (table == null) throw new IllegalArgumentException("表格对象不能为空");
        if (StringUtils.isEmpty(table.getTableName()) || StringUtils.isEmpty(table.getKey())) {
            throw new RuntimeException("表名称和表格主键不能为空");
        }
    }
}
