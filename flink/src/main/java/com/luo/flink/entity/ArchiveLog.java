package com.luo.flink.entity;

import lombok.Data;
import lombok.ToString;


@Data
@ToString
public class ArchiveLog {
    private String before;
    private String after;
    private ArchiveLogSource source;
    private String op;
    private String ts_ms;
    private String transaction;
}


