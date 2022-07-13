package com.luo.flink.service.dao;

import com.luo.flink.entity.business.Info;

import javax.sql.rowset.serial.SerialBlob;
import javax.sql.rowset.serial.SerialClob;
import java.sql.SQLException;


public class InfoService extends AbstractService<Info> {

    @Override
    String insertSql(Info info) throws SQLException {
//        return "insert into TEST_SHANGHAIJCPT_DB_FLINK.MESSAGE (SID, SNAME, SEX,b1,c1) values ("
//                + "'" + info.getSID() + "',"
//                + "'" + info.getSNAME() + "',"
//                + "'" + info.getSNAME() + "',"
//                + info.getB1() + ","
//                + info.getC1() + ")";
        String sql = "insert into TEST_SHANGHAIJCPT_DB_FLINK.MESSAGE (SID,SNAME,SEX,b1,c1) " +
                "values(?,?,?,?,?)";
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, info.getSID());
        preparedStatement.setString(2, info.getSNAME());
        preparedStatement.setString(3, info.getSEX());

        if (info.getB1() != null) {
            SerialBlob b = new SerialBlob(info.getB1());
            preparedStatement.setBlob(4, b);
        } else {
            preparedStatement.setString(4, "");
        }
        if (info.getC1() != null) {
            SerialClob c = new SerialClob(info.getC1());
            preparedStatement.setClob(5, c);

        } else {
            preparedStatement.setString(5, "");
        }

        return sql;
    }

    @Override
    String updateSql(Info info) throws SQLException {
        String sql = "update MESSAGE set SNAME =?,SEX =?,b1=?,c1=? where SID=?";
//        return "update MESSAGE set SNAME = " + "'" + info.getSNAME() + "'," + "SEX =" + "'" + info.getSEX() + "'" + " where SID=" + info.getSID();
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, info.getSNAME());
        preparedStatement.setString(2, info.getSEX());
        SerialClob clob = new SerialClob(info.getC1());
        SerialBlob blob = new SerialBlob(info.getB1());
        preparedStatement.setBlob(3, blob);
        preparedStatement.setClob(4, clob);
        preparedStatement.setString(5, info.getSID());
        return sql;
    }

    @Override
    String deleteSql(Info info) throws SQLException {
//        return "delete from TEST_SHANGHAIJCPT_DB_FLINK.INFO_II where SID =" + info.getSID();
        String sql = "delete from TEST_SHANGHAIJCPT_DB_FLINK.INFO_II where SID =?";
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, info.getSID());
        return sql;
    }

    @Override
    public String getKing(Info info) {
        return info.getKing();
    }
}
