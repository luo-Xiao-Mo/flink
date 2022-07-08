package com.luo.flink.service.task;

import com.luo.flink.entity.business.CJCJTBJD;
import com.luo.flink.service.dao.AbstractService;
import com.luo.flink.service.dao.CjCjTbjdService;
import org.apache.flink.table.api.TableResult;
import org.apache.flink.table.api.bridge.java.StreamTableEnvironment;


public class CjCjTbjdTaskService extends AbstractTaskService {
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
                    .tbkssj(getTimestamp(item, "TBKSSJ"))
                    .tbjzsj(getTimestamp(item, "TBJZSJ"))
                    .txkssj(getTimestamp(item, "TXKSSJ"))
                    .cbjzsj(getTimestamp(item, "CBJZSJ"))
                    .tbsj(getTimestamp(item, "TBSJ"))
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
                    .zgyssj(getTimestamp(item, "ZGYSSJ"))
                    .xmmc(String.valueOf(item.getField("XMMC")))
                    .zgyszt(String.valueOf(item.getField("ZGYSZT")))
                    .qyckjzsj(getTimestamp(item, "QYCKJZSJ"))
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
                    .qyzztjsj(getTimestamp(item, "QYZZTJSJ"))
                    .syshzt(String.valueOf(item.getField("SYSHZT")))
                    .xtshr(String.valueOf(item.getField("XTSHR")))
                    .xtshsj(getTimestamp(item, "XTSHSJ"))
                    .tbrmc(String.valueOf(item.getField("TBRMC")))
                    .xtshrmc(String.valueOf(item.getField("XTSHRMC")))
                    .zgysrmc(String.valueOf(item.getField("ZGYSRMC")))
                    .tzstjjg(String.valueOf(item.getField("TZSTJJG")))
                    .sfqmtj(String.valueOf(item.getField("SFQMTJ")))
                    .bfkzbz(String.valueOf(item.getField("BFKZBZ")))
                    .inserttime(getTimestamp(item, "INSERTTIME"))
                    .commitflag(String.valueOf(item.getField("COMMITFLAG")))
                    .qytbr(String.valueOf(item.getField("QYTBR")))
                    .committime(getTimestamp(item, "COMMITTIME"))
                    .qyyhid(String.valueOf(item.getField("QYYHID")))
                    .jgysrTjjb01(String.valueOf(item.getField("JGYSR_TJJB01")))
                    .jgysrmcTjjb01(String.valueOf(item.getField("JGYSRMC_TJJB01")))
                    .jgyssjTjjb01(getTimestamp(item, "JGYSSJ_TJJB01"))
                    .jgysztTjjb01(String.valueOf(item.getField("JGYSZT_TJJB01")))
                    .jgsyshztTjjb01(String.valueOf(item.getField("JGSYSHZT_TJJB01")))
                    .jgsyshsjTjjb01(getTimestamp(item, "JGSYSHSJ_TJJB01"))
                    .jgysrTjjb02(String.valueOf(item.getField("JGYSR_TJJB02")))
                    .jgysrmcTjjb02(String.valueOf(item.getField("JGYSRMC_TJJB02")))
                    .jgyssjTjjb02(getTimestamp(item, "JGYSSJ_TJJB02"))
                    .jgysztTjjb02(String.valueOf(item.getField("JGYSZT_TJJB02")))
                    .jgsyshztTjjb02(String.valueOf(item.getField("JGSYSHZT_TJJB02")))
                    .jgsyshsjTjjb02(getTimestamp(item, "JGSYSHSJ_TJJB02"))
                    .jgysrTjjb03(String.valueOf(item.getField("JGYSR_TJJB03")))
                    .jgysrmcTjjb03(String.valueOf(item.getField("JGYSRMC_TJJB03")))
                    .jgyssjTjjb03(getTimestamp(item, "JGYSSJ_TJJB03"))
                    .jgysztTjjb03(String.valueOf(item.getField("JGYSZT_TJJB03")))
                    .jgsyshztTjjb03(String.valueOf(item.getField("JGSYSHZT_TJJB03")))
                    .jgsyshsjTjjb03(getTimestamp(item, "JGSYSHSJ_TJJB03"))
                    .jgysrTjjb04(String.valueOf(item.getField("JGYSR_TJJB04")))
                    .jgysrmcTjjb04(String.valueOf(item.getField("JGYSRMC_TJJB04")))
                    .jgyssjTjjb04(getTimestamp(item, "JGYSSJ_TJJB04"))
                    .jgysztTjjb04(String.valueOf(item.getField("JGYSZT_TJJB04")))
                    .jgsyshztTjjb04(String.valueOf(item.getField("JGSYSHZT_TJJB04")))
                    .jgsyshsjTjjb04(getTimestamp(item, "JGSYSHSJ_TJJB04"))
                    .jgysrTjjb05(String.valueOf(item.getField("JGYSR_TJJB05")))
                    .jgysrmcTjjb05(String.valueOf(item.getField("JGYSRMC_TJJB05")))
                    .jgyssjTjjb05(getTimestamp(item, "JGYSSJ_TJJB05"))
                    .jgysztTjjb05(String.valueOf(item.getField("JGYSZT_TJJB05")))
                    .jgsyshztTjjb05(String.valueOf(item.getField("JGSYSHZT_TJJB05")))
                    .jgsyshsjTjjb05(getTimestamp(item, "JGSYSHSJ_TJJB05"))
                    .jgysrTjjb06(String.valueOf(item.getField("JGYSR_TJJB06")))
                    .jgysrmcTjjb06(String.valueOf(item.getField("JGYSRMC_TJJB06")))
                    .jgyssjTjjb06(getTimestamp(item, "JGYSSJ_TJJB06"))
                    .jgysztTjjb06(String.valueOf(item.getField("JGYSZT_TJJB06")))
                    .jgsyshztTjjb06(String.valueOf(item.getField("JGSYSHZT_TJJB06")))
                    .jgsyshsjTjjb06(getTimestamp(item, "JGSYSHSJ_TJJB06"))
                    .clientip(String.valueOf(item.getField("CLIENTIP")))
                    .backTjjgjbdm(String.valueOf(item.getField("BACK_TJJGJBDM")))
                    .backSbjzsj(getTimestamp(item, "BACK_SBJZSJ"))
                    .backFlag(String.valueOf(item.getField("BACK_FLAG")))
                    .firstTjsj(getTimestamp(item, "FIRST_TJSJ"))
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
                    .xqtbkssj(getTimestamp(item, "XQTBKSSJ"))
                    .jgyskssjTjjb01(getTimestamp(item, "JGYSKSSJ_TJJB01"))
                    .jgyskssjTjjb02(getTimestamp(item, "JGYSKSSJ_TJJB02"))
                    .jgyskssjTjjb03(getTimestamp(item, "JGYSKSSJ_TJJB03"))
                    .jgyskssjTjjb04(getTimestamp(item, "JGYSKSSJ_TJJB04"))
                    .jgyskssjTjjb05(getTimestamp(item, "JGYSKSSJ_TJJB05"))
                    .jgyskssjTjjb06(getTimestamp(item, "JGYSKSSJ_TJJB06"))
                    .build();
            abstractService.invoke(info);
        });
    }

    @Override
    String getSql() {
        return "CREATE TABLE CJ_CJ_TBJD (\n" +
                "    ZZID            STRING,\n" +
                "    REPORTID        STRING,\n" +
                "    BH              STRING,\n" +
                "    DWXTM           STRING,\n" +
                "    DWMC            STRING,\n" +
                "    BGQ             STRING,\n" +
                "    YHID            STRING,\n" +
                "    TBKSSJ          TIMESTAMP,\n" +
                "    TBJZSJ          TIMESTAMP,\n" +
                "    TXKSSJ          TIMESTAMP,\n" +
                "    CBJZSJ          TIMESTAMP,\n" +
                "    TBSJ            TIMESTAMP,\n" +
                "    ZZJGDM          STRING,\n" +
                "    GLJG            STRING,\n" +
                "    SJZTBM          STRING,\n" +
                "    SJDDFSDM        STRING,\n" +
                "    YCBZ            STRING,\n" +
                "    TJJGJBDM        STRING,\n" +
                "    TJJGJBMC        STRING,\n" +
                "    YSH             STRING,\n" +
                "    BBBZ            STRING,\n" +
                "    XMID            STRING,\n" +
                "    ZGYSR           STRING,\n" +
                "    ZGYSSJ          TIMESTAMP,\n" +
                "    XMMC            STRING,\n" +
                "    ZGYSZT          STRING,\n" +
                "    QYCKJZSJ        TIMESTAMP,\n" +
                "    XYFSTZBZ        STRING,\n" +
                "    SFFSTZBZ        STRING,\n" +
                "    BXYFSTZYY       STRING,\n" +
                "    BBDJBZ          STRING,\n" +
                "    TZSBH           STRING,\n" +
                "    RWID            STRING,\n" +
                "    CJZGGZZID       STRING,\n" +
                "    QYZZBBZT        STRING,\n" +
                "    QYZZSHZT        STRING,\n" +
                "    DQSHZT          STRING,\n" +
                "    QYZZTJSJ        TIMESTAMP,\n" +
                "    SYSHZT          STRING,\n" +
                "    XTSHR           STRING,\n" +
                "    XTSHSJ          TIMESTAMP,\n" +
                "    TBRMC           STRING,\n" +
                "    XTSHRMC         STRING,\n" +
                "    ZGYSRMC         STRING,\n" +
                "    TZSTJJG         STRING,\n" +
                "    SFQMTJ          STRING,\n" +
                "    BFKZBZ          STRING,\n" +
                "    INSERTTIME      TIMESTAMP,\n" +
                "    COMMITFLAG      STRING,\n" +
                "    QYTBR           STRING,\n" +
                "    COMMITTIME      TIMESTAMP,\n" +
                "    QYYHID          STRING,\n" +
                "    JGYSR_TJJB01    STRING,\n" +
                "    JGYSRMC_TJJB01  STRING,\n" +
                "    JGYSSJ_TJJB01   TIMESTAMP,\n" +
                "    JGYSZT_TJJB01   STRING,\n" +
                "    JGSYSHZT_TJJB01 STRING,\n" +
                "    JGSYSHSJ_TJJB01 TIMESTAMP,\n" +
                "    JGYSR_TJJB02    STRING,\n" +
                "    JGYSRMC_TJJB02  STRING,\n" +
                "    JGYSSJ_TJJB02   TIMESTAMP,\n" +
                "    JGYSZT_TJJB02   STRING,\n" +
                "    JGSYSHZT_TJJB02 STRING,\n" +
                "    JGSYSHSJ_TJJB02 TIMESTAMP,\n" +
                "    JGYSR_TJJB03    STRING,\n" +
                "    JGYSRMC_TJJB03  STRING,\n" +
                "    JGYSSJ_TJJB03   TIMESTAMP,\n" +
                "    JGYSZT_TJJB03   STRING,\n" +
                "    JGSYSHZT_TJJB03 STRING,\n" +
                "    JGSYSHSJ_TJJB03 TIMESTAMP,\n" +
                "    JGYSR_TJJB04    STRING,\n" +
                "    JGYSRMC_TJJB04  STRING,\n" +
                "    JGYSSJ_TJJB04   TIMESTAMP,\n" +
                "    JGYSZT_TJJB04   STRING,\n" +
                "    JGSYSHZT_TJJB04 STRING,\n" +
                "    JGSYSHSJ_TJJB04 TIMESTAMP,\n" +
                "    JGYSR_TJJB05    STRING,\n" +
                "    JGYSRMC_TJJB05  STRING,\n" +
                "    JGYSSJ_TJJB05   TIMESTAMP,\n" +
                "    JGYSZT_TJJB05   STRING,\n" +
                "    JGSYSHZT_TJJB05 STRING,\n" +
                "    JGSYSHSJ_TJJB05 TIMESTAMP,\n" +
                "    JGYSR_TJJB06    STRING,\n" +
                "    JGYSRMC_TJJB06  STRING,\n" +
                "    JGYSSJ_TJJB06   TIMESTAMP,\n" +
                "    JGYSZT_TJJB06   STRING,\n" +
                "    JGSYSHZT_TJJB06 STRING,\n" +
                "    JGSYSHSJ_TJJB06 TIMESTAMP,\n" +
                "    CLIENTIP        STRING,\n" +
                "    BACK_TJJGJBDM   STRING,\n" +
                "    BACK_SBJZSJ     TIMESTAMP,\n" +
                "    BACK_FLAG       STRING,\n" +
                "    FIRST_TJSJ      TIMESTAMP,\n" +
                "    WLRYYDM         STRING,\n" +
                "    WLRYYSM         STRING,\n" +
                "    SB_TJJGDM       STRING,\n" +
                "    SB_TJJGJBDM     STRING,\n" +
                "    TJZYDM          STRING,\n" +
                "    JGYSYJ_TJJB01   STRING,\n" +
                "    JGYSYJ_TJJB02   STRING,\n" +
                "    JGYSYJ_TJJB03   STRING,\n" +
                "    JGYSYJ_TJJB04   STRING,\n" +
                "    JGYSYJ_TJJB05   STRING,\n" +
                "    JGYSYJ_TJJB06   STRING,\n" +
                "    GSFRDM          STRING,\n" +
                "    XQTBKSSJ        TIMESTAMP,\n" +
                "    JGYSKSSJ_TJJB01 TIMESTAMP,\n" +
                "    JGYSKSSJ_TJJB02 TIMESTAMP,\n" +
                "    JGYSKSSJ_TJJB03 TIMESTAMP,\n" +
                "    JGYSKSSJ_TJJB04 TIMESTAMP,\n" +
                "    JGYSKSSJ_TJJB05 TIMESTAMP,\n" +
                "    JGYSKSSJ_TJJB06 TIMESTAMP,\n" +
                "     PRIMARY KEY(ZZID) NOT ENFORCED\n" +

                "     ) WITH (\n" +
                "     'connector' = 'oracle-cdc',\n" +
                "     'hostname' = '172.10.120.86',\n" +
                "     'port' = '1521',\n" +
                "     'username' = 'TEST_SHANGHAIJCPT_DB_FLINK',\n" +
                "     'password' = 'Abc123!@Gwssi',\n" +
                "     'database-name' = 'ora12c',\n" +
                "     'schema-name' = 'TEST_SHANGHAIJCPT_DB_FLINK',\n" +
                "     'table-name' = 'CJ_CJ_TBJD',\n" +
                "     'debezium.log.mining.continuous.mine'='true',\n" +
                "     'debezium.log.mining.strategy'='online_catalog',\n" +
                "     'debezium.database.tablename.case.insensitive'='false',\n" +
                "     'scan.startup.mode' = 'initial')";
/*
                "     'connector' = 'oracle-cdc',\n" +
                "     'hostname' = 'localhost',\n" +
                "     'port' = '1521',\n" +
                "     'username' = 'family',\n" +
                "     'password' = 'zyhcdc',\n" +
                "     'database-name' = 'XE',\n" +
                "     'schema-name' = 'FAMILY',\n" +
                "     'table-name' = 'CJ_CJ_TBJD',\n" +
                "     'debezium.log.mining.continuous.mine'='true',\n" +
                "     'debezium.log.mining.strategy'='online_catalog',\n" +
                "     'debezium.database.tablename.case.insensitive'='false',\n" +
                "     'scan.startup.mode' = 'initial')";
*/
    }

    @Override
    TableResult getTableResult(StreamTableEnvironment tableEnv) {
        return tableEnv.executeSql("select * from CJ_CJ_TBJD");
    }
}
