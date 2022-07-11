package com.luo.flink.service.dao;

import com.luo.flink.entity.business.Info;


public class InfoService extends AbstractService<Info> {

    @Override
    String insertSql(Info info) {
        return "insert into TEST_SHANGHAIJCPT_DB_FLINK.MESSAGE (SID, SNAME, SEX,b1,c1) values ("
                + "'" + info.getSID() + "',"
                + "'" + info.getSNAME() + "',"
                + "'" + info.getSNAME() + "',"
                 + info.getB1() + ","
                 + info.getC1() + ")";
    }

    @Override
    String updateSql(Info info) {
        return "update MESSAGE set SNAME = " + "'" + info.getSNAME() + "'," + "SEX =" + "'" + info.getSEX() + "'" + " where SID=" + info.getSID();
    }

    @Override
    String deleteSql(Info info) {
        return "delete from FAMILY.US where SID =" + info.getSID();
    }

    @Override
    public String getKing(Info info) {
        return info.getKing();
    }
}
