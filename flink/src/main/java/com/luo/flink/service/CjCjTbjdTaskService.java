package com.luo.flink.service;

import com.luo.flink.entity.business.CJCJTBJD;
import com.luo.flink.entity.business.Info;
import org.apache.flink.table.api.TableResult;
import org.apache.flink.table.api.bridge.java.StreamTableEnvironment;

import java.sql.Timestamp;

public class CjCjTbjdTaskService  extends AbstractTaskService {
    @Override
    void handlerTableResult(TableResult tableResult) {
        AbstractService<CJCJTBJD> abstractService = new CjCjTbjdService();
        tableResult.collect().forEachRemaining(item -> {
            CJCJTBJD info = CJCJTBJD.builder().king(item.getKind().shortString())
                    .zzid(String.valueOf(item.getField("ZZID")))
                    .reportid(String.valueOf(item.getField("REPORTID")))
                    .bh(String.valueOf(item.getField("BH")))
                    .dwxtm(String.valueOf(item.getField("DWXTM")))
                    .dwmc(String.valueOf(item.getField("DWMC")))
                    .bgq(String.valueOf(item.getField("BGQ")))
                    .yhid(String.valueOf(item.getField("YHID")))
                    .tbkssj((Timestamp) item.getField("TBKSSJ"))
                    .tbjzsj((Timestamp)(item.getField("TBJZSJ")))
                    .txkssj((Timestamp)(item.getField("TXKSSJ")))
                    .cbjzsj((Timestamp)(item.getField("CBJZSJ")))
                    .tbsj((Timestamp)(item.getField("TBSJ")))
                    .zzjgdm(String.valueOf(item.getField("ZZJGDM")))
                    .gljg(String.valueOf(item.getField("GLJG")))
                    .sjztbm(String.valueOf(item.getField("SJZTBM")))
                    .sjddfsdm(String.valueOf(item.getField("SJDDFSDM")))
                    .ycbz(String.valueOf(item.getField("YCBZ")))
                    .tjjgjbdm(String.valueOf(item.getField("TJJGJBDM")))
                    .tjjgjbmc(String.valueOf(item.getField("TJJGJBMC")))
                    .ysh(String.valueOf(item.getField("YSH")))
                    .bbbz(String.valueOf(item.getField("BBBZ")))
                    .xmid(String.valueOf(item.getField("XMID")))
                    .zgysr(String.valueOf(item.getField("ZGYSR")))
                    .zgyssj((Timestamp)(item.getField("ZGYSSJ")))
                    .xmmc(String.valueOf(item.getField("XMMC")))
                    .zgyszt(String.valueOf(item.getField("ZGYSZT")))
                    .qyckjzsj((Timestamp)(item.getField("QYCKJZSJ")))
                    .xyfstzbz(String.valueOf(item.getField("XYFSTZBZ")))
                    .sffstzbz(String.valueOf(item.getField("SFFSTZBZ")))
                    .bxyfstzyy(String.valueOf(item.getField("BXYFSTZYY")))
                    .bbdjbz(String.valueOf(item.getField("BBDJBZ")))
                    .tzsbh(String.valueOf(item.getField("TZSBH")))
                    .rwid(String.valueOf(item.getField("RWID")))
                    .cjzggzzid(String.valueOf(item.getField("CJZGGZZID")))
                    .qyzzbbzt(String.valueOf(item.getField("QYZZBBZT")))
                    .qyzzshzt(String.valueOf(item.getField("QYZZSHZT")))
                    .dqshzt(String.valueOf(item.getField("DQSHZT")))
                    .qyzztjsj((Timestamp)(item.getField("QYZZTJSJ")))
                    .syshzt(String.valueOf(item.getField("SYSHZT")))
                    .xtshr(String.valueOf(item.getField("XTSHR")))
                    .xtshsj((Timestamp)(item.getField("XTSHSJ")))
                    .tbrmc(String.valueOf(item.getField("TBRMC")))
                    .xtshrmc(String.valueOf(item.getField("XTSHRMC")))
                    .zgysrmc(String.valueOf(item.getField("ZGYSRMC")))
                    .tzstjjg(String.valueOf(item.getField("TZSTJJG")))
                    .sfqmtj(String.valueOf(item.getField("SFQMTJ")))
                    .bfkzbz(String.valueOf(item.getField("BFKZBZ")))
                    .inserttime((Timestamp)(item.getField("INSERTTIME")))
                    .commitflag(String.valueOf(item.getField("COMMITFLAG")))
                    .qytbr(String.valueOf(item.getField("QYTBR")))
                    .committime((Timestamp)(item.getField("COMMITTIME")))
                    .qyyhid(String.valueOf(item.getField("QYYHID")))
                    .jgysrTjjb01(String.valueOf(item.getField("JGYSR_TJJB01")))
                    .jgysrmcTjjb01(String.valueOf(item.getField("JGYSRMC_TJJB01")))
                    .jgyssjTjjb01((Timestamp)(item.getField("JGYSSJ_TJJB01")))
                    .jgysztTjjb01(String.valueOf(item.getField("JGYSZT_TJJB01")))
                    .jgsyshztTjjb01(String.valueOf(item.getField("JGSYSHZT_TJJB01")))
                    .jgsyshsjTjjb01((Timestamp)(item.getField("JGSYSHSJ_TJJB01")))
                    .jgysrTjjb02(String.valueOf(item.getField("JGYSR_TJJB02")))
                    .jgysrmcTjjb02(String.valueOf(item.getField("JGYSRMC_TJJB02")))
                    .jgyssjTjjb02((Timestamp)(item.getField("JGYSSJ_TJJB02")))
                    .jgysztTjjb02(String.valueOf(item.getField("JGYSZT_TJJB02")))
                    .jgsyshztTjjb02(String.valueOf(item.getField("JGSYSHZT_TJJB02")))
                    .jgsyshsjTjjb02((Timestamp)(item.getField("JGSYSHSJ_TJJB02")))
                    .jgysrTjjb03(String.valueOf(item.getField("JGYSR_TJJB03")))
                    .jgysrmcTjjb03(String.valueOf(item.getField("JGYSRMC_TJJB03")))
                    .jgyssjTjjb03((Timestamp)(item.getField("JGYSSJ_TJJB03")))
                    .jgysztTjjb03(String.valueOf(item.getField("JGYSZT_TJJB03")))
                    .jgsyshztTjjb03(String.valueOf(item.getField("JGSYSHZT_TJJB03")))
                    .jgsyshsjTjjb03((Timestamp)(item.getField("JGSYSHSJ_TJJB03")))
                    .jgysrTjjb04(String.valueOf(item.getField("JGYSR_TJJB04")))
                    .jgysrmcTjjb04(String.valueOf(item.getField("JGYSRMC_TJJB04")))
                    .jgyssjTjjb04((Timestamp)(item.getField("JGYSSJ_TJJB04")))
                    .jgysztTjjb04(String.valueOf(item.getField("JGYSZT_TJJB04")))
                    .jgsyshztTjjb04(String.valueOf(item.getField("JGSYSHZT_TJJB04")))
                    .jgsyshsjTjjb04((Timestamp)(item.getField("JGSYSHSJ_TJJB04")))
                    .jgysrTjjb05(String.valueOf(item.getField("JGYSR_TJJB05")))
                    .jgysrmcTjjb05(String.valueOf(item.getField("JGYSRMC_TJJB05")))
                    .jgyssjTjjb05((Timestamp)(item.getField("JGYSSJ_TJJB05")))
                    .jgysztTjjb05(String.valueOf(item.getField("JGYSZT_TJJB05")))
                    .jgsyshztTjjb05(String.valueOf(item.getField("JGSYSHZT_TJJB05")))
                    .jgsyshsjTjjb05((Timestamp)(item.getField("JGSYSHSJ_TJJB05")))
                    .jgysrTjjb06(String.valueOf(item.getField("JGYSR_TJJB06")))
                    .jgysrmcTjjb06(String.valueOf(item.getField("JGYSRMC_TJJB06")))
                    .jgyssjTjjb06((Timestamp)(item.getField("JGYSSJ_TJJB06")))
                    .jgysztTjjb06(String.valueOf(item.getField("JGYSZT_TJJB06")))
                    .jgsyshztTjjb06(String.valueOf(item.getField("JGSYSHZT_TJJB06")))
                    .jgsyshsjTjjb06((Timestamp)(item.getField("JGSYSHSJ_TJJB06")))
                    .clientip(String.valueOf(item.getField("CLIENTIP")))
                    .backTjjgjbdm(String.valueOf(item.getField("BACK_TJJGJBDM")))
                    .backSbjzsj((Timestamp)(item.getField("BACK_SBJZSJ")))
                    .backFlag(String.valueOf(item.getField("BACK_FLAG")))
                    .firstTjsj((Timestamp)(item.getField("FIRST_TJSJ")))
                    .wlryydm(String.valueOf(item.getField("WLRYYDM")))
                    .wlryysm(String.valueOf(item.getField("WLRYYSM")))
                    .sbTjjgdm(String.valueOf(item.getField("SB_TJJGDM")))
                    .sbTjjgjbdm(String.valueOf(item.getField("SB_TJJGJBDM")))
                    .tjzydm(String.valueOf(item.getField("TJZYDM")))
                    .jgysyjTjjb01(String.valueOf(item.getField("JGYSYJ_TJJB01")))
                    .jgysyjTjjb02(String.valueOf(item.getField("JGYSYJ_TJJB02")))
                    .jgysyjTjjb03(String.valueOf(item.getField("JGYSYJ_TJJB03")))
                    .jgysyjTjjb04(String.valueOf(item.getField("JGYSYJ_TJJB04")))
                    .jgysyjTjjb05(String.valueOf(item.getField("JGYSYJ_TJJB05")))
                    .jgysyjTjjb06(String.valueOf(item.getField("JGYSYJ_TJJB06")))
                    .gsfrdm(String.valueOf(item.getField("GSFRDM")))
                    .xqtbkssj((Timestamp)(item.getField("XQTBKSSJ")))
                    .jgyskssjTjjb01((Timestamp)(item.getField("JGYSKSSJ_TJJB01")))
                    .jgyskssjTjjb02((Timestamp)(item.getField("JGYSKSSJ_TJJB02")))
                    .jgyskssjTjjb03((Timestamp)(item.getField("JGYSKSSJ_TJJB03")))
                    .jgyskssjTjjb04((Timestamp)(item.getField("JGYSKSSJ_TJJB04")))
                    .jgyskssjTjjb05((Timestamp)(item.getField("JGYSKSSJ_TJJB05")))
                    .jgyskssjTjjb06((Timestamp)(item.getField("JGYSKSSJ_TJJB06")))
                    .build();
            abstractService.invoke(info);
        });
    }

    @Override
    String getSql() {
        return "CREATE TABLE CJ_CJ_TBJD (\n" +
                "    zzid            STRINGSID STRING,\n" +
                "    reportid        STRINGSEX STRING,\n" +
                "    bh              STRING,\n" +
                "    dwxtm           STRING,\n" +
                "    dwmc            STRING,\n" +
                "    bgq             STRING,\n" +
                "    yhid            STRING,\n" +
                "    tbkssj          TIMESTAMP(6),\n" +
                "    tbjzsj          TIMESTAMP(6),\n" +
                "    txkssj          TIMESTAMP(6),\n" +
                "    cbjzsj          TIMESTAMP(6),\n" +
                "    tbsj            TIMESTAMP(6),\n" +
                "    zzjgdm          STRING,\n" +
                "    gljg            STRING,\n" +
                "    sjztbm          STRING,\n" +
                "    sjddfsdm        STRING,\n" +
                "    ycbz            STRING,\n" +
                "    tjjgjbdm        STRING,\n" +
                "    tjjgjbmc        STRING,\n" +
                "    ysh             STRING,\n" +
                "    bbbz            STRING,\n" +
                "    xmid            STRING,\n" +
                "    zgysr           STRING,\n" +
                "    zgyssj          TIMESTAMP(6),\n" +
                "    xmmc            STRING,\n" +
                "    zgyszt          STRING,\n" +
                "    qyckjzsj        TIMESTAMP(6),\n" +
                "    xyfstzbz        STRING,\n" +
                "    sffstzbz        STRING,\n" +
                "    bxyfstzyy       STRING,\n" +
                "    bbdjbz          STRING,\n" +
                "    tzsbh           STRING,\n" +
                "    rwid            STRING,\n" +
                "    cjzggzzid       STRING,\n" +
                "    qyzzbbzt        STRING,\n" +
                "    qyzzshzt        STRING,\n" +
                "    dqshzt          STRING,\n" +
                "    qyzztjsj        TIMESTAMP(6),\n" +
                "    syshzt          STRING,\n" +
                "    xtshr           STRING,\n" +
                "    xtshsj          TIMESTAMP(6),\n" +
                "    tbrmc           STRING,\n" +
                "    xtshrmc         STRING,\n" +
                "    zgysrmc         STRING,\n" +
                "    tzstjjg         STRING,\n" +
                "    sfqmtj          STRING,\n" +
                "    bfkzbz          STRING,\n" +
                "    inserttime      TIMESTAMP(6),\n" +
                "    commitflag      STRING,\n" +
                "    qytbr           STRING,\n" +
                "    committime      TIMESTAMP(6),\n" +
                "    qyyhid          STRING,\n" +
                "    jgysr_tjjb01    STRING,\n" +
                "    jgysrmc_tjjb01  STRING,\n" +
                "    jgyssj_tjjb01   TIMESTAMP(6),\n" +
                "    jgyszt_tjjb01   STRING,\n" +
                "    jgsyshzt_tjjb01 STRING,\n" +
                "    jgsyshsj_tjjb01 TIMESTAMP(6),\n" +
                "    jgysr_tjjb02    STRING,\n" +
                "    jgysrmc_tjjb02  STRING,\n" +
                "    jgyssj_tjjb02   TIMESTAMP(6),\n" +
                "    jgyszt_tjjb02   STRING,\n" +
                "    jgsyshzt_tjjb02 STRING,\n" +
                "    jgsyshsj_tjjb02 TIMESTAMP(6),\n" +
                "    jgysr_tjjb03    STRING,\n" +
                "    jgysrmc_tjjb03  STRING,\n" +
                "    jgyssj_tjjb03   TIMESTAMP(6),\n" +
                "    jgyszt_tjjb03   STRING,\n" +
                "    jgsyshzt_tjjb03 STRING,\n" +
                "    jgsyshsj_tjjb03 TIMESTAMP(6),\n" +
                "    jgysr_tjjb04    STRING,\n" +
                "    jgysrmc_tjjb04  STRING,\n" +
                "    jgyssj_tjjb04   TIMESTAMP(6),\n" +
                "    jgyszt_tjjb04   STRING,\n" +
                "    jgsyshzt_tjjb04 STRING,\n" +
                "    jgsyshsj_tjjb04 TIMESTAMP(6),\n" +
                "    jgysr_tjjb05    STRING,\n" +
                "    jgysrmc_tjjb05  STRING,\n" +
                "    jgyssj_tjjb05   TIMESTAMP(6),\n" +
                "    jgyszt_tjjb05   STRING,\n" +
                "    jgsyshzt_tjjb05 STRING,\n" +
                "    jgsyshsj_tjjb05 TIMESTAMP(6),\n" +
                "    jgysr_tjjb06    STRING,\n" +
                "    jgysrmc_tjjb06  STRING,\n" +
                "    jgyssj_tjjb06   TIMESTAMP(6),\n" +
                "    jgyszt_tjjb06   STRING,\n" +
                "    jgsyshzt_tjjb06 STRING,\n" +
                "    jgsyshsj_tjjb06 TIMESTAMP(6),\n" +
                "    clientip        STRING,\n" +
                "    back_tjjgjbdm   STRING,\n" +
                "    back_sbjzsj     TIMESTAMP(6),\n" +
                "    back_flag       STRING,\n" +
                "    first_tjsj      TIMESTAMP(6),\n" +
                "    wlryydm         STRING,\n" +
                "    wlryysm         STRING,\n" +
                "    sb_tjjgdm       STRING,\n" +
                "    sb_tjjgjbdm     STRING,\n" +
                "    tjzydm          STRING,\n" +
                "    jgysyj_tjjb01   STRING,\n" +
                "    jgysyj_tjjb02   STRING,\n" +
                "    jgysyj_tjjb03   STRING,\n" +
                "    jgysyj_tjjb04   STRING,\n" +
                "    jgysyj_tjjb05   STRING,\n" +
                "    jgysyj_tjjb06   STRING,\n" +
                "    gsfrdm          STRING,\n" +
                "    xqtbkssj        TIMESTAMP(6),\n" +
                "    jgyskssj_tjjb01 TIMESTAMP(6),\n" +
                "    jgyskssj_tjjb02 TIMESTAMP(6),\n" +
                "    jgyskssj_tjjb03 TIMESTAMP(6),\n" +
                "    jgyskssj_tjjb04 TIMESTAMP(6),\n" +
                "    jgyskssj_tjjb05 TIMESTAMP(6),\n" +
                "    jgyskssj_tjjb06 TIMESTAMP(6),\n" +
                "     PRIMARY KEY(zzid) NOT ENFORCED\n" +

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
        return tableEnv.executeSql("select * from CJ_CJ_TBJD");
    }
}
