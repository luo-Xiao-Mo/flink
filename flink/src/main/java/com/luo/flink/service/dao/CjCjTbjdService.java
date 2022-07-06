package com.luo.flink.service.dao;

import com.luo.flink.entity.business.CJCJTBJD;
import com.luo.flink.service.dao.AbstractService;

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
                + "'" + info.getZzid() + "',"
                + "'" + info.getReportid() + "',"
                + "'" + info.getBh() + "',"
                + "'" + info.getDwxtm() + "',"
                + "'" + info.getDwmc() + "',"
                + "'" + info.getBgq() + "',"
                + "'" + info.getYhid() + "',"
                + "'" + info.getTbkssj() + "',"
                + "'" + info.getTbjzsj() + "',"
                + "'" + info.getTxkssj() + "',"
                + "'" + info.getCbjzsj() + "',"
                + "'" + info.getTbsj() + "',"
                + "'" + info.getZzjgdm() + "',"
                + "'" + info.getGljg() + "',"
                + "'" + info.getSjztbm() + "',"
                + "'" + info.getSjddfsdm() + "',"
                + "'" + info.getYcbz() + "',"
                + "'" + info.getTjjgjbdm() + "',"
                + "'" + info.getTjjgjbmc() + "',"
                + "'" + info.getYsh() + "',"
                + "'" + info.getBbbz() + "',"
                + "'" + info.getXmid() + "',"
                + "'" + info.getZgysr() + "',"
                + "'" + info.getZgyssj() + "',"
                + "'" + info.getXmmc() + "',"
                + "'" + info.getZgyszt() + "',"
                + "'" + info.getQyckjzsj() + "',"
                + "'" + info.getXyfstzbz() + "',"
                + "'" + info.getSffstzbz() + "',"
                + "'" + info.getBxyfstzyy() + "',"
                + "'" + info.getBbdjbz() + "',"
                + "'" + info.getTzsbh() + "',"
                + "'" + info.getRwid() + "',"
                + "'" + info.getCjzggzzid() + "',"
                + "'" + info.getQyzzbbzt() + "',"
                + "'" + info.getQyzzshzt() + "',"
                + "'" + info.getDqshzt() + "',"
                + "'" + info.getQyzztjsj() + "',"
                + "'" + info.getSyshzt() + "',"
                + "'" + info.getXtshr() + "',"
                + "'" + info.getXtshsj() + "',"
                + "'" + info.getTbrmc() + "',"
                + "'" + info.getXtshrmc() + "',"
                + "'" + info.getZgysrmc() + "',"
                + "'" + info.getTzstjjg() + "',"
                + "'" + info.getSfqmtj() + "',"
                + "'" + info.getBfkzbz() + "',"
                + "'" + info.getInserttime() + "',"
                + "'" + info.getCommitflag() + "',"
                + "'" + info.getQytbr() + "',"
                + "'" + info.getCommittime() + "',"
                + "'" + info.getQyyhid() + "',"
                + "'" + info.getJgysrTjjb01() + "',"
                + "'" + info.getJgysrmcTjjb01() + "',"
                + "'" + info.getJgyssjTjjb01() + "',"
                + "'" + info.getJgysztTjjb01() + "',"
                + "'" + info.getJgsyshztTjjb01() + "',"
                + "'" + info.getJgsyshsjTjjb01() + "',"
                + "'" + info.getJgysrTjjb02() + "',"
                + "'" + info.getJgysrmcTjjb02() + "',"
                + "'" + info.getJgyssjTjjb02() + "',"
                + "'" + info.getJgysztTjjb02() + "',"
                + "'" + info.getJgsyshztTjjb02() + "',"
                + "'" + info.getJgsyshsjTjjb02() + "',"
                + "'" + info.getJgysrTjjb03() + "',"
                + "'" + info.getJgysrmcTjjb03() + "',"
                + "'" + info.getJgyssjTjjb03() + "',"
                + "'" + info.getJgysztTjjb03() + "',"
                + "'" + info.getJgsyshztTjjb03() + "',"
                + "'" + info.getJgsyshsjTjjb03() + "',"
                + "'" + info.getJgysrTjjb04() + "',"
                + "'" + info.getJgysrmcTjjb04() + "',"
                + "'" + info.getJgyssjTjjb04() + "',"
                + "'" + info.getJgysztTjjb04() + "',"
                + "'" + info.getJgsyshztTjjb04() + "',"
                + "'" + info.getJgsyshsjTjjb04() + "',"
                + "'" + info.getJgysrTjjb05() + "',"
                + "'" + info.getJgysrmcTjjb05() + "',"
                + "'" + info.getJgyssjTjjb05() + "',"
                + "'" + info.getJgysztTjjb05() + "',"
                + "'" + info.getJgsyshztTjjb05() + "',"
                + "'" + info.getJgsyshsjTjjb05() + "',"
                + "'" + info.getJgysrTjjb06() + "',"
                + "'" + info.getJgysrmcTjjb06() + "',"
                + "'" + info.getJgyssjTjjb06() + "',"
                + "'" + info.getJgysztTjjb06() + "',"
                + "'" + info.getJgsyshztTjjb06() + "',"
                + "'" + info.getJgsyshsjTjjb06() + "',"
                + "'" + info.getClientip() + "',"
                + "'" + info.getBackTjjgjbdm() + "',"
                + "'" + info.getBackSbjzsj() + "',"
                + "'" + info.getBackFlag() + "',"
                + "'" + info.getFirstTjsj() + "',"
                + "'" + info.getWlryydm() + "',"
                + "'" + info.getWlryysm() + "',"
                + "'" + info.getSbTjjgdm() + "',"
                + "'" + info.getSbTjjgjbdm() + "',"
                + "'" + info.getTjzydm() + "',"
                + "'" + info.getJgysyjTjjb01() + "',"
                + "'" + info.getJgysyjTjjb02() + "',"
                + "'" + info.getJgysyjTjjb03() + "',"
                + "'" + info.getJgysyjTjjb04() + "',"
                + "'" + info.getJgysyjTjjb05() + "',"
                + "'" + info.getJgysyjTjjb06() + "',"
                + "'" + info.getGsfrdm() + "',"
                + "'" + info.getXqtbkssj() + "',"
                + "'" + info.getJgyskssjTjjb01() + "',"
                + "'" + info.getJgyskssjTjjb02() + "',"
                + "'" + info.getJgyskssjTjjb03() + "',"
                + "'" + info.getJgyskssjTjjb04() + "',"
                + "'" + info.getJgyskssjTjjb05() + "',"
                + "'" + info.getJgyskssjTjjb06() + "'" + ")";
    }

    @Override
    String updateSql(CJCJTBJD info) {
        return "update CJ_CJ_TBJD_TARGET " +
                "set "
                + "ZZIDNAM =" + "'" + info.getZzid() + "',"
                + "REPORTID =" + "'" + info.getReportid() + "',"
                + "BH =" + "'" + info.getBh() + "',"
                + "DWXTM =" + "'" + info.getDwxtm() + "',"
                + "DWMC =" + "'" + info.getDwmc() + "',"
                + "BGQ =" + "'" + info.getBgq() + "',"
                + "YHID =" + "'" + info.getYhid() + "',"
                + "TBKSSJ =" + "'" + info.getTbkssj() + "',"
                + "TBJZSJ =" + "'" + info.getTbjzsj() + "',"
                + "TXKSSJ =" + "'" + info.getTxkssj() + "',"
                + "CBJZSJ =" + "'" + info.getCbjzsj() + "',"
                + "TBSJ =" + "'" + info.getTbsj() + "',"
                + "ZZJGDM =" + "'" + info.getZzjgdm() + "',"
                + "GLJG =" + "'" + info.getGljg() + "',"
                + "SJZTBM =" + "'" + info.getSjztbm() + "',"
                + "SJDDFSDM =" + "'" + info.getSjddfsdm() + "',"
                + "YCBZ =" + "'" + info.getYcbz() + "',"
                + "TJJGJBDM =" + "'" + info.getTjjgjbdm() + "',"
                + "TJJGJBMC =" + "'" + info.getTjjgjbmc() + "',"
                + "YSH =" + "'" + info.getYsh() + "',"
                + "BBBZ =" + "'" + info.getBbbz() + "',"
                + "XMID =" + "'" + info.getXmid() + "',"
                + "ZGYSR =" + "'" + info.getZgysr() + "',"
                + "ZGYSSJ =" + "'" + info.getZgyssj() + "',"
                + "XMMC =" + "'" + info.getXmmc() + "',"
                + "ZGYSZT =" + "'" + info.getZgyszt() + "',"
                + "QYCKJZSJ =" + "'" + info.getQyckjzsj() + "',"
                + "XYFSTZBZ =" + "'" + info.getXyfstzbz() + "',"
                + "SFFSTZBZ =" + "'" + info.getSffstzbz() + "',"
                + "BXYFSTZYY =" + "'" + info.getBxyfstzyy() + "',"
                + "BBDJBZ =" + "'" + info.getBbdjbz() + "',"
                + "TZSBH =" + "'" + info.getTzsbh() + "',"
                + "RWID =" + "'" + info.getRwid() + "',"
                + "CJZGGZZID =" + "'" + info.getCjzggzzid() + "',"
                + "QYZZBBZT =" + "'" + info.getQyzzbbzt() + "',"
                + "QYZZSHZT =" + "'" + info.getQyzzshzt() + "',"
                + "DQSHZT =" + "'" + info.getDqshzt() + "',"
                + "QYZZTJSJ =" + "'" + info.getQyzztjsj() + "',"
                + "SYSHZT =" + "'" + info.getSyshzt() + "',"
                + "XTSHR =" + "'" + info.getXtshr() + "',"
                + "XTSHSJ =" + "'" + info.getXtshsj() + "',"
                + "TBRMC =" + "'" + info.getTbrmc() + "',"
                + "XTSHRMC =" + "'" + info.getXtshrmc() + "',"
                + "ZGYSRMC =" + "'" + info.getZgysrmc() + "',"
                + "TZSTJJG =" + "'" + info.getTzstjjg() + "',"
                + "SFQMTJ =" + "'" + info.getSfqmtj() + "',"
                + "BFKZBZ =" + "'" + info.getBfkzbz() + "',"
                + "INSERTTIME =" + "'" + info.getInserttime() + "',"
                + "COMMITFLAG =" + "'" + info.getCommitflag() + "',"
                + "QYTBR =" + "'" + info.getQytbr() + "',"
                + "COMMITTIME =" + "'" + info.getCommittime() + "',"
                + "QYYHID =" + "'" + info.getQyyhid() + "',"
                + "JGYSR_TJJB01 =" + "'" + info.getJgysrTjjb01() + "',"
                + "JGYSRMC_TJJB01 =" + "'" + info.getJgysrmcTjjb01() + "',"
                + "JGYSSJ_TJJB01 =" + "'" + info.getJgyssjTjjb01() + "',"
                + "JGYSZT_TJJB01 =" + "'" + info.getJgysztTjjb01() + "',"
                + "JGSYSHZT_TJJB01 =" + "'" + info.getJgsyshztTjjb01() + "',"
                + "JGSYSHSJ_TJJB01 =" + "'" + info.getJgsyshsjTjjb01() + "',"
                + "JGYSR_TJJB02 =" + "'" + info.getJgysrTjjb02() + "',"
                + "JGYSRMC_TJJB02 =" + "'" + info.getJgysrmcTjjb02() + "',"
                + "JGYSSJ_TJJB02 =" + "'" + info.getJgyssjTjjb02() + "',"
                + "JGYSZT_TJJB02 =" + "'" + info.getJgysztTjjb02() + "',"
                + "JGSYSHZT_TJJB02 =" + "'" + info.getJgsyshztTjjb02() + "',"
                + "JGSYSHSJ_TJJB02 =" + "'" + info.getJgsyshsjTjjb02() + "',"
                + "JGYSR_TJJB03 =" + "'" + info.getJgysrTjjb03() + "',"
                + "JGYSRMC_TJJB03 =" + "'" + info.getJgysrmcTjjb03() + "',"
                + "JGYSSJ_TJJB03 =" + "'" + info.getJgyssjTjjb03() + "',"
                + "JGYSZT_TJJB03 =" + "'" + info.getJgysztTjjb03() + "',"
                + "JGSYSHZT_TJJB03 =" + "'" + info.getJgsyshztTjjb03() + "',"
                + "JGSYSHSJ_TJJB03 =" + "'" + info.getJgsyshsjTjjb03() + "',"
                + "JGYSR_TJJB04 =" + "'" + info.getJgysrTjjb04() + "',"
                + "JGYSRMC_TJJB04 =" + "'" + info.getJgysrmcTjjb04() + "',"
                + "JGYSSJ_TJJB04 =" + "'" + info.getJgyssjTjjb04() + "',"
                + "JGYSZT_TJJB04 =" + "'" + info.getJgysztTjjb04() + "',"
                + "JGSYSHZT_TJJB04 =" + "'" + info.getJgsyshztTjjb04() + "',"
                + "JGSYSHSJ_TJJB04 =" + "'" + info.getJgsyshsjTjjb04() + "',"
                + "JGYSR_TJJB05 =" + "'" + info.getJgysrTjjb05() + "',"
                + "JGYSRMC_TJJB05 =" + "'" + info.getJgysrmcTjjb05() + "',"
                + "JGYSSJ_TJJB05 =" + "'" + info.getJgyssjTjjb05() + "',"
                + "JGYSZT_TJJB05 =" + "'" + info.getJgysztTjjb05() + "',"
                + "JGSYSHZT_TJJB05 =" + "'" + info.getJgsyshztTjjb05() + "',"
                + "JGSYSHSJ_TJJB05 =" + "'" + info.getJgsyshsjTjjb05() + "',"
                + "JGYSR_TJJB06 =" + "'" + info.getJgysrTjjb06() + "',"
                + "JGYSRMC_TJJB06 =" + "'" + info.getJgysrmcTjjb06() + "',"
                + "JGYSSJ_TJJB06 =" + "'" + info.getJgyssjTjjb06() + "',"
                + "JGYSZT_TJJB06 =" + "'" + info.getJgysztTjjb06() + "',"
                + "JGSYSHZT_TJJB06 =" + "'" + info.getJgsyshztTjjb06() + "',"
                + "JGSYSHSJ_TJJB06 =" + "'" + info.getJgsyshsjTjjb06() + "',"
                + "CLIENTIP =" + "'" + info.getClientip() + "',"
                + "BACK_TJJGJBDM =" + "'" + info.getBackTjjgjbdm() + "',"
                + "BACK_SBJZSJ =" + "'" + info.getBackSbjzsj() + "',"
                + "BACK_FLAG =" + "'" + info.getBackFlag() + "',"
                + "FIRST_TJSJ =" + "'" + info.getFirstTjsj() + "',"
                + "WLRYYDM =" + "'" + info.getWlryydm() + "',"
                + "WLRYYSM =" + "'" + info.getWlryysm() + "',"
                + "SB_TJJGDM =" + "'" + info.getSbTjjgdm() + "',"
                + "SB_TJJGJBDM =" + "'" + info.getSbTjjgjbdm() + "',"
                + "TJZYDM =" + "'" + info.getTjzydm() + "',"
                + "JGYSYJ_TJJB01 =" + "'" + info.getJgysyjTjjb01() + "',"
                + "JGYSYJ_TJJB02 =" + "'" + info.getJgysyjTjjb02() + "',"
                + "JGYSYJ_TJJB03 =" + "'" + info.getJgysyjTjjb03() + "',"
                + "JGYSYJ_TJJB04 =" + "'" + info.getJgysyjTjjb04() + "',"
                + "JGYSYJ_TJJB05 =" + "'" + info.getJgysyjTjjb05() + "',"
                + "JGYSYJ_TJJB06 =" + "'" + info.getJgysyjTjjb06() + "',"
                + "GSFRDM =" + "'" + info.getGsfrdm() + "',"
                + "XQTBKSSJ =" + "'" + info.getXqtbkssj() + "',"
                + "JGYSKSSJ_TJJB01 =" + "'" + info.getJgyskssjTjjb01() + "',"
                + "JGYSKSSJ_TJJB02 =" + "'" + info.getJgyskssjTjjb02() + "',"
                + "JGYSKSSJ_TJJB03 =" + "'" + info.getJgyskssjTjjb03() + "',"
                + "JGYSKSSJ_TJJB04 =" + "'" + info.getJgyskssjTjjb04() + "',"
                + "JGYSKSSJ_TJJB05 =" + "'" + info.getJgyskssjTjjb05() + "',"
                + "JGYSKSSJ_TJJB06 =" + "'" + info.getJgyskssjTjjb06() + "'"
                + " where ZZID =" + info.getZzid();
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
