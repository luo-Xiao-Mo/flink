package com.luo.flink.entity;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ArchiveLogSource {
    private String version;
    private String connector;
    private String name;
    private String ts_ms;
    private String snapshot;
    private String db;
    private String sequence;
    private String schema;
    private String table;
    private String txId;
    private String scn;
    private String commit_scn;
    private String lcr_position;
}


