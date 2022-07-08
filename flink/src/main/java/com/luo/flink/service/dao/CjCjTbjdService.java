package com.luo.flink.service.dao;

import com.alibaba.fastjson.JSON;
import com.luo.flink.entity.business.CJCJTBJD;
import oracle.sql.TIMESTAMP;

import java.sql.Timestamp;

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

    String ifNotNull(Object obj){
        if (obj instanceof String){
            return "null".equals((String)obj)? "null" : "'"+ obj +"'";
        }else if(obj instanceof Timestamp){
            return  (long)obj == 0 ? "null" : "'"+ obj +"'" ;
        }
        return null;
    }

    @Override
    String updateSql(CJCJTBJD info) {
        return "update CJ_CJ_TBJD_TARGET " +
                "set "
                + "ZZIDNAM ="  + info.getZzid() + ","
                + "REPORTID ="  + info.getReportid() + ","
                + "BH ="  + info.getBh() + ","
                + "DWXTM ="  + info.getDwxtm() + ","
                + "DWMC ="  + info.getDwmc() + ","
                + "BGQ ="  + info.getBgq() + ","
                + "YHID ="  + info.getYhid() + ","
                + "TBKSSJ ="  + info.getTbkssj() + ","
                + "TBJZSJ ="  + info.getTbjzsj() + ","
                + "TXKSSJ ="  + info.getTxkssj() + ","
                + "CBJZSJ ="  + info.getCbjzsj() + ","
                + "TBSJ ="  + info.getTbsj() + ","
                + "ZZJGDM ="  + info.getZzjgdm() + ","
                + "GLJG ="  + info.getGljg() + ","
                + "SJZTBM ="  + info.getSjztbm() + ","
                + "SJDDFSDM ="  + info.getSjddfsdm() + ","
                + "YCBZ ="  + info.getYcbz() + ","
                + "TJJGJBDM ="  + info.getTjjgjbdm() + ","
                + "TJJGJBMC ="  + info.getTjjgjbmc() + ","
                + "YSH ="  + info.getYsh() + ","
                + "BBBZ ="  + info.getBbbz() + ","
                + "XMID ="  + info.getXmid() + ","
                + "ZGYSR ="  + info.getZgysr() + ","
                + "ZGYSSJ ="  + info.getZgyssj() + ","
                + "XMMC ="  + info.getXmmc() + ","
                + "ZGYSZT ="  + info.getZgyszt() + ","
                + "QYCKJZSJ ="  + info.getQyckjzsj() + ","
                + "XYFSTZBZ ="  + info.getXyfstzbz() + ","
                + "SFFSTZBZ ="  + info.getSffstzbz() + ","
                + "BXYFSTZYY ="  + info.getBxyfstzyy() + ","
                + "BBDJBZ ="  + info.getBbdjbz() + ","
                + "TZSBH ="  + info.getTzsbh() + ","
                + "RWID ="  + info.getRwid() + ","
                + "CJZGGZZID ="  + info.getCjzggzzid() + ","
                + "QYZZBBZT ="  + info.getQyzzbbzt() + ","
                + "QYZZSHZT ="  + info.getQyzzshzt() + ","
                + "DQSHZT ="  + info.getDqshzt() + ","
                + "QYZZTJSJ ="  + info.getQyzztjsj() + ","
                + "SYSHZT ="  + info.getSyshzt() + ","
                + "XTSHR ="  + info.getXtshr() + ","
                + "XTSHSJ ="  + info.getXtshsj() + ","
                + "TBRMC ="  + info.getTbrmc() + ","
                + "XTSHRMC ="  + info.getXtshrmc() + ","
                + "ZGYSRMC ="  + info.getZgysrmc() + ","
                + "TZSTJJG ="  + info.getTzstjjg() + ","
                + "SFQMTJ ="  + info.getSfqmtj() + ","
                + "BFKZBZ ="  + info.getBfkzbz() + ","
                + "INSERTTIME ="  + info.getInserttime() + ","
                + "COMMITFLAG ="  + info.getCommitflag() + ","
                + "QYTBR ="  + info.getQytbr() + ","
                + "COMMITTIME ="  + info.getCommittime() + ","
                + "QYYHID ="  + info.getQyyhid() + ","
                + "JGYSR_TJJB01 ="  + info.getJgysrTjjb01() + ","
                + "JGYSRMC_TJJB01 ="  + info.getJgysrmcTjjb01() + ","
                + "JGYSSJ_TJJB01 ="  + info.getJgyssjTjjb01() + ","
                + "JGYSZT_TJJB01 ="  + info.getJgysztTjjb01() + ","
                + "JGSYSHZT_TJJB01 ="  + info.getJgsyshztTjjb01() + ","
                + "JGSYSHSJ_TJJB01 ="  + info.getJgsyshsjTjjb01() + ","
                + "JGYSR_TJJB02 ="  + info.getJgysrTjjb02() + ","
                + "JGYSRMC_TJJB02 ="  + info.getJgysrmcTjjb02() + ","
                + "JGYSSJ_TJJB02 ="  + info.getJgyssjTjjb02() + ","
                + "JGYSZT_TJJB02 ="  + info.getJgysztTjjb02() + ","
                + "JGSYSHZT_TJJB02 ="  + info.getJgsyshztTjjb02() + ","
                + "JGSYSHSJ_TJJB02 ="  + info.getJgsyshsjTjjb02() + ","
                + "JGYSR_TJJB03 ="  + info.getJgysrTjjb03() + ","
                + "JGYSRMC_TJJB03 ="  + info.getJgysrmcTjjb03() + ","
                + "JGYSSJ_TJJB03 ="  + info.getJgyssjTjjb03() + ","
                + "JGYSZT_TJJB03 ="  + info.getJgysztTjjb03() + ","
                + "JGSYSHZT_TJJB03 ="  + info.getJgsyshztTjjb03() + ","
                + "JGSYSHSJ_TJJB03 ="  + info.getJgsyshsjTjjb03() + ","
                + "JGYSR_TJJB04 ="  + info.getJgysrTjjb04() + ","
                + "JGYSRMC_TJJB04 ="  + info.getJgysrmcTjjb04() + ","
                + "JGYSSJ_TJJB04 ="  + info.getJgyssjTjjb04() + ","
                + "JGYSZT_TJJB04 ="  + info.getJgysztTjjb04() + ","
                + "JGSYSHZT_TJJB04 ="  + info.getJgsyshztTjjb04() + ","
                + "JGSYSHSJ_TJJB04 ="  + info.getJgsyshsjTjjb04() + ","
                + "JGYSR_TJJB05 ="  + info.getJgysrTjjb05() + ","
                + "JGYSRMC_TJJB05 ="  + info.getJgysrmcTjjb05() + ","
                + "JGYSSJ_TJJB05 ="  + info.getJgyssjTjjb05() + ","
                + "JGYSZT_TJJB05 ="  + info.getJgysztTjjb05() + ","
                + "JGSYSHZT_TJJB05 ="  + info.getJgsyshztTjjb05() + ","
                + "JGSYSHSJ_TJJB05 ="  + info.getJgsyshsjTjjb05() + ","
                + "JGYSR_TJJB06 ="  + info.getJgysrTjjb06() + ","
                + "JGYSRMC_TJJB06 ="  + info.getJgysrmcTjjb06() + ","
                + "JGYSSJ_TJJB06 ="  + info.getJgyssjTjjb06() + ","
                + "JGYSZT_TJJB06 ="  + info.getJgysztTjjb06() + ","
                + "JGSYSHZT_TJJB06 ="  + info.getJgsyshztTjjb06() + ","
                + "JGSYSHSJ_TJJB06 ="  + info.getJgsyshsjTjjb06() + ","
                + "CLIENTIP ="  + info.getClientip() + ","
                + "BACK_TJJGJBDM ="  + info.getBackTjjgjbdm() + ","
                + "BACK_SBJZSJ ="  + info.getBackSbjzsj() + ","
                + "BACK_FLAG ="  + info.getBackFlag() + ","
                + "FIRST_TJSJ ="  + info.getFirstTjsj() + ","
                + "WLRYYDM ="  + info.getWlryydm() + ","
                + "WLRYYSM ="  + info.getWlryysm() + ","
                + "SB_TJJGDM ="  + info.getSbTjjgdm() + ","
                + "SB_TJJGJBDM ="  + info.getSbTjjgjbdm() + ","
                + "TJZYDM ="  + info.getTjzydm() + ","
                + "JGYSYJ_TJJB01 ="  + info.getJgysyjTjjb01() + ","
                + "JGYSYJ_TJJB02 ="  + info.getJgysyjTjjb02() + ","
                + "JGYSYJ_TJJB03 ="  + info.getJgysyjTjjb03() + ","
                + "JGYSYJ_TJJB04 ="  + info.getJgysyjTjjb04() + ","
                + "JGYSYJ_TJJB05 ="  + info.getJgysyjTjjb05() + ","
                + "JGYSYJ_TJJB06 ="  + info.getJgysyjTjjb06() + ","
                + "GSFRDM ="  + info.getGsfrdm() + ","
                + "XQTBKSSJ ="  + info.getXqtbkssj() + ","
                + "JGYSKSSJ_TJJB01 ="  + info.getJgyskssjTjjb01() + ","
                + "JGYSKSSJ_TJJB02 ="  + info.getJgyskssjTjjb02() + ","
                + "JGYSKSSJ_TJJB03 ="  + info.getJgyskssjTjjb03() + ","
                + "JGYSKSSJ_TJJB04 ="  + info.getJgyskssjTjjb04() + ","
                + "JGYSKSSJ_TJJB05 ="  + info.getJgyskssjTjjb05() + ","
                + "JGYSKSSJ_TJJB06 ="  + info.getJgyskssjTjjb06()
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
