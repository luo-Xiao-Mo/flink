package com.luo.flink.entity.business;

import lombok.Builder;
import lombok.Data;

import java.sql.Blob;
import java.sql.Clob;

@Builder
@Data
public class InfoJoinyMlTjzy {

    private String king;
    private String code;
    private String name;

    private String SID;
    private String SNAME;
    private String SEX;
    private Blob b1;
    private Clob c1;

}
