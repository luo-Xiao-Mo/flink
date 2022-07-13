package com.luo.flink.service.dao;

import com.luo.flink.service.King;
import com.luo.flink.type.OperateType;
import com.luo.flink.util.DruidUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;


@Slf4j
public abstract class AbstractService<T> implements King<T> {

    PreparedStatement preparedStatement;

    Connection connection;

    public void invoke(T info) {
        String kind = getKing(info);
        String sql = null;
        try {
            connection = DruidUtil.getConn();
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
            System.out.println(sql);
            connection = DruidUtil.getConn();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            log.error(e.getMessage());
        } finally {
            DruidUtil.close(connection, preparedStatement);
        }
    }

    String ifNotNull(Object obj) {
        if (obj instanceof String) {
            return "null".equals(obj) ? "null" : "'" + obj + "'";
        } else if (obj instanceof Timestamp) {
            return obj == null ? "null" : "'" + obj + "'";
        }
        return null;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    abstract String insertSql(T info) throws SQLException;

    abstract String updateSql(T info) throws SQLException;

    abstract String deleteSql(T info) throws SQLException;

}



