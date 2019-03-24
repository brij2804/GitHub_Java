package com.brijesh;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class EurekaClientApplication implements GreetingController{
    public static void main(String[] args){
        SpringApplication.run(EurekaClientApplication.class,args);
    }

    @Value("${spring.application.name}")
    private String appName;

    @Override
    public String greeting(){
        return String.format("Hello from World !");
    }
}
