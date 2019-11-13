package com.brijesh.springbootrestful.controller;

import com.brijesh.springbootrestful.beans.HelloWorldBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

//controller
@RestController
public class HelloWorldController {

    @Autowired
    private MessageSource messageSource;

    //GET
    //URI - /hello-world
    //http://localhost:8080/hello-world
    @RequestMapping(method= RequestMethod.GET,path = "/hello-world")
    public String helloWorld(){
        return "Hello World";
    }

    //http://localhost:8080/hello-me
    @GetMapping(path = "/hello-me")
    public String helloMe(){
        return "Hello Me";
    }

    //http://localhost:8080/hello-world-bean
    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World");
    }

    //http://localhost:8080/hello-world/path-variable/brijesh
    @GetMapping(path = "/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name){
        return new HelloWorldBean(String.format("Hello World ,%s",name));
    }

    //GET
    //URI - /hello-world
    //http://localhost:8080/hello-world-internationalized
    @GetMapping(path = "/hello-world-internationalized")
    public String helloWorldInternationalized(@RequestHeader(name="Accept-Language",required = false) Locale locale){
        return messageSource.getMessage("good.morning.message",null,locale);
    }

    //GET
    //URI - /hello-world
    //http://localhost:8080/hello-world-internationalized1
    @GetMapping(path = "/hello-world-internationalized1")
    public String helloWorldInternationalized1(){
        return messageSource.getMessage("good.morning.message",null, LocaleContextHolder.getLocale());
    }
}
