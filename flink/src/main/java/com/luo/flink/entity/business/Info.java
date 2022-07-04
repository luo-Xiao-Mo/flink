package com.luo.flink.entity.business;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Info {

    private String king;
    private String SID;
    private String SNAME;
    private String SEX;
}
