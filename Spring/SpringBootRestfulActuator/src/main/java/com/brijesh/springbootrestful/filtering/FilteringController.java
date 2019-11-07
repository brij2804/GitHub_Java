package com.brijesh.springbootrestful.filtering;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class FilteringController {

    @GetMapping("/filtering")
    public FilterBean retrieveFilterBean(){
         return new FilterBean("value1","value2","value3");
    }

    @GetMapping("/filtering-list")
    public List<FilterBean> retrieveLostOfFilterBean(){
        return Arrays.asList(new FilterBean("value1", "value2", "value3"),new FilterBean("value12","value22","value23"));
    }
}
