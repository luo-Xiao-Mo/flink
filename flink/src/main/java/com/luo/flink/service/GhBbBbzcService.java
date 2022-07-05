package com.luo.flink.service;

import com.luo.flink.entity.business.GhBbBbzc;

public class GhBbBbzcService extends AbstractService<GhBbBbzc>{
    @Override
    String insertSql(GhBbBbzc info) {
        return "insert into CJCL.GH_BB_BBZC (reportid\n" +
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
                + "'" + info.getReportid() + "',"
                + "'" + info.getBh() + "',"
                + "'" + info.getDcfffldm() + "',"
                + "'" + info.getBbzwqc() + "',"
                + "'" + info.getBbywqc() + "',"
                + "'" + info.getBbzwjc() + "',"
                + "'" + info.getBb() + "',"
                + "'" + info.getBblx() + "',"
                + "'" + info.getZyfldm() + "',"
                + "'" + info.getZgzy() + "',"
                + "'" + info.getTbsm() + "',"
                + "'" + info.getWh() + "',"
                + "'" + info.getDcnr() + "',"
                + "'" + info.getDcpddm() + "',"
                + "'" + info.getDcpdms() + "',"
                + "'" + info.getQysj() + "',"
                + "'" + info.getTysj() + "',"
                + "'" + info.getYxqz() + "',"
                + "'" + info.getBbsx() + "',"
                + "'" + info.getTxsj() + "',"
                + "'" + info.getTxsjms() + "',"
                + "'" + info.getBbztdm() + "',"
                + "'" + info.getBbjb() + "',"
                + "'" + info.getSpr() + "',"
                + "'" + info.getSpjg() + "',"
                + "'" + info.getPzhjg() + "',"
                + "'" + info.getPzwh() + "',"
                + "'" + info.getBajg() + "',"
                + "'" + info.getBawh() + "',"
                + "'" + info.getZbjg() + "',"
                + "'" + info.getGljg() + "',"
                + "'" + info.getGljgfzr() + "',"
                + "'" + info.getWlbmc() + "',"
                + "'" + info.getBz() + "',"
                + "'" + info.getBzh() + "',"
                + "'" + info.getCjr() + "',"
                + "'" + info.getCjsj() + "',"
                + "'" + info.getXgr() + "',"
                + "'" + info.getXgsj() + "',"
                + "'" + info.getTjspsj() + "',"
                + "'" + info.getSfyxjzlssj() + "',"
                + "'" + info.getBbbgsm() + "',"
                + "'" + info.getQzbh() + "',"
                + "'" + info.getSybbid() + "',"
                + "'" + info.getSqbid() + "',"
                + "'" + info.getTqbh() + "',"
                + "'" + info.getLsbz() + "',"
                + "'" + info.getTjdcdxjblxdm() + "',"
                + "'" + info.getDclylx() + "',"
                + "'" + info.getZbs() + "',"
                + "'" + info.getBywj() + "',"
                + "'" + info.getBdcml() + "',"
                + "'" + info.getHzgxyj() + "',"
                + "'" + info.getHzbsjys() + "',"
                + "'" + info.getBbqjbl() + "',"
                + "'" + info.getMs() + "',"
                + "'" + info.getSpyj() + "',"
                + "'" + info.getBfgbbid() + "',"
                + "'" + info.getScbz() + "',"
                + "'" + info.getSfkwhtbfw() + "',"
                + "'" + info.getHzsjls() + "',"
                + "'" + info.getGzbbbm() + "',"
                + "'" + info.getGzmlbm() + "',"
                + "'" + info.getSjylx() + "',"
                + "'" + info.getCjbm() + "',"
                + "'" + info.getBbcjsj() + "',"
                + "'" + info.getXdr() + "',"
                + "'" + info.getXdsj() + "',"
                + "'" + info.getXdsm() + "',"
                + "'" + info.getBbsm() + "',"
                + "'" + info.getTbfw() + "',"
                + "'" + info.getBbqbdm() + "',"
                + "'" + info.getSsrw() + "',"
                + "'" + info.getTbsjsm() + "',"
                + "'" + info.getBbsyhy() + "',"
                + "'" + info.getHzsyjgdm() + "',"
                + "'" + info.getSjbs() + "',"
                + "'" + info.getBydx() + "',"
                + "'" + info.getQsfs() + "',"
                + "'" + info.getHtmlby() + "',"
                + "'" + info.getExcelby() + "',"
                + "'" + info.getNbbs() + "',"
                + "'" + info.getHzblx() + "',"
                + "'" + info.getSjcjfs() + "',"
                + "'" + info.getBbfl() + "',"
                + "'" + info.getHzbsjbb() + "',"
                + "'" + info.getBbzldm() + "',"
                + "'" + info.getDcdxlxdm() + "',"
                + "'" + info.getTbdyfw() + "',"
                + "'" + info.getTbhyfw() + "',"
                + "'" + info.getDcdwsl() + "',"
                + "'" + info.getBsdw() + "',"
                + "'" + info.getBsdwlxdm() + "',"
                + "'" + info.getBsfsdm() + "',"
                + "'" + info.getHzfsdm() + "',"
                + "'" + info.getReReportid() + "',"
                + "'" + info.getSftb() + "',"
                + "'" + info.getTjzydm() + "',"
                + "'" + info.getSfglb() + "',"
                + "'" + info.getSffrb() + "',"
                + "'" + info.getHasSqTq() + "',"
                + "'" + info.getSetRowBgcolor() + "',"
                + "'" + info.getBlockjson() + "',"
                + "'" + info.getTblx() + "',"
                + "'" + info.getYw01() + "',"
                + "'" + info.getYw02() + "',"
                + "'" + info.getYw03() + "',"
                + "'" + info.getYw04() + "',"
                + "'" + info.getYw05() + "',"
                + "'" + info.getYw06() + "',"
                + "'" + info.getYw07() + "',"
                + "'" + info.getYw08() + "',"
                + "'" + info.getYw09() + "',"
                + "'" + info.getYw10() + "'" + ")";
    }

    @Override
    String updateSql(GhBbBbzc info) {
        return "update CJCL.GH_BB_BBZC " +
                "set "
                +"REPORTID = " + "'" + info.getReportid() + "',"
                +"BH = " + "'" + info.getBh() + "',"
                +"DCFFFLDM = " + "'" + info.getDcfffldm() + "',"
                +"BBZWQC = " + "'" + info.getBbzwqc() + "',"
                +"BBYWQC = " + "'" + info.getBbywqc() + "',"
                +"BBZWJC = " + "'" + info.getBbzwjc() + "',"
                +"BB = " + "'" + info.getBb() + "',"
                +"BBLX = " + "'" + info.getBblx() + "',"
                +"ZYFLDM = " + "'" + info.getZyfldm() + "',"
                +"ZGZY = " + "'" + info.getZgzy() + "',"
                +"TBSM = " + "'" + info.getTbsm() + "',"
                +"WH = " + "'" + info.getWh() + "',"
                +"DCNR = " + "'" + info.getDcnr() + "',"
                +"DCPDDM = " + "'" + info.getDcpddm() + "',"
                +"DCPDMS = " + "'" + info.getDcpdms() + "',"
                +"QYSJ = " + "'" + info.getQysj() + "',"
                +"TYSJ = " + "'" + info.getTysj() + "',"
                +"YXQZ = " + "'" + info.getYxqz() + "',"
                +"BBSX = " + "'" + info.getBbsx() + "',"
                +"TXSJ = " + "'" + info.getTxsj() + "',"
                +"TXSJMS = " + "'" + info.getTxsjms() + "',"
                +"BBZTDM = " + "'" + info.getBbztdm() + "',"
                +"BBJB = " + "'" + info.getBbjb() + "',"
                +"SPR = " + "'" + info.getSpr() + "',"
                +"SPJG = " + "'" + info.getSpjg() + "',"
                +"PZHJG = " + "'" + info.getPzhjg() + "',"
                +"PZWH = " + "'" + info.getPzwh() + "',"
                +"BAJG = " + "'" + info.getBajg() + "',"
                +"BAWH = " + "'" + info.getBawh() + "',"
                +"ZBJG = " + "'" + info.getZbjg() + "',"
                +"GLJG = " + "'" + info.getGljg() + "',"
                +"GLJGFZR = " + "'" + info.getGljgfzr() + "',"
                +"WLBMC = " + "'" + info.getWlbmc() + "',"
                +"BZ = " + "'" + info.getBz() + "',"
                +"BZH = " + "'" + info.getBzh() + "',"
                +"CJR = " + "'" + info.getCjr() + "',"
                +"CJSJ = " + "'" + info.getCjsj() + "',"
                +"XGR = " + "'" + info.getXgr() + "',"
                +"XGSJ = " + "'" + info.getXgsj() + "',"
                +"TJSPSJ = " + "'" + info.getTjspsj() + "',"
                +"SFYXJZLSSJ = " + "'" + info.getSfyxjzlssj() + "',"
                +"BBBGSM = " + "'" + info.getBbbgsm() + "',"
                +"QZBH = " + "'" + info.getQzbh() + "',"
                +"SYBBID = " + "'" + info.getSybbid() + "',"
                +"SQBID = " + "'" + info.getSqbid() + "',"
                +"TQBH = " + "'" + info.getTqbh() + "',"
                +"LSBZ = " + "'" + info.getLsbz() + "',"
                +"TJDCDXJBLXDM = " + "'" + info.getTjdcdxjblxdm() + "',"
                +"DCLYLX = " + "'" + info.getDclylx() + "',"
                +"ZBS = " + "'" + info.getZbs() + "',"
                +"BYWJ = " + "'" + info.getBywj() + "',"
                +"BDCML = " + "'" + info.getBdcml() + "',"
                +"HZGXYJ = " + "'" + info.getHzgxyj() + "',"
                +"HZBSJYS = " + "'" + info.getHzbsjys() + "',"
                +"BBQJBL = " + "'" + info.getBbqjbl() + "',"
                +"MS = " + "'" + info.getMs() + "',"
                +"SPYJ = " + "'" + info.getSpyj() + "',"
                +"BFGBBID = " + "'" + info.getBfgbbid() + "',"
                +"SCBZ = " + "'" + info.getScbz() + "',"
                +"SFKWHTBFW = " + "'" + info.getSfkwhtbfw() + "',"
                +"HZSJLS = " + "'" + info.getHzsjls() + "',"
                +"GZBBBM = " + "'" + info.getGzbbbm() + "',"
                +"GZMLBM = " + "'" + info.getGzmlbm() + "',"
                +"SJYLX = " + "'" + info.getSjylx() + "',"
                +"CJBM = " + "'" + info.getCjbm() + "',"
                +"BBCJSJ = " + "'" + info.getBbcjsj() + "',"
                +"XDR = " + "'" + info.getXdr() + "',"
                +"XDSJ = " + "'" + info.getXdsj() + "',"
                +"XDSM = " + "'" + info.getXdsm() + "',"
                +"BBSM = " + "'" + info.getBbsm() + "',"
                +"TBFW = " + "'" + info.getTbfw() + "',"
                +"BBQBDM = " + "'" + info.getBbqbdm() + "',"
                +"SSRW = " + "'" + info.getSsrw() + "',"
                +"TBSJSM = " + "'" + info.getTbsjsm() + "',"
                +"BBSYHY = " + "'" + info.getBbsyhy() + "',"
                +"HZSYJGDM = " + "'" + info.getHzsyjgdm() + "',"
                +"SJBS = " + "'" + info.getSjbs() + "',"
                +"BYDX = " + "'" + info.getBydx() + "',"
                +"QSFS = " + "'" + info.getQsfs() + "',"
                +"HTMLBY = " + "'" + info.getHtmlby() + "',"
                +"EXCELBY = " + "'" + info.getExcelby() + "',"
                +"NBBS = " + "'" + info.getNbbs() + "',"
                +"HZBLX = " + "'" + info.getHzblx() + "',"
                +"SJCJFS = " + "'" + info.getSjcjfs() + "',"
                +"BBFL = " + "'" + info.getBbfl() + "',"
                +"HZBSJBB = " + "'" + info.getHzbsjbb() + "',"
                +"BBZLDM = " + "'" + info.getBbzldm() + "',"
                +"DCDXLXDM = " + "'" + info.getDcdxlxdm() + "',"
                +"TBDYFW = " + "'" + info.getTbdyfw() + "',"
                +"TBHYFW = " + "'" + info.getTbhyfw() + "',"
                +"DCDWSL = " + "'" + info.getDcdwsl() + "',"
                +"BSDW = " + "'" + info.getBsdw() + "',"
                +"BSDWLXDM = " + "'" + info.getBsdwlxdm() + "',"
                +"BSFSDM = " + "'" + info.getBsfsdm() + "',"
                +"HZFSDM = " + "'" + info.getHzfsdm() + "',"
                +"RE_REPORTID = " + "'" + info.getReReportid() + "',"
                +"SFTB = " + "'" + info.getSftb() + "',"
                +"TJZYDM = " + "'" + info.getTjzydm() + "',"
                +"SFGLB = " + "'" + info.getSfglb() + "',"
                +"SFFRB = " + "'" + info.getSffrb() + "',"
                +"HAS_SQ_TQ = " + "'" + info.getHasSqTq() + "',"
                +"SET_ROW_BGCOLOR = " + "'" + info.getSetRowBgcolor() + "',"
                +"BLOCKJSON = " + "'" + info.getBlockjson() + "',"
                +"TBLX = " + "'" + info.getTblx() + "',"
                +"YW_01 = " + "'" + info.getYw01() + "',"
                +"YW_02 = " + "'" + info.getYw02() + "',"
                +"YW_03 = " + "'" + info.getYw03() + "',"
                +"YW_04 = " + "'" + info.getYw04() + "',"
                +"YW_05 = " + "'" + info.getYw05() + "',"
                +"YW_06 = " + "'" + info.getYw06() + "',"
                +"YW_07 = " + "'" + info.getYw07() + "',"
                +"YW_08 = " + "'" + info.getYw08() + "',"
                +"YW_09 = " + "'" + info.getYw09() + "',"
                +"YW_10 = " + "'" + info.getYw10() + "',"
                + " where REPORTID=" + info.getReReportid();
    }

    @Override
    String deleteSql(GhBbBbzc info) {  //
        return "delete from CJCL.GH_BB_BBZC where ZZID =" + info.getReReportid();
    }

    @Override
    public String getKing(GhBbBbzc info) {
        return info.getKing();
    }
}
