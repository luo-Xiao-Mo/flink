package com.luo.flink.service;

import com.luo.flink.type.OperateType;
import com.luo.flink.util.DruidUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;


import java.sql.Connection;
import java.sql.PreparedStatement;


@Slf4j
public abstract class AbstractService<T> implements King<T> {

    private PreparedStatement preparedStatement;

    private Connection connection;

    public void invoke(T info) {
        String kind = getKing(info);
        String sql = null;
        switch (kind) {
            case OperateType.ADD_:
                sql = insertSql(info);
                break;
            case OperateType.UPDATE_:
                sql = updateSql(info);
                break;
            case OperateType.DELETE_:
                sql = deleteSql(info);
                break;
            default:
                break;
        }
        if (StringUtils.isEmpty(sql)) return;
        try {
            connection = DruidUtil.getConn();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.execute();
        } catch (Exception e) {
            log.error(e.getMessage());
        } finally {
            DruidUtil.close(connection, preparedStatement);
        }
    }

    abstract String insertSql(T info);

    abstract String updateSql(T info);

    abstract String deleteSql(T info);

}



