package com.jack.trade.limitservice;

import com.jack.trade.limitservice.bean.LimitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public LimitConfiguration retriveLimitsFromConfigurations()
    {
//        return new LimitConfiguration(1000, 1);
        return new LimitConfiguration( configuration.getMaximum(), configuration.getMinimum() );
    }

}
