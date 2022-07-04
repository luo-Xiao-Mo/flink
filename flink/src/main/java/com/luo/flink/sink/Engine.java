package com.luo.flink.sink;

import com.luo.flink.entity.ArchiveLog;
import com.luo.flink.entity.Table;

import java.io.Serializable;

public interface Engine extends Serializable {

    /**
     * 新增方法
     *
     * @param log   oracle 日志对象信息
     * @param table 目标表对象信息
     */
    String insert(ArchiveLog log, Table table);

    /**
     * 修改方法
     *
     * @param log   oracle 日志对象信息
     * @param table 目标表对象信息
     */
    String update(ArchiveLog log, Table table);

    /**
     * 删除方法
     *
     * @param log   oracle 日志对象信息
     * @param table 目标表对象信息
     */
    String delete(ArchiveLog log, Table table);
}
