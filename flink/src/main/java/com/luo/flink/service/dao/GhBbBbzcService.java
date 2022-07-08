package com.luo.flink.service.dao;

import com.luo.flink.entity.business.GhBbBbzc;

public class GhBbBbzcService extends AbstractService<GhBbBbzc> {
    @Override
    String insertSql(GhBbBbzc info) {
        return "insert into GH_BB_BBZC_TARGET (reportid,\n" +
                "bh,\n" +
                "dcfffldm,\n" +
                "bbzwqc,\n" +
                "bbywqc,\n" +
                "bbzwjc,\n" +
                "bb,\n" +
                "bblx,\n" +
                "zyfldm,\n" +
                "zgzy,\n" +
                "tbsm,\n" +
                "wh,\n" +
                "dcnr,\n" +
                "dcpddm,\n" +
                "dcpdms,\n" +
                "qysj,\n" +
                "tysj,\n" +
                "yxqz,\n" +
                "bbsx,\n" +
                "txsj,\n" +
                "txsjms,\n" +
                "bbztdm,\n" +
                "bbjb,\n" +
                "spr,\n" +
                "spjg,\n" +
                "pzhjg,\n" +
                "pzwh,\n" +
                "bajg,\n" +
                "bawh,\n" +
                "zbjg,\n" +
                "gljg,\n" +
                "gljgfzr,\n" +
                "wlbmc,\n" +
                "bz,\n" +
                "bzh,\n" +
                "cjr,\n" +
                "cjsj,\n" +
                "xgr,\n" +
                "xgsj,\n" +
                "tjspsj,\n" +
                "sfyxjzlssj,\n" +
                "bbbgsm,\n" +
                "qzbh,\n" +
                "sybbid,\n" +
                "sqbid,\n" +
                "tqbh,\n" +
                "lsbz,\n" +
                "tjdcdxjblxdm,\n" +
                "dclylx,\n" +
                "zbs,\n" +
                "bywj,\n" +
                "bdcml,\n" +
                "hzgxyj,\n" +
                "hzbsjys,\n" +
                "bbqjbl,\n" +
                "ms,\n" +
                "spyj,\n" +
                "bfgbbid,\n" +
                "scbz,\n" +
                "sfkwhtbfw,\n" +
                "hzsjls,\n" +
                "gzbbbm,\n" +
                "gzmlbm,\n" +
                "sjylx,\n" +
                "cjbm,\n" +
                "bbcjsj,\n" +
                "xdr,\n" +
                "xdsj,\n" +
                "xdsm,\n" +
                "bbsm,\n" +
                "tbfw,\n" +
                "bbqbdm,\n" +
                "ssrw,\n" +
                "tbsjsm,\n" +
                "bbsyhy,\n" +
                "hzsyjgdm,\n" +
                "sjbs,\n" +
                "bydx,\n" +
                "qsfs,\n" +
                "htmlby,\n" +
                "excelby,\n" +
                "nbbs,\n" +
                "hzblx,\n" +
                "sjcjfs,\n" +
                "bbfl,\n" +
                "hzbsjbb,\n" +
                "bbzldm,\n" +
                "dcdxlxdm,\n" +
                "tbdyfw,\n" +
                "tbhyfw,\n" +
                "dcdwsl,\n" +
                "bsdw,\n" +
                "bsdwlxdm,\n" +
                "bsfsdm,\n" +
                "hzfsdm,\n" +
                "re_reportid,\n" +
                "sftb,\n" +
                "tjzydm,\n" +
                "sfglb,\n" +
                "sffrb,\n" +
                "has_sq_tq,\n" +
                "set_row_bgcolor,\n" +
                "blockjson,\n" +
                "tblx,\n" +
                "yw_01,\n" +
                "yw_02,\n" +
                "yw_03,\n" +
                "yw_04,\n" +
                "yw_05,\n" +
                "yw_06,\n" +
                "yw_07,\n" +
                "yw_08,\n" +
                "yw_09,\n" +
                "yw_10" +
                ") values ("
                +  ifNotNull( info.getReportid()) + ","
                +  ifNotNull( info.getBh()) + ","
                +  ifNotNull( info.getDcfffldm()) + ","
                +  ifNotNull( info.getBbzwqc()) + ","
                +  ifNotNull( info.getBbywqc()) + ","
                +  ifNotNull( info.getBbzwjc()) + ","
                +  ifNotNull( info.getBb()) + ","
                +  ifNotNull( info.getBblx()) + ","
                +  ifNotNull( info.getZyfldm()) + ","
                +  ifNotNull( info.getZgzy()) + ","
                +  ifNotNull( info.getTbsm()) + ","
                +  ifNotNull( info.getWh()) + ","
                +  ifNotNull( info.getDcnr()) + ","
                +  ifNotNull( info.getDcpddm()) + ","
                +  ifNotNull( info.getDcpdms()) + ","
                +  ifNotNull( info.getQysj()) + ","
                +  ifNotNull( info.getTysj()) + ","
                +  ifNotNull( info.getYxqz()) + ","
                +  ifNotNull( info.getBbsx()) + ","
                +  ifNotNull( info.getTxsj()) + ","
                +  ifNotNull( info.getTxsjms()) + ","
                +  ifNotNull( info.getBbztdm()) + ","
                +  ifNotNull( info.getBbjb()) + ","
                +  ifNotNull( info.getSpr()) + ","
                +  ifNotNull( info.getSpjg()) + ","
                +  ifNotNull( info.getPzhjg()) + ","
                +  ifNotNull( info.getPzwh()) + ","
                +  ifNotNull( info.getBajg()) + ","
                +  ifNotNull( info.getBawh()) + ","
                +  ifNotNull( info.getZbjg()) + ","
                +  ifNotNull( info.getGljg()) + ","
                +  ifNotNull( info.getGljgfzr()) + ","
                +  ifNotNull( info.getWlbmc()) + ","
                +  ifNotNull( info.getBz()) + ","
                +  ifNotNull( info.getBzh()) + ","
                +  ifNotNull( info.getCjr()) + ","
                +  ifNotNull( info.getCjsj()) + ","
                +  ifNotNull( info.getXgr()) + ","
                +  ifNotNull( info.getXgsj()) + ","
                +  ifNotNull( info.getTjspsj()) + ","
                +  ifNotNull( info.getSfyxjzlssj()) + ","
                +  ifNotNull( info.getBbbgsm()) + ","
                +  ifNotNull( info.getQzbh()) + ","
                +  ifNotNull( info.getSybbid()) + ","
                +  ifNotNull( info.getSqbid()) + ","
                +  ifNotNull( info.getTqbh()) + ","
                +  ifNotNull( info.getLsbz()) + ","
                +  ifNotNull( info.getTjdcdxjblxdm()) + ","
                +  ifNotNull( info.getDclylx()) + ","
                +  ifNotNull( info.getZbs()) + ","
                +  ifNotNull( info.getBywj()) + ","
                +  ifNotNull( info.getBdcml()) + ","
                +  ifNotNull( info.getHzgxyj()) + ","
                +  ifNotNull( info.getHzbsjys()) + ","
                +  ifNotNull( info.getBbqjbl()) + ","
                +  ifNotNull( info.getMs()) + ","
                +  ifNotNull( info.getSpyj()) + ","
                +  ifNotNull( info.getBfgbbid()) + ","
                +  ifNotNull( info.getScbz()) + ","
                +  ifNotNull( info.getSfkwhtbfw()) + ","
                +  ifNotNull( info.getHzsjls()) + ","
                +  ifNotNull( info.getGzbbbm()) + ","
                +  ifNotNull( info.getGzmlbm()) + ","
                +  ifNotNull( info.getSjylx()) + ","
                +  ifNotNull( info.getCjbm()) + ","
                +  ifNotNull( info.getBbcjsj()) + ","
                +  ifNotNull( info.getXdr()) + ","
                +  ifNotNull( info.getXdsj()) + ","
                +  ifNotNull( info.getXdsm()) + ","
                +  ifNotNull( info.getBbsm()) + ","
                +  ifNotNull( info.getTbfw()) + ","
                +  ifNotNull( info.getBbqbdm()) + ","
                +  ifNotNull( info.getSsrw()) + ","
                +  ifNotNull( info.getTbsjsm()) + ","
                +  ifNotNull( info.getBbsyhy()) + ","
                +  ifNotNull( info.getHzsyjgdm()) + ","
                +  ifNotNull( info.getSjbs()) + ","
                +  ifNotNull( info.getBydx()) + ","
                +  ifNotNull( info.getQsfs()) + ","
                +  ifNotNull( info.getHtmlby()) + ","
                +  ifNotNull( info.getExcelby()) + ","
                +  ifNotNull( info.getNbbs()) + ","
                +  ifNotNull( info.getHzblx()) + ","
                +  ifNotNull( info.getSjcjfs()) + ","
                +  ifNotNull( info.getBbfl()) + ","
                +  ifNotNull( info.getHzbsjbb()) + ","
                +  ifNotNull( info.getBbzldm()) + ","
                +  ifNotNull( info.getDcdxlxdm()) + ","
                +  ifNotNull( info.getTbdyfw()) + ","
                +  ifNotNull( info.getTbhyfw()) + ","
                +  ifNotNull( info.getDcdwsl()) + ","
                +  ifNotNull( info.getBsdw()) + ","
                +  ifNotNull( info.getBsdwlxdm()) + ","
                +  ifNotNull( info.getBsfsdm()) + ","
                +  ifNotNull( info.getHzfsdm()) + ","
                +  ifNotNull( info.getReReportid()) + ","
                +  ifNotNull( info.getSftb()) + ","
                +  ifNotNull( info.getTjzydm()) + ","
                +  ifNotNull( info.getSfglb()) + ","
                +  ifNotNull( info.getSffrb()) + ","
                +  ifNotNull( info.getHasSqTq()) + ","
                +  ifNotNull( info.getSetRowBgcolor()) + ","
                +  ifNotNull( info.getBlockjson()) + ","
                +  ifNotNull( info.getTblx()) + ","
                +  ifNotNull( info.getYw01()) + ","
                +  ifNotNull( info.getYw02()) + ","
                +  ifNotNull( info.getYw03()) + ","
                +  ifNotNull( info.getYw04()) + ","
                +  ifNotNull( info.getYw05()) + ","
                +  ifNotNull( info.getYw06()) + ","
                +  ifNotNull( info.getYw07()) + ","
                +  ifNotNull( info.getYw08()) + ","
                +  ifNotNull( info.getYw09()) + ","
                +  ifNotNull( info.getYw10()) +   ")";
    }

    @Override
    String updateSql(GhBbBbzc info) {
        return "update GH_BB_BBZC_TARGET " +
                "set "
                + "BH = " +  ifNotNull( info.getBh() )+ ","
                + "DCFFFLDM = " +  ifNotNull( info.getDcfffldm() )+ ","
                + "BBZWQC = " +  ifNotNull( info.getBbzwqc() )+ ","
                + "BBYWQC = " +  ifNotNull( info.getBbywqc() )+ ","
                + "BBZWJC = " +  ifNotNull( info.getBbzwjc() )+ ","
                + "BB = " +  ifNotNull( info.getBb() )+ ","
                + "BBLX = " +  ifNotNull( info.getBblx() )+ ","
                + "ZYFLDM = " +  ifNotNull( info.getZyfldm() )+ ","
                + "ZGZY = " +  ifNotNull( info.getZgzy() )+ ","
                + "TBSM = " +  ifNotNull( info.getTbsm() )+ ","
                + "WH = " +  ifNotNull( info.getWh() )+ ","
                + "DCNR = " +  ifNotNull( info.getDcnr() )+ ","
                + "DCPDDM = " +  ifNotNull( info.getDcpddm() )+ ","
                + "DCPDMS = " +  ifNotNull( info.getDcpdms() )+ ","
                + "QYSJ = " +  ifNotNull( info.getQysj() )+ ","
                + "TYSJ = " +  ifNotNull( info.getTysj() )+ ","
                + "YXQZ = " +  ifNotNull( info.getYxqz() )+ ","
                + "BBSX = " +  ifNotNull( info.getBbsx() )+ ","
                + "TXSJ = " +  ifNotNull( info.getTxsj() )+ ","
                + "TXSJMS = " +  ifNotNull( info.getTxsjms() )+ ","
                + "BBZTDM = " +  ifNotNull( info.getBbztdm() )+ ","
                + "BBJB = " +  ifNotNull( info.getBbjb() )+ ","
                + "SPR = " +  ifNotNull( info.getSpr() )+ ","
                + "SPJG = " +  ifNotNull( info.getSpjg() )+ ","
                + "PZHJG = " +  ifNotNull( info.getPzhjg() )+ ","
                + "PZWH = " +  ifNotNull( info.getPzwh() )+ ","
                + "BAJG = " +  ifNotNull( info.getBajg() )+ ","
                + "BAWH = " +  ifNotNull( info.getBawh() )+ ","
                + "ZBJG = " +  ifNotNull( info.getZbjg() )+ ","
                + "GLJG = " +  ifNotNull( info.getGljg() )+ ","
                + "GLJGFZR = " +  ifNotNull( info.getGljgfzr() )+ ","
                + "WLBMC = " +  ifNotNull( info.getWlbmc() )+ ","
                + "BZ = " +  ifNotNull( info.getBz() )+ ","
                + "BZH = " +  ifNotNull( info.getBzh() )+ ","
                + "CJR = " +  ifNotNull( info.getCjr() )+ ","
                + "CJSJ = " +  ifNotNull( info.getCjsj() )+ ","
                + "XGR = " +  ifNotNull( info.getXgr() )+ ","
                + "XGSJ = " +  ifNotNull( info.getXgsj() )+ ","
                + "TJSPSJ = " +  ifNotNull( info.getTjspsj() )+ ","
                + "SFYXJZLSSJ = " +  ifNotNull( info.getSfyxjzlssj() )+ ","
                + "BBBGSM = " +  ifNotNull( info.getBbbgsm() )+ ","
                + "QZBH = " +  ifNotNull( info.getQzbh() )+ ","
                + "SYBBID = " +  ifNotNull( info.getSybbid() )+ ","
                + "SQBID = " +  ifNotNull( info.getSqbid() )+ ","
                + "TQBH = " +  ifNotNull( info.getTqbh() )+ ","
                + "LSBZ = " +  ifNotNull( info.getLsbz() )+ ","
                + "TJDCDXJBLXDM = " +  ifNotNull( info.getTjdcdxjblxdm() )+ ","
                + "DCLYLX = " +  ifNotNull( info.getDclylx() )+ ","
                + "ZBS = " +  ifNotNull( info.getZbs() )+ ","
                + "BYWJ = " +  ifNotNull( info.getBywj() )+ ","
                + "BDCML = " +  ifNotNull( info.getBdcml() )+ ","
                + "HZGXYJ = " +  ifNotNull( info.getHzgxyj() )+ ","
                + "HZBSJYS = " +  ifNotNull( info.getHzbsjys() )+ ","
                + "BBQJBL = " +  ifNotNull( info.getBbqjbl() )+ ","
                + "MS = " +  ifNotNull( info.getMs() )+ ","
                + "SPYJ = " +  ifNotNull( info.getSpyj() )+ ","
                + "BFGBBID = " +  ifNotNull( info.getBfgbbid() )+ ","
                + "SCBZ = " +  ifNotNull( info.getScbz() )+ ","
                + "SFKWHTBFW = " +  ifNotNull( info.getSfkwhtbfw() )+ ","
                + "HZSJLS = " +  ifNotNull( info.getHzsjls() )+ ","
                + "GZBBBM = " +  ifNotNull( info.getGzbbbm() )+ ","
                + "GZMLBM = " +  ifNotNull( info.getGzmlbm() )+ ","
                + "SJYLX = " +  ifNotNull( info.getSjylx() )+ ","
                + "CJBM = " +  ifNotNull( info.getCjbm() )+ ","
                + "BBCJSJ = " +  ifNotNull( info.getBbcjsj() )+ ","
                + "XDR = " +  ifNotNull( info.getXdr() )+ ","
                + "XDSJ = " +  ifNotNull( info.getXdsj() )+ ","
                + "XDSM = " +  ifNotNull( info.getXdsm() )+ ","
                + "BBSM = " +  ifNotNull( info.getBbsm() )+ ","
                + "TBFW = " +  ifNotNull( info.getTbfw() )+ ","
                + "BBQBDM = " +  ifNotNull( info.getBbqbdm() )+ ","
                + "SSRW = " +  ifNotNull( info.getSsrw() )+ ","
                + "TBSJSM = " +  ifNotNull( info.getTbsjsm() )+ ","
                + "BBSYHY = " +  ifNotNull( info.getBbsyhy() )+ ","
                + "HZSYJGDM = " +  ifNotNull( info.getHzsyjgdm() )+ ","
                + "SJBS = " +  ifNotNull( info.getSjbs() )+ ","
                + "BYDX = " +  ifNotNull( info.getBydx() )+ ","
                + "QSFS = " +  ifNotNull( info.getQsfs() )+ ","
                + "HTMLBY = " +  ifNotNull( info.getHtmlby() )+ ","
                + "EXCELBY = " +  ifNotNull( info.getExcelby() )+ ","
                + "NBBS = " +  ifNotNull( info.getNbbs() )+ ","
                + "HZBLX = " +  ifNotNull( info.getHzblx() )+ ","
                + "SJCJFS = " +  ifNotNull( info.getSjcjfs() )+ ","
                + "BBFL = " +  ifNotNull( info.getBbfl() )+ ","
                + "HZBSJBB = " +  ifNotNull( info.getHzbsjbb() )+ ","
                + "BBZLDM = " +  ifNotNull( info.getBbzldm() )+ ","
                + "DCDXLXDM = " +  ifNotNull( info.getDcdxlxdm() )+ ","
                + "TBDYFW = " +  ifNotNull( info.getTbdyfw() )+ ","
                + "TBHYFW = " +  ifNotNull( info.getTbhyfw() )+ ","
                + "DCDWSL = " +  ifNotNull( info.getDcdwsl() )+ ","
                + "BSDW = " +  ifNotNull( info.getBsdw() )+ ","
                + "BSDWLXDM = " +  ifNotNull( info.getBsdwlxdm() )+ ","
                + "BSFSDM = " +  ifNotNull( info.getBsfsdm() )+ ","
                + "HZFSDM = " +  ifNotNull( info.getHzfsdm() )+ ","
                + "RE_REPORTID = " +  ifNotNull( info.getReReportid() )+ ","
                + "SFTB = " +  ifNotNull( info.getSftb() )+ ","
                + "TJZYDM = " +  ifNotNull( info.getTjzydm() )+ ","
                + "SFGLB = " +  ifNotNull( info.getSfglb() )+ ","
                + "SFFRB = " +  ifNotNull( info.getSffrb() )+ ","
                + "HAS_SQ_TQ = " +  ifNotNull( info.getHasSqTq() )+ ","
                + "SET_ROW_BGCOLOR = " +  ifNotNull( info.getSetRowBgcolor() )+ ","
                + "BLOCKJSON = " +  ifNotNull( info.getBlockjson() )+ ","
                + "TBLX = " +  ifNotNull( info.getTblx() )+ ","
                + "YW_01 = " +  ifNotNull( info.getYw01() )+ ","
                + "YW_02 = " +  ifNotNull( info.getYw02() )+ ","
                + "YW_03 = " +  ifNotNull( info.getYw03() )+ ","
                + "YW_04 = " +  ifNotNull( info.getYw04() )+ ","
                + "YW_05 = " +  ifNotNull( info.getYw05() )+ ","
                + "YW_06 = " +  ifNotNull( info.getYw06() )+ ","
                + "YW_07 = " +  ifNotNull( info.getYw07() )+ ","
                + "YW_08 = " +  ifNotNull( info.getYw08() )+ ","
                + "YW_09 = " +  ifNotNull( info.getYw09() )+ ","
                + "YW_10 = " +  ifNotNull( info.getYw10() )
                + " where REPORTID=" +  ifNotNull( info.getReportid());
    }

    @Override
    String deleteSql(GhBbBbzc info) {  //
        return "delete from GH_BB_BBZC_TARGET where REPORTID =" + info.getReportid();
    }

    @Override
    public String getKing(GhBbBbzc info) {
        return info.getKing();
    }
}
