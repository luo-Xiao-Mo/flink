package com.luo.flink.service.dao;

import com.luo.flink.entity.business.Info;


public class InfoService extends AbstractService<Info> {

    @Override
    String insertSql(Info info) {
        return "insert into FAMILY.US (SID, SNAME, SEX) values ("
                + "'" + info.getSID() + "',"
                + "'" + info.getSNAME() + "',"
                + "'" + info.getSEX() + "'" + ")";
    }

    @Override
    String updateSql(Info info) {
        return "update FAMILY.US set SNAME = " + "'" + info.getSNAME() + "'," + "SEX =" + "'" + info.getSEX() + "'" + " where SID=" + info.getSID();
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
