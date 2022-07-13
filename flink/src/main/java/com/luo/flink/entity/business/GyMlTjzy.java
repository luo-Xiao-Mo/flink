package com.luo.flink.entity.business;


import lombok.Builder;
import lombok.Data;
import org.apache.flink.api.java.functions.KeySelector;

@Builder
@Data
public class GyMlTjzy implements KeySelector {

    private String king;
    private String code;
    private String name;

    @Override
    public Object getKey(Object o) throws Exception {
        return null;
    }
}
