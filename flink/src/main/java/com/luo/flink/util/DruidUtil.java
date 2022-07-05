package com.luo.flink.util;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import lombok.extern.slf4j.Slf4j;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;


@Slf4j
public class DruidUtil {

    private static DataSource ds;

    static {
        try {
            Properties pro = ResourceUtil.readPro("druid.properties");
//            Properties pro = ResourceUtil.readPro("local.properties");
            ds = DruidDataSourceFactory.createDataSource(pro);
        } catch (Exception e) {
            log.error(String.format("创建数据库连接池失败:【%s】", e.getMessage()));
        }
    }

    /**
     * 获取连接  直接使用数据库连接池对象条用getConnection()方法
     */
    public static Connection getConn() throws Exception {
        return ds.getConnection();
    }

    /**
     * 释放资源
     *
     * @param conn 连接对象
     * @param stm  执行对象
     * @param rs   结果集对象
     */
    private static void close(Connection conn, Statement stm, ResultSet rs) {
        try {
            if (conn != null) conn.close();
        } catch (Exception e) {
            log.error(String.format("关闭连接对象异常:【%s】", e.getMessage()));
        }
        try {
            if (stm != null) stm.close();
        } catch (Exception e) {
            log.error(String.format("关闭执行对象异常:【%s】", e.getMessage()));
        }
        try {
            if (rs != null) rs.close();
        } catch (Exception e) {
            log.error(String.format("关闭结果集对象异常:【%s】", e.getMessage()));
        }
    }

    /**
     * 重载close方法
     */
    public static void close(Connection conn, Statement stm) {
        close(conn, stm, null);
    }
}

