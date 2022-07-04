package com.luo.flink.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Table implements Serializable {

    private static final long serialVersionUID = 1L;
    //当前表输出的表名
    private String tableName;
    //主键表输出的主键
    private String key;
}
