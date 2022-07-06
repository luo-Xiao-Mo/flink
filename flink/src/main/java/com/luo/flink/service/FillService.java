package com.luo.flink.service;

import com.google.common.cache.Cache;
import com.luo.flink.entity.business.TFillTask;
import com.luo.flink.type.OperateType;
import com.luo.flink.util.CacheUtil;
import com.luo.flink.util.DruidUtil;
import lombok.extern.slf4j.Slf4j;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

@Slf4j
public class FillService extends AbstractService<TFillTask> {

    private Cache cache = CacheUtil.getInstance();

    /**
     * 查询代码表数据
     */
    @SuppressWarnings("unchecked")
    public Map<String, String> queryCode() {
        Object ifPresent = cache.getIfPresent(OperateType.CACHE_CODE);
        if (ifPresent != null) return (Map<String, String>) ifPresent;
        String sql = "select code,name from gy_ml_tjzy";
        Map<String, String> map = new HashMap<>();
        ResultSet resultSet = query(sql);
        try {
            while (resultSet.next()) {
                String code = resultSet.getString("code");
                String name = resultSet.getString("name");
                map.put(code, name);
            }
        } catch (Exception e) {
            log.error("查询码表异常:", e.getMessage());
        }
        cache.put(OperateType.CACHE_CODE, map);
        return map;
    }

    /**
     * 查询BBZC表数据
     */
    @SuppressWarnings("unchecked")
    public Map<String, Map<String, String>> queryTask() {
        Object ifPresent = cache.getIfPresent(OperateType.CACHE_BB);
        if (ifPresent != null) return (Map<String, Map<String, String>>) ifPresent;
        String sql = "select reportid,bh,bbzwqc from GH_BB_BBZC";
        Map<String, Map<String, String>> map = new HashMap<>();
        ResultSet resultSet = query(sql);
        try {
            while (resultSet.next()) {
                String reportId = resultSet.getString("reportid");
                String bh = resultSet.getString("bh");
                String bbzwqc = resultSet.getString("bbzwqc");
                if (map.containsKey(reportId)) {
                    map.get(reportId).put(bh, bbzwqc);
                } else {
                    map.put(reportId, new HashMap<>());
                }
            }
        } catch (Exception e) {
            log.error("查询码表异常:", e.getMessage());
        }
        cache.put(OperateType.CACHE_BB, map);
        return map;
    }

    /**
     * 查询结果集信息
     *
     * @param sql sql字符串
     */
    private ResultSet query(String sql) {
        ResultSet resultSet = null;
        Connection connection;
        PreparedStatement preparedStatement;
        try {
            connection = DruidUtil.getDmConn();
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
        } catch (Exception e) {
            log.error("建立连接异常:", e.getMessage());
        }
        return resultSet;
    }

    @Override
    String insertSql(TFillTask info) {
        return "insert into T_FILL_TASK (AREA_CODE, TJZYDM, BH,BGQB,BGQ,DWXTM,TYSHXYDM,ORGNAME," +
                "TBJZRQ,SBQK,SBSJ,CREATE_TIME,UPDATE_TIME,BBZWQC,ZZID,TBKSSJ) values ("
                + "'" + info.getAreaCode() + "',"
                + "'" + info.getTjzydm() + "',"
                + "'" + info.getBh() + ",'"
                + "'" + info.getBgqb() + ",'"
                + "'" + info.getBgq() + ",'"
                + "'" + info.getDwxtm() + ",'"
                + "'" + info.getTyshxydm() + ",'"
                + "'" + info.getOrgname() + ",'"
                + "'" + info.getTbjzrq() + ",'"
                + "'" + info.getSbqk() + ",'"
                + "'" + info.getSbsj() + ",'"
                + "'" + info.getCreateTime() + ",'"
                + "'" + info.getUpdateTime() + ",'"
                + "'" + info.getBbzwqc() + ",'"
                + "'" + info.getZzid() + ",'"
                + "'" + info.getTbkssj() + "'"
                + ")";
    }

    @Override
    String updateSql(TFillTask info) {
        return "update T_FILL_TASK set "
                + "AREA_CODE =" + "'" + info.getAreaCode() + "',"
                + "TJZYDM =" + "'" + info.getTjzydm() + "',"
                + "BH =" + "'" + info.getBh() + "',"
                + "BGQB =" + "'" + info.getBgqb() + "',"
                + "DWXTM =" + "'" + info.getDwxtm() + "',"
                + "TYSHXYDM =" + "'" + info.getTyshxydm() + "',"
                + "ORGNAME =" + "'" + info.getOrgname() + "',"
                + "TBJZRQ =" + "'" + info.getTbjzrq() + "',"
                + "SBQK =" + "'" + info.getSbqk() + "',"
                + "SBSJ =" + "'" + info.getSbsj() + "',"
                + "UPDATE_TIME =" + "'" + info.getUpdateTime() + "',"
                + "BBZWQC =" + "'" + info.getBbzwqc() + "',"
                + "TBKSSJ =" + "'" + info.getTbkssj() + "'"
                + " where REPORTID=" + info.getZzid();

    }

    @Override
    String deleteSql(TFillTask info) {
        return "delete from T_FILL_TASK where zzid=" + info.getZzid();
    }

    @Override
    public String getKing(TFillTask info) {
        return info.getKing();
    }
}

