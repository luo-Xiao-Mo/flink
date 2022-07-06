package com.luo.flink.entity.business;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

import java.sql.Timestamp;
import java.util.Map;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TFillTask {
    private String king;
    private String areaCode;
    private String tjzydm;
    private String bh;
    private String bgqb;
    private String bgq;
    private String dwxtm;
    private String tyshxydm;
    private String orgname;
    private Timestamp tbjzrq;
    private String sbqk;
    private String sbsj;
    private Timestamp createTime;
    private Timestamp updateTime;
    private String bbzwqc;
    //当前报表的id
    private String reportId;
    private String tbkssj;
    //当前code编码
    private String code;
    private String zzid;

    public TFillTask assignment(Map<String, String> m1,
                                Map<String, Map<String, String>> m2) {
        fullName(m1);
        fullZwqc(m2);
        return this;
    }

    private void fullName(Map<String, String> map) {
        String value = map.get(code);
        if (StringUtils.isNotEmpty(value)) this.setTjzydm(value);
    }

    private void fullZwqc(Map<String, Map<String, String>> map) {
        Map<String, String> tempMap = map.get(reportId);
        if (!tempMap.isEmpty()) {
            String value = tempMap.get(bh);
            if (StringUtils.isNotEmpty(value)) this.setBbzwqc(value);
        }
    }
}
