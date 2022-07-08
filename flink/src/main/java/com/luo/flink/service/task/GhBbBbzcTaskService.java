package com.luo.flink.service.task;

import com.luo.flink.entity.business.GhBbBbzc;
import com.luo.flink.service.dao.AbstractService;
import com.luo.flink.service.dao.GhBbBbzcService;
import org.apache.flink.table.api.TableResult;
import org.apache.flink.table.api.bridge.java.StreamTableEnvironment;

import java.math.BigDecimal;
import java.sql.Blob;
import java.sql.Clob;

public class GhBbBbzcTaskService extends AbstractTaskService {
    @Override
    String getSql() {
        return "CREATE TABLE GH_BB_BBZC (\n" +
                "REPORTID  STRING   ,\n" +
               "BH  STRING   ,\n" +
                "DCFFFLDM  STRING   ,\n" +
                "BBZWQC  STRING   ,\n" +
                "BBYWQC  STRING   ,\n" +
                "BBZWJC  STRING   ,\n" +
                "BB  STRING   ,\n" +
                "BBLX  STRING   ,\n" +
                "ZYFLDM  STRING   ,\n" +
                "ZGZY  STRING   ,\n" +
                "TBSM  STRING   ,\n" +
                "WH  STRING   ,\n" +
                "DCNR  STRING   ,\n" +
                "DCPDDM  STRING   ,\n" +
                "DCPDMS  STRING   ,\n" +
                 "QYSJ  TIMESTAMP(6)   ,\n" +
                "TYSJ  TIMESTAMP(6)   ,\n" +
                "YXQZ  TIMESTAMP(6)   ,\n" +
                "BBSX  DECIMAL(10,5)   ,\n" +
                "TXSJ  DECIMAL(10,5)   ,\n" +
                "TXSJMS  STRING   ,\n" +
                "BBZTDM  STRING   ,\n" +
                "BBJB  STRING   ,\n" +
                "SPR  STRING   ,\n" +
                "SPJG  STRING   ,\n" +
                "PZHJG  STRING   ,\n" +
                "PZWH  STRING   ,\n" +
                "BAJG  STRING   ,\n" +
                "BAWH  STRING   ,\n" +
                "ZBJG  STRING   ,\n" +
                "GLJG  STRING   ,\n" +
                "GLJGFZR  STRING   ,\n" +
                "WLBMC  STRING   ,\n" +
                "BZ  STRING   ,\n" +
                "BZH  STRING   ,\n" +
                "CJR  STRING   ,\n" +
                "CJSJ  TIMESTAMP(6)   ,\n" +
                "XGR  STRING   ,\n" +
                "XGSJ  TIMESTAMP(6)   ,\n" +
                "TJSPSJ  TIMESTAMP(6)   ,\n" +
                "SFYXJZLSSJ  STRING   ,\n" +
                "BBBGSM  STRING   ,\n" +
                "QZBH  STRING   ,\n" +
                "SYBBID  STRING   ,\n" +
                "SQBID  STRING   ,\n" +
                "TQBH  STRING   ,\n" +
                "LSBZ  STRING   ,\n" +
                "TJDCDXJBLXDM  STRING   ,\n" +
                "DCLYLX  STRING   ,\n" +
                "ZBS   BINARY(500)   ,\n" +
                "BYWJ   BINARY(500)   ,\n" +
                "BDCML  STRING   ,\n" +
                "HZGXYJ   BINARY(500)   ,\n" +
                "HZBSJYS   BINARY(500)   ,\n" +
                "BBQJBL   BINARY(500)   ,\n" +
                "MS  STRING   ,\n" +
                "SPYJ  STRING   ,\n" +
                "BFGBBID  STRING   ,\n" +
                "SCBZ  STRING   ,\n" +
                "SFKWHTBFW  STRING   ,\n" +
                "HZSJLS  INT   ,\n" +
                "GZBBBM  STRING   ,\n" +
                "GZMLBM  STRING   ,\n" +
                "SJYLX  STRING   ,\n" +
                "CJBM  STRING   ,\n" +
                "BBCJSJ  TIMESTAMP(6)   ,\n" +
                "XDR  STRING   ,\n" +
                "XDSJ  TIMESTAMP(6)   ,\n" +
                "XDSM  STRING   ,\n" +
                "BBSM  STRING   ,\n" +
                "TBFW  STRING   ,\n" +
                "BBQBDM  STRING   ,\n" +
                "SSRW  STRING   ,\n" +
                "TBSJSM  STRING   ,\n" +
                "BBSYHY  STRING   ,\n" +
                "HZSYJGDM  STRING   ,\n" +
                "SJBS   BINARY(500)   ,\n" +
                "BYDX   BINARY(500)   ,\n" +
                "QSFS  STRING   ,\n" +
                "HTMLBY   BINARY(500)   ,\n" +
                "EXCELBY   BINARY(500)   ,\n" +
                "NBBS  STRING   ,\n" +
                "HZBLX  DECIMAL   ,\n" +
                "SJCJFS  STRING   ,\n" +
                "BBFL  STRING   ,\n" +
                "HZBSJBB  STRING   ,\n" +
                "BBZLDM  STRING   ,\n" +
                "DCDXLXDM  STRING   ,\n" +
                "TBDYFW  STRING   ,\n" +
                "TBHYFW  STRING   ,\n" +
                "DCDWSL  STRING   ,\n" +
                "BSDW  STRING   ,\n" +
                "BSDWLXDM  STRING   ,\n" +
                "BSFSDM  STRING   ,\n" +
                "HZFSDM  STRING   ,\n" +
                "RE_REPORTID  STRING   ,\n" +
                "SFTB  STRING   ,\n" +
                "TJZYDM  STRING   ,\n" +
                "SFGLB  STRING   ,\n" +
                "SFFRB  STRING   ,\n" +
                "HAS_SQ_TQ  STRING   ,\n" +
                "SET_ROW_BGCOLOR  STRING   ,\n" +
                "BLOCKJSON   BINARY(500)   ,\n" +
                "TBLX  STRING   ,\n" +
                "YW_01  STRING   ,\n" +
                "YW_02  STRING   ,\n" +
                "YW_03  STRING   ,\n" +
                "YW_04  STRING   ,\n" +
                "YW_05  STRING   ,\n" +
                "YW_06  STRING   ,\n" +
                "YW_07  STRING   ,\n" +
                "YW_08  STRING   ,\n" +
                "YW_09  STRING   ,\n" +
                "YW_10  STRING   ,\n" +

                "     PRIMARY KEY(REPORTID) NOT ENFORCED\n" +

                "     ) WITH (\n" +
                "     'connector' = 'oracle-cdc',\n" +
                "     'hostname' = '172.10.120.86',\n" +
                "     'port' = '1521',\n" +
                "     'username' = 'TEST_SHANGHAIJCPT_DB_FLINK',\n" +
                "     'password' = 'Abc123!@Gwssi',\n" +
                "     'database-name' = 'ora12c',\n" +
                "     'schema-name' = 'TEST_SHANGHAIJCPT_DB_FLINK',\n" +
                "     'table-name' = 'GH_BB_BBZC',\n" +
                "     'debezium.log.mining.continuous.mine'='true',\n" +
                "     'debezium.log.mining.strategy'='online_catalog',\n" +
                "     'debezium.database.tablename.case.insensitive'='false',\n" +
                "     'scan.startup.mode' = 'initial')";

//                "     ) WITH (\n" +
//                "     'connector' = 'oracle-cdc',\n" +
//                "     'hostname' = 'localhost',\n" +
//                "     'port' = '1521',\n" +
//                "     'username' = 'family',\n" +
//                "     'password' = 'zyhcdc',\n" +
//                "     'database-name' = 'XE',\n" +
//                "     'schema-name' = 'FAMILY',\n" +
//                "     'table-name' = 'GH_BB_BBZC',\n" +
//                "     'debezium.log.mining.continuous.mine'='true',\n" +
//                "     'debezium.log.mining.strategy'='online_catalog',\n" +
//                "     'debezium.database.tablename.case.insensitive'='false',\n" +
//                "     'scan.startup.mode' = 'initial')";
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
                    .reportid(String.valueOf(item.getField("REPORTID")))
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
                    .qysj(getTimestamp(item,"TYSJ"))
                    .tysj(getTimestamp(item,"TYSJ"))
                    .yxqz(getTimestamp(item,"YXQZ"))
                    .bbsx((BigDecimal) item.getField("BBSX"))
                    .txsj((BigDecimal) item.getField("TXSJ"))
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
                    .cjsj(getTimestamp( item,"CJSJ"))
                    .xgr(String.valueOf(item.getField("XGR")))
                    .xgsj(getTimestamp(item,"XGSJ"))
                    .tjspsj(getTimestamp(item,"TJSPSJ"))
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
                    .sjylx(getTimestamp(item,"SJYLX"))
                    .cjbm(String.valueOf(item.getField("CJBM")))
                    .bbcjsj(getTimestamp(item,"BBCJSJ"))
                    .xdr(String.valueOf(item.getField("XDR")))
                    .xdsj(getTimestamp(item,"XDSJ"))
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
