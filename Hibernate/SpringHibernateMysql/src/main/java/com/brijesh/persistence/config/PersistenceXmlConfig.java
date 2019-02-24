package com.brijesh.persistence.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@ComponentScan({"com.brijesh.persistence.dao","com.brijesh.persistence.service"})
@ImportResource({"classpath:hibernate5Config.xml"})
public class PersistenceXmlConfig {

}
