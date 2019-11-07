package com.brijesh.microservices.limitsservice.controller;

import com.brijesh.microservices.limitsservice.beans.LimitConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {
    @GetMapping("/limits")
    public LimitConfiguration retrieveLimitsFromConfigurations(){
      return new LimitConfiguration(1000,1);
    }
}
