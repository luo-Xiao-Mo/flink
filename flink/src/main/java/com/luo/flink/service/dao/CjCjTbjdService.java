package com.luo.flink.service.dao;

import com.luo.flink.entity.business.CJCJTBJD;


public class CjCjTbjdService extends AbstractService<CJCJTBJD> {
    @Override
    String insertSql(CJCJTBJD info) {
        return "insert into CJ_CJ_TBJD_TARGET (ZZID,\n" +
                "REPORTID,\n" +
                "BH,\n" +
                "DWXTM,\n" +
                "DWMC,\n" +
                "BGQ,\n" +
                "YHID,\n" +
                "TBKSSJ,\n" +
                "TBJZSJ,\n" +
                "TXKSSJ,\n" +
                "CBJZSJ,\n" +
                "TBSJ,\n" +
                "ZZJGDM,\n" +
                "GLJG,\n" +
                "SJZTBM,\n" +
                "SJDDFSDM,\n" +
                "YCBZ,\n" +
                "TJJGJBDM,\n" +
                "TJJGJBMC,\n" +
                "YSH,\n" +
                "BBBZ,\n" +
                "XMID,\n" +
                "ZGYSR,\n" +
                "ZGYSSJ,\n" +
                "XMMC,\n" +
                "ZGYSZT,\n" +
                "QYCKJZSJ,\n" +
                "XYFSTZBZ,\n" +
                "SFFSTZBZ,\n" +
                "BXYFSTZYY,\n" +
                "BBDJBZ,\n" +
                "TZSBH,\n" +
                "RWID,\n" +
                "CJZGGZZID,\n" +
                "QYZZBBZT,\n" +
                "QYZZSHZT,\n" +
                "DQSHZT,\n" +
                "QYZZTJSJ,\n" +
                "SYSHZT,\n" +
                "XTSHR,\n" +
                "XTSHSJ,\n" +
                "TBRMC,\n" +
                "XTSHRMC,\n" +
                "ZGYSRMC,\n" +
                "TZSTJJG,\n" +
                "SFQMTJ,\n" +
                "BFKZBZ,\n" +
                "INSERTTIME,\n" +
                "COMMITFLAG,\n" +
                "QYTBR,\n" +
                "COMMITTIME,\n" +
                "QYYHID,\n" +
                "JGYSR_TJJB01,\n" +
                "JGYSRMC_TJJB01,\n" +
                "JGYSSJ_TJJB01,\n" +
                "JGYSZT_TJJB01,\n" +
                "JGSYSHZT_TJJB01,\n" +
                "JGSYSHSJ_TJJB01,\n" +
                "JGYSR_TJJB02,\n" +
                "JGYSRMC_TJJB02,\n" +
                "JGYSSJ_TJJB02,\n" +
                "JGYSZT_TJJB02,\n" +
                "JGSYSHZT_TJJB02,\n" +
                "JGSYSHSJ_TJJB02,\n" +
                "JGYSR_TJJB03,\n" +
                "JGYSRMC_TJJB03,\n" +
                "JGYSSJ_TJJB03,\n" +
                "JGYSZT_TJJB03,\n" +
                "JGSYSHZT_TJJB03,\n" +
                "JGSYSHSJ_TJJB03,\n" +
                "JGYSR_TJJB04,\n" +
                "JGYSRMC_TJJB04,\n" +
                "JGYSSJ_TJJB04,\n" +
                "JGYSZT_TJJB04,\n" +
                "JGSYSHZT_TJJB04,\n" +
                "JGSYSHSJ_TJJB04,\n" +
                "JGYSR_TJJB05,\n" +
                "JGYSRMC_TJJB05,\n" +
                "JGYSSJ_TJJB05,\n" +
                "JGYSZT_TJJB05,\n" +
                "JGSYSHZT_TJJB05,\n" +
                "JGSYSHSJ_TJJB05,\n" +
                "JGYSR_TJJB06,\n" +
                "JGYSRMC_TJJB06,\n" +
                "JGYSSJ_TJJB06,\n" +
                "JGYSZT_TJJB06,\n" +
                "JGSYSHZT_TJJB06,\n" +
                "JGSYSHSJ_TJJB06,\n" +
                "CLIENTIP,\n" +
                "BACK_TJJGJBDM,\n" +
                "BACK_SBJZSJ,\n" +
                "BACK_FLAG,\n" +
                "FIRST_TJSJ,\n" +
                "WLRYYDM,\n" +
                "WLRYYSM,\n" +
                "SB_TJJGDM,\n" +
                "SB_TJJGJBDM,\n" +
                "TJZYDM,\n" +
                "JGYSYJ_TJJB01,\n" +
                "JGYSYJ_TJJB02,\n" +
                "JGYSYJ_TJJB03,\n" +
                "JGYSYJ_TJJB04,\n" +
                "JGYSYJ_TJJB05,\n" +
                "JGYSYJ_TJJB06,\n" +
                "GSFRDM,\n" +
                "XQTBKSSJ,\n" +
                "JGYSKSSJ_TJJB01,\n" +
                "JGYSKSSJ_TJJB02,\n" +
                "JGYSKSSJ_TJJB03,\n" +
                "JGYSKSSJ_TJJB04,\n" +
                "JGYSKSSJ_TJJB05,\n" +
                "JGYSKSSJ_TJJB06) values ("
                 + ifNotNull(info.getZzid()) + ","
                 + ifNotNull(info.getReportid()) + ","
                 + ifNotNull(info.getBh()) + ","
                 + ifNotNull(info.getDwxtm()) + ","
                 + ifNotNull(info.getDwmc()) + ","
                 + ifNotNull(info.getBgq()) + ","
                 + ifNotNull(info.getYhid()) + ","
                 + ifNotNull(info.getTbkssj()) + ","
                 + ifNotNull(info.getTbjzsj()) + ","
                 + ifNotNull(info.getTxkssj()) + ","
                 + ifNotNull(info.getCbjzsj()) + ","
                 + ifNotNull(info.getTbsj()) + ","
                 + ifNotNull(info.getZzjgdm()) + ","
                 + ifNotNull(info.getGljg()) + ","
                 + ifNotNull(info.getSjztbm()) + ","
                 + ifNotNull(info.getSjddfsdm()) + ","
                 + ifNotNull(info.getYcbz()) + ","
                 + ifNotNull(info.getTjjgjbdm()) + ","
                 + ifNotNull(info.getTjjgjbmc()) + ","
                 + ifNotNull(info.getYsh()) + ","
                 + ifNotNull(info.getBbbz()) + ","
                 + ifNotNull(info.getXmid()) + ","
                 + ifNotNull(info.getZgysr()) + ","
                 + ifNotNull(info.getZgyssj()) + ","
                 + ifNotNull(info.getXmmc()) + ","
                 + ifNotNull(info.getZgyszt()) + ","
                 + ifNotNull(info.getQyckjzsj()) + ","
                 + ifNotNull(info.getXyfstzbz()) + ","
                 + ifNotNull(info.getSffstzbz()) + ","
                 + ifNotNull(info.getBxyfstzyy()) + ","
                 + ifNotNull(info.getBbdjbz()) + ","
                 + ifNotNull(info.getTzsbh()) + ","
                 + ifNotNull(info.getRwid()) + ","
                 + ifNotNull(info.getCjzggzzid()) + ","
                 + ifNotNull(info.getQyzzbbzt()) + ","
                 + ifNotNull(info.getQyzzshzt()) + ","
                 + ifNotNull(info.getDqshzt()) + ","
                 + ifNotNull(info.getQyzztjsj()) + ","
                 + ifNotNull(info.getSyshzt()) + ","
                 + ifNotNull(info.getXtshr()) + ","
                 + ifNotNull(info.getXtshsj()) + ","
                 + ifNotNull(info.getTbrmc()) + ","
                 + ifNotNull(info.getXtshrmc()) + ","
                 + ifNotNull(info.getZgysrmc()) + ","
                 + ifNotNull(info.getTzstjjg()) + ","
                 + ifNotNull(info.getSfqmtj()) + ","
                 + ifNotNull(info.getBfkzbz()) + ","
                 + ifNotNull(info.getInserttime()) + ","
                 + ifNotNull(info.getCommitflag()) + ","
                 + ifNotNull(info.getQytbr()) + ","
                 + ifNotNull(info.getCommittime()) + ","
                 + ifNotNull(info.getQyyhid()) + ","
                 + ifNotNull(info.getJgysrTjjb01()) + ","
                 + ifNotNull(info.getJgysrmcTjjb01()) + ","
                 + ifNotNull(info.getJgyssjTjjb01()) + ","
                 + ifNotNull(info.getJgysztTjjb01()) + ","
                 + ifNotNull(info.getJgsyshztTjjb01()) + ","
                 + ifNotNull(info.getJgsyshsjTjjb01()) + ","
                 + ifNotNull(info.getJgysrTjjb02()) + ","
                 + ifNotNull(info.getJgysrmcTjjb02()) + ","
                 + ifNotNull(info.getJgyssjTjjb02()) + ","
                 + ifNotNull(info.getJgysztTjjb02()) + ","
                 + ifNotNull(info.getJgsyshztTjjb02()) + ","
                 + ifNotNull(info.getJgsyshsjTjjb02()) + ","
                 + ifNotNull(info.getJgysrTjjb03()) + ","
                 + ifNotNull(info.getJgysrmcTjjb03()) + ","
                 + ifNotNull(info.getJgyssjTjjb03()) + ","
                 + ifNotNull(info.getJgysztTjjb03()) + ","
                 + ifNotNull(info.getJgsyshztTjjb03()) + ","
                 + ifNotNull(info.getJgsyshsjTjjb03()) + ","
                 + ifNotNull(info.getJgysrTjjb04()) + ","
                 + ifNotNull(info.getJgysrmcTjjb04()) + ","
                 + ifNotNull(info.getJgyssjTjjb04()) + ","
                 + ifNotNull(info.getJgysztTjjb04()) + ","
                 + ifNotNull(info.getJgsyshztTjjb04()) + ","
                 + ifNotNull(info.getJgsyshsjTjjb04()) + ","
                 + ifNotNull(info.getJgysrTjjb05()) + ","
                 + ifNotNull(info.getJgysrmcTjjb05()) + ","
                 + ifNotNull(info.getJgyssjTjjb05()) + ","
                 + ifNotNull(info.getJgysztTjjb05()) + ","
                 + ifNotNull(info.getJgsyshztTjjb05()) + ","
                 + ifNotNull(info.getJgsyshsjTjjb05()) + ","
                 + ifNotNull(info.getJgysrTjjb06()) + ","
                 + ifNotNull(info.getJgysrmcTjjb06()) + ","
                 + ifNotNull(info.getJgyssjTjjb06()) + ","
                 + ifNotNull(info.getJgysztTjjb06()) + ","
                 + ifNotNull(info.getJgsyshztTjjb06()) + ","
                 + ifNotNull(info.getJgsyshsjTjjb06()) + ","
                 + ifNotNull(info.getClientip()) + ","
                 + ifNotNull(info.getBackTjjgjbdm()) + ","
                 + ifNotNull(info.getBackSbjzsj()) + ","
                 + ifNotNull(info.getBackFlag()) + ","
                 + ifNotNull(info.getFirstTjsj()) + ","
                 + ifNotNull(info.getWlryydm()) + ","
                 + ifNotNull(info.getWlryysm()) + ","
                 + ifNotNull(info.getSbTjjgdm()) + ","
                 + ifNotNull(info.getSbTjjgjbdm()) + ","
                 + ifNotNull(info.getTjzydm()) + ","
                 + ifNotNull(info.getJgysyjTjjb01()) + ","
                 + ifNotNull(info.getJgysyjTjjb02()) + ","
                 + ifNotNull(info.getJgysyjTjjb03()) + ","
                 + ifNotNull(info.getJgysyjTjjb04()) + ","
                 + ifNotNull(info.getJgysyjTjjb05()) + ","
                 + ifNotNull(info.getJgysyjTjjb06()) + ","
                 + ifNotNull(info.getGsfrdm()) + ","
                 + ifNotNull(info.getXqtbkssj()) + ","
                 + ifNotNull(info.getJgyskssjTjjb01()) + ","
                 + ifNotNull(info.getJgyskssjTjjb02()) + ","
                 + ifNotNull(info.getJgyskssjTjjb03()) + ","
                 + ifNotNull(info.getJgyskssjTjjb04()) + ","
                 + ifNotNull(info.getJgyskssjTjjb05()) + ","
                 + ifNotNull(info.getJgyskssjTjjb06())  + ")";
    }


    @Override
    String updateSql(CJCJTBJD info) {
        return "update CJ_CJ_TBJD_TARGET " +
                "set "
                + "REPORTID ="  + ifNotNull(info.getReportid() )+ ","
                + "BH ="  + ifNotNull(info.getBh() )+ ","
                + "DWXTM ="  + ifNotNull(info.getDwxtm() )+ ","
                + "DWMC ="  + ifNotNull(info.getDwmc() )+ ","
                + "BGQ ="  + ifNotNull(info.getBgq() )+ ","
                + "YHID ="  + ifNotNull(info.getYhid() )+ ","
                + "TBKSSJ ="  + ifNotNull(info.getTbkssj() )+ ","
                + "TBJZSJ ="  + ifNotNull(info.getTbjzsj() )+ ","
                + "TXKSSJ ="  + ifNotNull(info.getTxkssj() )+ ","
                + "CBJZSJ ="  + ifNotNull(info.getCbjzsj() )+ ","
                + "TBSJ ="  + ifNotNull(info.getTbsj() )+ ","
                + "ZZJGDM ="  + ifNotNull(info.getZzjgdm() )+ ","
                + "GLJG ="  + ifNotNull(info.getGljg() )+ ","
                + "SJZTBM ="  + ifNotNull(info.getSjztbm() )+ ","
                + "SJDDFSDM ="  + ifNotNull(info.getSjddfsdm() )+ ","
                + "YCBZ ="  + ifNotNull(info.getYcbz() )+ ","
                + "TJJGJBDM ="  + ifNotNull(info.getTjjgjbdm() )+ ","
                + "TJJGJBMC ="  + ifNotNull(info.getTjjgjbmc() )+ ","
                + "YSH ="  + ifNotNull(info.getYsh() )+ ","
                + "BBBZ ="  + ifNotNull(info.getBbbz() )+ ","
                + "XMID ="  + ifNotNull(info.getXmid() )+ ","
                + "ZGYSR ="  + ifNotNull(info.getZgysr() )+ ","
                + "ZGYSSJ ="  + ifNotNull(info.getZgyssj() )+ ","
                + "XMMC ="  + ifNotNull(info.getXmmc() )+ ","
                + "ZGYSZT ="  + ifNotNull(info.getZgyszt() )+ ","
                + "QYCKJZSJ ="  + ifNotNull(info.getQyckjzsj() )+ ","
                + "XYFSTZBZ ="  + ifNotNull(info.getXyfstzbz() )+ ","
                + "SFFSTZBZ ="  + ifNotNull(info.getSffstzbz() )+ ","
                + "BXYFSTZYY ="  + ifNotNull(info.getBxyfstzyy() )+ ","
                + "BBDJBZ ="  + ifNotNull(info.getBbdjbz() )+ ","
                + "TZSBH ="  + ifNotNull(info.getTzsbh() )+ ","
                + "RWID ="  + ifNotNull(info.getRwid() )+ ","
                + "CJZGGZZID ="  + ifNotNull(info.getCjzggzzid() )+ ","
                + "QYZZBBZT ="  + ifNotNull(info.getQyzzbbzt() )+ ","
                + "QYZZSHZT ="  + ifNotNull(info.getQyzzshzt() )+ ","
                + "DQSHZT ="  + ifNotNull(info.getDqshzt() )+ ","
                + "QYZZTJSJ ="  + ifNotNull(info.getQyzztjsj() )+ ","
                + "SYSHZT ="  + ifNotNull(info.getSyshzt() )+ ","
                + "XTSHR ="  + ifNotNull(info.getXtshr() )+ ","
                + "XTSHSJ ="  + ifNotNull(info.getXtshsj() )+ ","
                + "TBRMC ="  + ifNotNull(info.getTbrmc() )+ ","
                + "XTSHRMC ="  + ifNotNull(info.getXtshrmc() )+ ","
                + "ZGYSRMC ="  + ifNotNull(info.getZgysrmc() )+ ","
                + "TZSTJJG ="  + ifNotNull(info.getTzstjjg() )+ ","
                + "SFQMTJ ="  + ifNotNull(info.getSfqmtj() )+ ","
                + "BFKZBZ ="  + ifNotNull(info.getBfkzbz() )+ ","
                + "INSERTTIME ="  + ifNotNull(info.getInserttime() )+ ","
                + "COMMITFLAG ="  + ifNotNull(info.getCommitflag() )+ ","
                + "QYTBR ="  + ifNotNull(info.getQytbr() )+ ","
                + "COMMITTIME ="  + ifNotNull(info.getCommittime() )+ ","
                + "QYYHID ="  + ifNotNull(info.getQyyhid() )+ ","
                + "JGYSR_TJJB01 ="  + ifNotNull(info.getJgysrTjjb01() )+ ","
                + "JGYSRMC_TJJB01 ="  + ifNotNull(info.getJgysrmcTjjb01() )+ ","
                + "JGYSSJ_TJJB01 ="  + ifNotNull(info.getJgyssjTjjb01() )+ ","
                + "JGYSZT_TJJB01 ="  + ifNotNull(info.getJgysztTjjb01() )+ ","
                + "JGSYSHZT_TJJB01 ="  + ifNotNull(info.getJgsyshztTjjb01() )+ ","
                + "JGSYSHSJ_TJJB01 ="  + ifNotNull(info.getJgsyshsjTjjb01() )+ ","
                + "JGYSR_TJJB02 ="  + ifNotNull(info.getJgysrTjjb02() )+ ","
                + "JGYSRMC_TJJB02 ="  + ifNotNull(info.getJgysrmcTjjb02() )+ ","
                + "JGYSSJ_TJJB02 ="  + ifNotNull(info.getJgyssjTjjb02() )+ ","
                + "JGYSZT_TJJB02 ="  + ifNotNull(info.getJgysztTjjb02() )+ ","
                + "JGSYSHZT_TJJB02 ="  + ifNotNull(info.getJgsyshztTjjb02() )+ ","
                + "JGSYSHSJ_TJJB02 ="  + ifNotNull(info.getJgsyshsjTjjb02() )+ ","
                + "JGYSR_TJJB03 ="  + ifNotNull(info.getJgysrTjjb03() )+ ","
                + "JGYSRMC_TJJB03 ="  + ifNotNull(info.getJgysrmcTjjb03() )+ ","
                + "JGYSSJ_TJJB03 ="  + ifNotNull(info.getJgyssjTjjb03() )+ ","
                + "JGYSZT_TJJB03 ="  + ifNotNull(info.getJgysztTjjb03() )+ ","
                + "JGSYSHZT_TJJB03 ="  + ifNotNull(info.getJgsyshztTjjb03() )+ ","
                + "JGSYSHSJ_TJJB03 ="  + ifNotNull(info.getJgsyshsjTjjb03() )+ ","
                + "JGYSR_TJJB04 ="  + ifNotNull(info.getJgysrTjjb04() )+ ","
                + "JGYSRMC_TJJB04 ="  + ifNotNull(info.getJgysrmcTjjb04() )+ ","
                + "JGYSSJ_TJJB04 ="  + ifNotNull(info.getJgyssjTjjb04() )+ ","
                + "JGYSZT_TJJB04 ="  + ifNotNull(info.getJgysztTjjb04() )+ ","
                + "JGSYSHZT_TJJB04 ="  + ifNotNull(info.getJgsyshztTjjb04() )+ ","
                + "JGSYSHSJ_TJJB04 ="  + ifNotNull(info.getJgsyshsjTjjb04() )+ ","
                + "JGYSR_TJJB05 ="  + ifNotNull(info.getJgysrTjjb05() )+ ","
                + "JGYSRMC_TJJB05 ="  + ifNotNull(info.getJgysrmcTjjb05() )+ ","
                + "JGYSSJ_TJJB05 ="  + ifNotNull(info.getJgyssjTjjb05() )+ ","
                + "JGYSZT_TJJB05 ="  + ifNotNull(info.getJgysztTjjb05() )+ ","
                + "JGSYSHZT_TJJB05 ="  + ifNotNull(info.getJgsyshztTjjb05() )+ ","
                + "JGSYSHSJ_TJJB05 ="  + ifNotNull(info.getJgsyshsjTjjb05() )+ ","
                + "JGYSR_TJJB06 ="  + ifNotNull(info.getJgysrTjjb06() )+ ","
                + "JGYSRMC_TJJB06 ="  + ifNotNull(info.getJgysrmcTjjb06() )+ ","
                + "JGYSSJ_TJJB06 ="  + ifNotNull(info.getJgyssjTjjb06() )+ ","
                + "JGYSZT_TJJB06 ="  + ifNotNull(info.getJgysztTjjb06() )+ ","
                + "JGSYSHZT_TJJB06 ="  + ifNotNull(info.getJgsyshztTjjb06() )+ ","
                + "JGSYSHSJ_TJJB06 ="  + ifNotNull(info.getJgsyshsjTjjb06() )+ ","
                + "CLIENTIP ="  + ifNotNull(info.getClientip() )+ ","
                + "BACK_TJJGJBDM ="  + ifNotNull(info.getBackTjjgjbdm() )+ ","
                + "BACK_SBJZSJ ="  + ifNotNull(info.getBackSbjzsj() )+ ","
                + "BACK_FLAG ="  + ifNotNull(info.getBackFlag() )+ ","
                + "FIRST_TJSJ ="  + ifNotNull(info.getFirstTjsj() )+ ","
                + "WLRYYDM ="  + ifNotNull(info.getWlryydm() )+ ","
                + "WLRYYSM ="  + ifNotNull(info.getWlryysm() )+ ","
                + "SB_TJJGDM ="  + ifNotNull(info.getSbTjjgdm() )+ ","
                + "SB_TJJGJBDM ="  + ifNotNull(info.getSbTjjgjbdm() )+ ","
                + "TJZYDM ="  + ifNotNull(info.getTjzydm() )+ ","
                + "JGYSYJ_TJJB01 ="  + ifNotNull(info.getJgysyjTjjb01() )+ ","
                + "JGYSYJ_TJJB02 ="  + ifNotNull(info.getJgysyjTjjb02() )+ ","
                + "JGYSYJ_TJJB03 ="  + ifNotNull(info.getJgysyjTjjb03() )+ ","
                + "JGYSYJ_TJJB04 ="  + ifNotNull(info.getJgysyjTjjb04() )+ ","
                + "JGYSYJ_TJJB05 ="  + ifNotNull(info.getJgysyjTjjb05() )+ ","
                + "JGYSYJ_TJJB06 ="  + ifNotNull(info.getJgysyjTjjb06() )+ ","
                + "GSFRDM ="  + ifNotNull(info.getGsfrdm() )+ ","
                + "XQTBKSSJ ="  + ifNotNull(info.getXqtbkssj() )+ ","
                + "JGYSKSSJ_TJJB01 ="  + ifNotNull(info.getJgyskssjTjjb01() )+ ","
                + "JGYSKSSJ_TJJB02 ="  + ifNotNull(info.getJgyskssjTjjb02() )+ ","
                + "JGYSKSSJ_TJJB03 ="  + ifNotNull(info.getJgyskssjTjjb03() )+ ","
                + "JGYSKSSJ_TJJB04 ="  + ifNotNull(info.getJgyskssjTjjb04() )+ ","
                + "JGYSKSSJ_TJJB05 ="  + ifNotNull(info.getJgyskssjTjjb05() )+ ","
                + "JGYSKSSJ_TJJB06 ="  + ifNotNull(info.getJgyskssjTjjb06())
                + " where ZZID =" + ifNotNull(info.getZzid());
    }

    @Override
    String deleteSql(CJCJTBJD info) {
        return "delete from CJ_CJ_TBJD_TARGET where ZZID =" + info.getZzid();
    }

    @Override
    public String getKing(CJCJTBJD info) {
        return info.getKing();
    }
}
