package com.jack.trade.limitservice.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class LimitConfiguration {
    private int maximum;
    private int minimum;
}
