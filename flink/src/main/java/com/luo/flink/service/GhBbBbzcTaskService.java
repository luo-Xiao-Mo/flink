package com.luo.flink.service;

import com.luo.flink.entity.business.GhBbBbzc;
import com.luo.flink.entity.business.Info;
import org.apache.flink.table.api.TableResult;
import org.apache.flink.table.api.bridge.java.StreamTableEnvironment;

import java.sql.Blob;
import java.sql.Clob;
import java.sql.Timestamp;

public class GhBbBbzcTaskService extends AbstractTaskService{
    @Override
    String getSql() {
        return "CREATE TABLE GH_BB_BBZC (\n" +
                "reportid  STRING   ,\n" +
                "bh  STRING   ,\n" +
                "dcfffldm  STRING   ,\n" +
                "bbzwqc  STRING   ,\n" +
                "bbywqc  STRING   ,\n" +
                "bbzwjc  STRING   ,\n" +
                "bb  STRING   ,\n" +
                "bblx  STRING   ,\n" +
                "zyfldm  STRING   ,\n" +
                "zgzy  STRING   ,\n" +
                "tbsm  STRING   ,\n" +
                "wh  STRING   ,\n" +
                "dcnr  STRING   ,\n" +
                "dcpddm  STRING   ,\n" +
                "dcpdms  STRING   ,\n" +
                "qysj  TIMESTAMP(6)   ,\n" +
                "tysj  TIMESTAMP(6)   ,\n" +
                "yxqz  DATE   ,\n" +
                "bbsx  FLOAT   ,\n" +
                "txsj  FLOAT   ,\n" +
                "txsjms  STRING   ,\n" +
                "bbztdm  STRING   ,\n" +
                "bbjb  STRING   ,\n" +
                "spr  STRING   ,\n" +
                "spjg  STRING   ,\n" +
                "pzhjg  STRING   ,\n" +
                "pzwh  STRING   ,\n" +
                "bajg  STRING   ,\n" +
                "bawh  STRING   ,\n" +
                "zbjg  STRING   ,\n" +
                "gljg  STRING   ,\n" +
                "gljgfzr  STRING   ,\n" +
                "wlbmc  STRING   ,\n" +
                "bz  STRING   ,\n" +
                "bzh  STRING   ,\n" +
                "cjr  STRING   ,\n" +
                "cjsj  TIMESTAMP(6)   ,\n" +
                "xgr  STRING   ,\n" +
                "xgsj  TIMESTAMP(6)   ,\n" +
                "tjspsj  TIMESTAMP(6)   ,\n" +
                "sfyxjzlssj  STRING   ,\n" +
                "bbbgsm  STRING   ,\n" +
                "qzbh  STRING   ,\n" +
                "sybbid  STRING   ,\n" +
                "sqbid  STRING   ,\n" +
                "tqbh  STRING   ,\n" +
                "lsbz  STRING   ,\n" +
                "tjdcdxjblxdm  STRING   ,\n" +
                "dclylx  STRING   ,\n" +
                "zbs  BINARY   ,\n" +
                "bywj  BINARY   ,\n" +
                "bdcml  STRING   ,\n" +
                "hzgxyj  BINARY   ,\n" +
                "hzbsjys  BINARY   ,\n" +
                "bbqjbl  BINARY   ,\n" +
                "ms  STRING   ,\n" +
                "spyj  STRING   ,\n" +
                "bfgbbid  STRING   ,\n" +
                "scbz  STRING   ,\n" +
                "sfkwhtbfw  STRING   ,\n" +
                "hzsjls  INT   ,\n" +
                "gzbbbm  STRING   ,\n" +
                "gzmlbm  STRING   ,\n" +
                "sjylx  STRING   ,\n" +
                "cjbm  STRING   ,\n" +
                "bbcjsj  TIMESTAMP(6)   ,\n" +
                "xdr  STRING   ,\n" +
                "xdsj  TIMESTAMP(6)   ,\n" +
                "xdsm  STRING   ,\n" +
                "bbsm  STRING   ,\n" +
                "tbfw  STRING   ,\n" +
                "bbqbdm  STRING   ,\n" +
                "ssrw  STRING   ,\n" +
                "tbsjsm  STRING   ,\n" +
                "bbsyhy  STRING   ,\n" +
                "hzsyjgdm  STRING   ,\n" +
                "sjbs  BINARY   ,\n" +
                "bydx  BINARY   ,\n" +
                "qsfs  STRING   ,\n" +
                "htmlby  BINARY   ,\n" +
                "excelby  BINARY   ,\n" +
                "nbbs  STRING   ,\n" +
                "hzblx  DECIMAL   ,\n" +
                "sjcjfs  STRING   ,\n" +
                "bbfl  STRING   ,\n" +
                "hzbsjbb  STRING   ,\n" +
                "bbzldm  STRING   ,\n" +
                "dcdxlxdm  STRING   ,\n" +
                "tbdyfw  STRING   ,\n" +
                "tbhyfw  STRING   ,\n" +
                "dcdwsl  STRING   ,\n" +
                "bsdw  STRING   ,\n" +
                "bsdwlxdm  STRING   ,\n" +
                "bsfsdm  STRING   ,\n" +
                "hzfsdm  STRING   ,\n" +
                "re_reportid  STRING   ,\n" +
                "sftb  STRING   ,\n" +
                "tjzydm  STRING   ,\n" +
                "sfglb  STRING   ,\n" +
                "sffrb  STRING   ,\n" +
                "has_sq_tq  STRING   ,\n" +
                "set_row_bgcolor  STRING   ,\n" +
                "blockjson  BINARY   ,\n" +
                "tblx  STRING   ,\n" +
                "yw_01  STRING   ,\n" +
                "yw_02  STRING   ,\n" +
                "yw_03  STRING   ,\n" +
                "yw_04  STRING   ,\n" +
                "yw_05  STRING   ,\n" +
                "yw_06  STRING   ,\n" +
                "yw_07  STRING   ,\n" +
                "yw_08  STRING   ,\n" +
                "yw_09  STRING   ,\n" +
                "YW_10  STRING   ,\n" +

                "     PRIMARY KEY(reportid) NOT ENFORCED\n" +
                "     ) WITH (\n" +
                "     'connector' = 'oracle-cdc',\n" +
                "     'hostname' = 'localhost',\n" +
                "     'port' = '1521',\n" +
                "     'username' = 'family',\n" +
                "     'password' = 'zyhcdc',\n" +
                "     'database-name' = 'XE',\n" +
                "     'schema-name' = 'FAMILY',\n" +
                "     'table-name' = 'INFO',\n" +
                "     'debezium.log.mining.continuous.mine'='true',\n" +
                "     'debezium.log.mining.strategy'='online_catalog',\n" +
                "     'debezium.database.tablename.case.insensitive'='false',\n" +
                "     'scan.startup.mode' = 'initial')";
    }

    @Override
    TableResult getTableResult(StreamTableEnvironment tableEnv) {
        return tableEnv.executeSql("select * from GH_BB_BBZC");
    }

    @Override
    void handlerTableResult(TableResult tableResult) {
        AbstractService<GhBbBbzc> abstractService = new GhBbBbzcService();
        tableResult.collect().forEachRemaining(item -> {
            GhBbBbzc info = GhBbBbzc.builder().king(item.getKind().shortString())
                    .reportid(String.valueOf(item.getField("REPORTIDSEX")))
                    .bh(String.valueOf(item.getField("BH")))
                    .dcfffldm(String.valueOf(item.getField("DCFFFLDM")))
                    .bbzwqc(String.valueOf(item.getField("BBZWQC")))
                    .bbywqc(String.valueOf(item.getField("BBYWQC")))
                    .bbzwjc(String.valueOf(item.getField("BBZWJC")))
                    .bb(String.valueOf(item.getField("BB")))
                    .bblx(String.valueOf(item.getField("BBLX")))
                    .zyfldm(String.valueOf(item.getField("ZYFLDM")))
                    .zgzy(String.valueOf(item.getField("ZGZY")))
                    .tbsm(String.valueOf(item.getField("TBSM")))
                    .wh(String.valueOf(item.getField("WH")))
                    .dcnr(String.valueOf(item.getField("DCNR")))
                    .dcpddm(String.valueOf(item.getField("DCPDDM")))
                    .dcpdms(String.valueOf(item.getField("DCPDMS")))
                    .qysj((Timestamp)(item.getField("QYSJ")))
                    .tysj((Timestamp)(item.getField("TYSJ")))
                    .yxqz((Timestamp)(item.getField("YXQZ")))
                    .bbsx((Float) item.getField("BBSX"))
                    .txsj((Float) item.getField("TXSJ"))
                    .txsjms(String.valueOf(item.getField("TXSJMS")))
                    .bbztdm(String.valueOf(item.getField("BBZTDM")))
                    .bbjb(String.valueOf(item.getField("BBJB")))
                    .spr(String.valueOf(item.getField("SPR")))
                    .spjg(String.valueOf(item.getField("SPJG")))
                    .pzhjg(String.valueOf(item.getField("PZHJG")))
                    .pzwh(String.valueOf(item.getField("PZWH")))
                    .bajg(String.valueOf(item.getField("BAJG")))
                    .bawh(String.valueOf(item.getField("BAWH")))
                    .zbjg(String.valueOf(item.getField("ZBJG")))
                    .gljg(String.valueOf(item.getField("GLJG")))
                    .gljgfzr(String.valueOf(item.getField("GLJGFZR")))
                    .wlbmc(String.valueOf(item.getField("WLBMC")))
                    .bz(String.valueOf(item.getField("BZ")))
                    .bzh(String.valueOf(item.getField("BZH")))
                    .cjr(String.valueOf(item.getField("CJR")))
                    .cjsj((Timestamp) item.getField("CJSJ"))
                    .xgr(String.valueOf(item.getField("XGR")))
                    .xgsj((Timestamp) item.getField("XGSJ"))
                    .tjspsj((Timestamp) item.getField("TJSPSJ"))
                    .sfyxjzlssj(String.valueOf(item.getField("SFYXJZLSSJ")))
                    .bbbgsm(String.valueOf(item.getField("BBBGSM")))
                    .qzbh(String.valueOf(item.getField("QZBH")))
                    .sybbid(String.valueOf(item.getField("SYBBID")))
                    .sqbid(String.valueOf(item.getField("SQBID")))
                    .tqbh(String.valueOf(item.getField("TQBH")))
                    .lsbz(String.valueOf(item.getField("LSBZ")))
                    .tjdcdxjblxdm(String.valueOf(item.getField("TJDCDXJBLXDM")))
                    .dclylx(String.valueOf(item.getField("DCLYLX")))
                    .zbs((Blob) item.getField("ZBS"))
                    .bywj((Clob) item.getField("BYWJ"))
                    .bdcml(String.valueOf(item.getField("BDCML")))
                    .hzgxyj((Blob) item.getField("HZGXYJ"))
                    .hzbsjys((Blob) item.getField("HZBSJYS"))
                    .bbqjbl((Blob) item.getField("BBQJBL"))
                    .ms(String.valueOf(item.getField("MS")))
                    .spyj(String.valueOf(item.getField("SPYJ")))
                    .bfgbbid(String.valueOf(item.getField("BFGBBID")))
                    .scbz(String.valueOf(item.getField("SCBZ")))
                    .sfkwhtbfw(String.valueOf(item.getField("SFKWHTBFW")))
                    .hzsjls((Integer) item.getField("HZSJLS"))
                    .gzbbbm(String.valueOf(item.getField("GZBBBM")))
                    .gzmlbm(String.valueOf(item.getField("GZMLBM")))
                    .sjylx((Timestamp) item.getField("SJYLX"))
                    .cjbm(String.valueOf(item.getField("CJBM")))
                    .bbcjsj((Timestamp) item.getField("BBCJSJ"))
                    .xdr(String.valueOf(item.getField("XDR")))
                    .xdsj((Timestamp) item.getField("XDSJ"))
                    .xdsm(String.valueOf(item.getField("XDSM")))
                    .bbsm(String.valueOf(item.getField("BBSM")))
                    .tbfw(String.valueOf(item.getField("TBFW")))
                    .bbqbdm(String.valueOf(item.getField("BBQBDM")))
                    .ssrw(String.valueOf(item.getField("SSRW")))
                    .tbsjsm(String.valueOf(item.getField("TBSJSM")))
                    .bbsyhy(String.valueOf(item.getField("BBSYHY")))
                    .hzsyjgdm(String.valueOf(item.getField("HZSYJGDM")))
                    .sjbs((Blob) item.getField("SJBS"))
                    .bydx((Blob) item.getField("BYDX"))
                    .qsfs(String.valueOf(item.getField("QSFS")))
                    .htmlby((Blob) item.getField("HTMLBY"))
                    .excelby((Blob) item.getField("EXCELBY"))
                    .nbbs(String.valueOf(item.getField("NBBS")))
                    .hzblx((Integer) item.getField("HZBLX"))
                    .sjcjfs(String.valueOf(item.getField("SJCJFS")))
                    .bbfl(String.valueOf(item.getField("BBFL")))
                    .hzbsjbb(String.valueOf(item.getField("HZBSJBB")))
                    .bbzldm(String.valueOf(item.getField("BBZLDM")))
                    .dcdxlxdm(String.valueOf(item.getField("DCDXLXDM")))
                    .tbdyfw(String.valueOf(item.getField("TBDYFW")))
                    .tbhyfw(String.valueOf(item.getField("TBHYFW")))
                    .dcdwsl(String.valueOf(item.getField("DCDWSL")))
                    .bsdw(String.valueOf(item.getField("BSDW")))
                    .bsdwlxdm(String.valueOf(item.getField("BSDWLXDM")))
                    .bsfsdm(String.valueOf(item.getField("BSFSDM")))
                    .hzfsdm(String.valueOf(item.getField("HZFSDM")))
                    .reReportid(String.valueOf(item.getField("RE_REPORTID")))
                    .sftb(String.valueOf(item.getField("SFTB")))
                    .tjzydm(String.valueOf(item.getField("TJZYDM")))
                    .sfglb(String.valueOf(item.getField("SFGLB")))
                    .sffrb(String.valueOf(item.getField("SFFRB")))
                    .hasSqTq(String.valueOf(item.getField("HAS_SQ_TQ")))
                    .setRowBgcolor(String.valueOf(item.getField("SET_ROW_BGCOLOR")))
                    .blockjson((Clob) item.getField("BLOCKJSON"))
                    .tblx(String.valueOf(item.getField("TBLX")))
                    .yw01(String.valueOf(item.getField("YW_01")))
                    .yw02(String.valueOf(item.getField("YW_02")))
                    .yw03(String.valueOf(item.getField("YW_03")))
                    .yw04(String.valueOf(item.getField("YW_04")))
                    .yw05(String.valueOf(item.getField("YW_05")))
                    .yw06(String.valueOf(item.getField("YW_06")))
                    .yw07(String.valueOf(item.getField("YW_07")))
                    .yw08(String.valueOf(item.getField("YW_08")))
                    .yw09(String.valueOf(item.getField("YW_09")))
                    .yw10(String.valueOf(item.getField("YW_10")))
                    .build();
            abstractService.invoke(info);
        });
    }
}
