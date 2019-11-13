package com.brijesh.springbootrestful.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.xml.bind.annotation.XmlType;
import java.util.*;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    private static final List<VendorExtension> vendorExtensions = new ArrayList<VendorExtension>();
    public static final Contact DEFAULT_CONTACT = new Contact("Brijesh", "http://dummyurl", "abc@xyz.com");
    private static final ApiInfo DEFAULT_API_INFO = new ApiInfo("Api Documentation", "Api Documentation", "1.0", "http://dummyurl.com", DEFAULT_CONTACT, "Apache2.0", "http://dummyurlagain.com", vendorExtensions);
    private Set<String> DEFAULT_PRODUCES_AND_CONSUMES = new HashSet<String>(Arrays.asList("application/json", "application/xml"));

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(DEFAULT_API_INFO).produces(DEFAULT_PRODUCES_AND_CONSUMES).consumes(DEFAULT_PRODUCES_AND_CONSUMES);
    }
}
