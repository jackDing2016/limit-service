package com.jack.trade.limitservice;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties( "limits-service" )
public class Configuration {

    private int maximum;
    private int minimum;

}
