package com.luo.flink.entity.business;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Blob;
import java.sql.Clob;
import java.sql.Timestamp;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Info {

    private String king;
    private String SID;
    private String SNAME;
    private String SEX;
    private Timestamp MYDATE;
}
