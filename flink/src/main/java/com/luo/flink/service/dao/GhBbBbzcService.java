package com.luo.flink.service.dao;

import com.luo.flink.entity.business.GhBbBbzc;

public class GhBbBbzcService extends AbstractService<GhBbBbzc> {
    @Override
    String insertSql(GhBbBbzc info) {
        return "insert into GH_BB_BBZC_TARGET (reportid\n" +
                "bh\n" +
                "dcfffldm\n" +
                "bbzwqc\n" +
                "bbywqc\n" +
                "bbzwjc\n" +
                "bb\n" +
                "bblx\n" +
                "zyfldm\n" +
                "zgzy\n" +
                "tbsm\n" +
                "wh\n" +
                "dcnr\n" +
                "dcpddm\n" +
                "dcpdms\n" +
                "qysj\n" +
                "tysj\n" +
                "yxqz\n" +
                "bbsx\n" +
                "txsj\n" +
                "txsjms\n" +
                "bbztdm\n" +
                "bbjb\n" +
                "spr\n" +
                "spjg\n" +
                "pzhjg\n" +
                "pzwh\n" +
                "bajg\n" +
                "bawh\n" +
                "zbjg\n" +
                "gljg\n" +
                "gljgfzr\n" +
                "wlbmc\n" +
                "bz\n" +
                "bzh\n" +
                "cjr\n" +
                "cjsj\n" +
                "xgr\n" +
                "xgsj\n" +
                "tjspsj\n" +
                "sfyxjzlssj\n" +
                "bbbgsm\n" +
                "qzbh\n" +
                "sybbid\n" +
                "sqbid\n" +
                "tqbh\n" +
                "lsbz\n" +
                "tjdcdxjblxdm\n" +
                "dclylx\n" +
                "zbs\n" +
                "bywj\n" +
                "bdcml\n" +
                "hzgxyj\n" +
                "hzbsjys\n" +
                "bbqjbl\n" +
                "ms\n" +
                "spyj\n" +
                "bfgbbid\n" +
                "scbz\n" +
                "sfkwhtbfw\n" +
                "hzsjls\n" +
                "gzbbbm\n" +
                "gzmlbm\n" +
                "sjylx\n" +
                "cjbm\n" +
                "bbcjsj\n" +
                "xdr\n" +
                "xdsj\n" +
                "xdsm\n" +
                "bbsm\n" +
                "tbfw\n" +
                "bbqbdm\n" +
                "ssrw\n" +
                "tbsjsm\n" +
                "bbsyhy\n" +
                "hzsyjgdm\n" +
                "sjbs\n" +
                "bydx\n" +
                "qsfs\n" +
                "htmlby\n" +
                "excelby\n" +
                "nbbs\n" +
                "hzblx\n" +
                "sjcjfs\n" +
                "bbfl\n" +
                "hzbsjbb\n" +
                "bbzldm\n" +
                "dcdxlxdm\n" +
                "tbdyfw\n" +
                "tbhyfw\n" +
                "dcdwsl\n" +
                "bsdw\n" +
                "bsdwlxdm\n" +
                "bsfsdm\n" +
                "hzfsdm\n" +
                "re_reportid\n" +
                "sftb\n" +
                "tjzydm\n" +
                "sfglb\n" +
                "sffrb\n" +
                "has_sq_tq\n" +
                "set_row_bgcolor\n" +
                "blockjson\n" +
                "tblx\n" +
                "yw_01\n" +
                "yw_02\n" +
                "yw_03\n" +
                "yw_04\n" +
                "yw_05\n" +
                "yw_06\n" +
                "yw_07\n" +
                "yw_08\n" +
                "yw_09\n" +
                "yw_10" +
                ") values ("
                + ifNotNull(info.getReportid()) + ","
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
                + "REPORTID = " +   info.getReportid() + ","
                + "BH = " +   info.getBh() + ","
                + "DCFFFLDM = " +   info.getDcfffldm() + ","
                + "BBZWQC = " +   info.getBbzwqc() + ","
                + "BBYWQC = " +   info.getBbywqc() + ","
                + "BBZWJC = " +   info.getBbzwjc() + ","
                + "BB = " +   info.getBb() + ","
                + "BBLX = " +   info.getBblx() + ","
                + "ZYFLDM = " +   info.getZyfldm() + ","
                + "ZGZY = " +   info.getZgzy() + ","
                + "TBSM = " +   info.getTbsm() + ","
                + "WH = " +   info.getWh() + ","
                + "DCNR = " +   info.getDcnr() + ","
                + "DCPDDM = " +   info.getDcpddm() + ","
                + "DCPDMS = " +   info.getDcpdms() + ","
                + "QYSJ = " +   info.getQysj() + ","
                + "TYSJ = " +   info.getTysj() + ","
                + "YXQZ = " +   info.getYxqz() + ","
                + "BBSX = " +   info.getBbsx() + ","
                + "TXSJ = " +   info.getTxsj() + ","
                + "TXSJMS = " +   info.getTxsjms() + ","
                + "BBZTDM = " +   info.getBbztdm() + ","
                + "BBJB = " +   info.getBbjb() + ","
                + "SPR = " +   info.getSpr() + ","
                + "SPJG = " +   info.getSpjg() + ","
                + "PZHJG = " +   info.getPzhjg() + ","
                + "PZWH = " +   info.getPzwh() + ","
                + "BAJG = " +   info.getBajg() + ","
                + "BAWH = " +   info.getBawh() + ","
                + "ZBJG = " +   info.getZbjg() + ","
                + "GLJG = " +   info.getGljg() + ","
                + "GLJGFZR = " +   info.getGljgfzr() + ","
                + "WLBMC = " +   info.getWlbmc() + ","
                + "BZ = " +   info.getBz() + ","
                + "BZH = " +   info.getBzh() + ","
                + "CJR = " +   info.getCjr() + ","
                + "CJSJ = " +   info.getCjsj() + ","
                + "XGR = " +   info.getXgr() + ","
                + "XGSJ = " +   info.getXgsj() + ","
                + "TJSPSJ = " +   info.getTjspsj() + ","
                + "SFYXJZLSSJ = " +   info.getSfyxjzlssj() + ","
                + "BBBGSM = " +   info.getBbbgsm() + ","
                + "QZBH = " +   info.getQzbh() + ","
                + "SYBBID = " +   info.getSybbid() + ","
                + "SQBID = " +   info.getSqbid() + ","
                + "TQBH = " +   info.getTqbh() + ","
                + "LSBZ = " +   info.getLsbz() + ","
                + "TJDCDXJBLXDM = " +   info.getTjdcdxjblxdm() + ","
                + "DCLYLX = " +   info.getDclylx() + ","
                + "ZBS = " +   info.getZbs() + ","
                + "BYWJ = " +   info.getBywj() + ","
                + "BDCML = " +   info.getBdcml() + ","
                + "HZGXYJ = " +   info.getHzgxyj() + ","
                + "HZBSJYS = " +   info.getHzbsjys() + ","
                + "BBQJBL = " +   info.getBbqjbl() + ","
                + "MS = " +   info.getMs() + ","
                + "SPYJ = " +   info.getSpyj() + ","
                + "BFGBBID = " +   info.getBfgbbid() + ","
                + "SCBZ = " +   info.getScbz() + ","
                + "SFKWHTBFW = " +   info.getSfkwhtbfw() + ","
                + "HZSJLS = " +   info.getHzsjls() + ","
                + "GZBBBM = " +   info.getGzbbbm() + ","
                + "GZMLBM = " +   info.getGzmlbm() + ","
                + "SJYLX = " +   info.getSjylx() + ","
                + "CJBM = " +   info.getCjbm() + ","
                + "BBCJSJ = " +   info.getBbcjsj() + ","
                + "XDR = " +   info.getXdr() + ","
                + "XDSJ = " +   info.getXdsj() + ","
                + "XDSM = " +   info.getXdsm() + ","
                + "BBSM = " +   info.getBbsm() + ","
                + "TBFW = " +   info.getTbfw() + ","
                + "BBQBDM = " +   info.getBbqbdm() + ","
                + "SSRW = " +   info.getSsrw() + ","
                + "TBSJSM = " +   info.getTbsjsm() + ","
                + "BBSYHY = " +   info.getBbsyhy() + ","
                + "HZSYJGDM = " +   info.getHzsyjgdm() + ","
                + "SJBS = " +   info.getSjbs() + ","
                + "BYDX = " +   info.getBydx() + ","
                + "QSFS = " +   info.getQsfs() + ","
                + "HTMLBY = " +   info.getHtmlby() + ","
                + "EXCELBY = " +   info.getExcelby() + ","
                + "NBBS = " +   info.getNbbs() + ","
                + "HZBLX = " +   info.getHzblx() + ","
                + "SJCJFS = " +   info.getSjcjfs() + ","
                + "BBFL = " +   info.getBbfl() + ","
                + "HZBSJBB = " +   info.getHzbsjbb() + ","
                + "BBZLDM = " +   info.getBbzldm() + ","
                + "DCDXLXDM = " +   info.getDcdxlxdm() + ","
                + "TBDYFW = " +   info.getTbdyfw() + ","
                + "TBHYFW = " +   info.getTbhyfw() + ","
                + "DCDWSL = " +   info.getDcdwsl() + ","
                + "BSDW = " +   info.getBsdw() + ","
                + "BSDWLXDM = " +   info.getBsdwlxdm() + ","
                + "BSFSDM = " +   info.getBsfsdm() + ","
                + "HZFSDM = " +   info.getHzfsdm() + ","
                + "RE_REPORTID = " +   info.getReReportid() + ","
                + "SFTB = " +   info.getSftb() + ","
                + "TJZYDM = " +   info.getTjzydm() + ","
                + "SFGLB = " +   info.getSfglb() + ","
                + "SFFRB = " +   info.getSffrb() + ","
                + "HAS_SQ_TQ = " +   info.getHasSqTq() + ","
                + "SET_ROW_BGCOLOR = " +   info.getSetRowBgcolor() + ","
                + "BLOCKJSON = " +   info.getBlockjson() + ","
                + "TBLX = " +   info.getTblx() + ","
                + "YW_01 = " +   info.getYw01() + ","
                + "YW_02 = " +   info.getYw02() + ","
                + "YW_03 = " +   info.getYw03() + ","
                + "YW_04 = " +   info.getYw04() + ","
                + "YW_05 = " +   info.getYw05() + ","
                + "YW_06 = " +   info.getYw06() + ","
                + "YW_07 = " +   info.getYw07() + ","
                + "YW_08 = " +   info.getYw08() + ","
                + "YW_09 = " +   info.getYw09() + ","
                + "YW_10 = " +   info.getYw10() + ","
                + " where REPORTID=" + info.getReReportid();
    }

    @Override
    String deleteSql(GhBbBbzc info) {  //
        return "delete from GH_BB_BBZC_TARGET where ZZID =" + info.getReReportid();
    }

    @Override
    public String getKing(GhBbBbzc info) {
        return info.getKing();
    }
}
