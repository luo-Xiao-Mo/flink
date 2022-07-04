package com.luo.flink.sink;

import com.alibaba.fastjson.JSON;
import com.luo.flink.entity.ArchiveLog;
import com.luo.flink.entity.Table;
import com.luo.flink.type.OperateType;
import com.luo.flink.util.DruidUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.flink.configuration.Configuration;
import org.apache.flink.streaming.api.functions.sink.RichSinkFunction;

import java.sql.Connection;
import java.sql.PreparedStatement;

@Slf4j
public class OracleSink extends RichSinkFunction<String> {

    private static final long serialVersionUID = 1L;

    private Connection connection;

    private PreparedStatement ps;

    private Table table;

    private Engine engine;


    public OracleSink(Table table) {
        this(new JdbcEngine(), table);
    }

    public OracleSink(Engine engine, Table table) {
        this.table = table;
        this.engine = engine;
    }

    @Override
    public void open(Configuration parameters) throws Exception {
        super.open(parameters);
        connection = DruidUtil.getConn();
    }

    @Override
    public void invoke(String json, Context context) {
        if (StringUtils.isEmpty(json)) throw new IllegalArgumentException("参数不能为空");
        ArchiveLog archiveLog = JSON.parseObject(json, ArchiveLog.class);
        String op = archiveLog.getOp();
        String sql = null;
        switch (op) {
            case OperateType.ADD:
                sql = engine.insert(archiveLog, table);
                break;
            case OperateType.UPDATE:
                sql = engine.update(archiveLog, table);
                break;
            case OperateType.DELETE:
                sql = engine.delete(archiveLog, table);
                break;
            case OperateType.RED:
                sql = engine.insert(archiveLog, table);
                break;
            default:
                break;
        }
        if (StringUtils.isNotEmpty(sql)) {
            try {
                ps = connection.prepareStatement(sql);
                ps.execute();
            } catch (Exception e) {
                System.out.println("执行sql异常:" + e.getMessage());
            }
        }
    }

    @Override
    public void close() throws Exception {
        super.close();
        DruidUtil.close(connection, ps);
    }
}
