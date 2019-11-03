package com.brijesh.springbootrestful.controller;

import com.brijesh.springbootrestful.beans.HelloWorldBean;
import org.springframework.web.bind.annotation.*;

//controller
@RestController
public class HelloWorldController {

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
}
