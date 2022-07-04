package com.luo.flink.service;

import com.luo.flink.entity.business.P;

public class PService extends AbstractService<P> {
    @Override
    String insertSql(P info) {
        return "insert into FAMILY.P2 (ID, NAME) values ("
                + "'" + info.getID() + "',"
                + "'" + info.getNAME() + "'" + ")";
    }

    @Override
    String updateSql(P info) {
        return null;
    }

    @Override
    String deleteSql(P info) {
        return null;
    }

    @Override
    public String getKing(P info) {
        return info.getKing();
    }
}
