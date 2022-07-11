package com.luo.flink.service.dao;

import com.luo.flink.entity.business.GyMlTjzy;

public class GyMlTjzyService extends AbstractService<GyMlTjzy> {
    @Override
    String insertSql(GyMlTjzy info) {
        return "insert into GY_ML_TJZY_TARGET (code, name) values ("
                + "'" + info.getCode() + "',"
                + "'" + info.getName() + "'" + ")";
    }

    @Override
    String updateSql(GyMlTjzy info) {
        return "update GY_ML_TJZY_TARGET set NAME = " + "'" + info.getName() + "'" + " where CODE=" + info.getCode();
    }

    @Override
    String deleteSql(GyMlTjzy info) {
        return "delete from GY_ML_TJZY_TARGET where CODE =" + info.getCode();
    }

    @Override
    public String getKing(GyMlTjzy info) {
        return info.getKing();
    }
}
