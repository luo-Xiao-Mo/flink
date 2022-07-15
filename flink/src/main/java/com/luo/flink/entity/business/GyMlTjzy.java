package com.luo.flink.entity.business;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.flink.api.java.functions.KeySelector;

import java.sql.Blob;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GyMlTjzy  {

    private String king;
    private String CODE;
    private String NAME;

}
