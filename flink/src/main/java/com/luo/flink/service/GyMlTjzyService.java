package com.luo.flink.service;

import com.luo.flink.entity.business.GyMlTjzy;

public class GyMlTjzyService extends AbstractService<GyMlTjzy>{
    @Override
    String insertSql(GyMlTjzy info) {
        return "insert into CJCL.GY_ML_TJZY (code, name) values ("
                + "'" + info.getCode() + "',"
                + "'" + info.getName() + "'" + ")";
    }

    @Override
    String updateSql(GyMlTjzy info) {
        return "update CJCL.GY_ML_TJZY set NAME = " + "'" + info.getName()  + "'" + " where CODE=" + info.getCode();
    }

    @Override
    String deleteSql(GyMlTjzy info) {
        return "delete from CJCL.GY_ML_TJZY where CODE =" + info.getCode();
    }

    @Override
    public String getKing(GyMlTjzy info) {
        return null;
    }
}