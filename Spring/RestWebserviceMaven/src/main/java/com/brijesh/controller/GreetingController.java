package com.brijesh.controller;

import com.brijesh.model.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;


public interface GreetingController {
    public Greeting greeting( String name);
}
