package com.brijesh.springbootrestful.filtering;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class FilteringController {

    @GetMapping("/filtering")
    public FilterBean retrieveFilterBean() {
        return new FilterBean("value1", "value2", "value3");
    }

    @GetMapping("/filtering-list")
    public List<FilterBean> retrieveLostOfFilterBean() {
        return Arrays.asList(new FilterBean("value1", "value2", "value3"), new FilterBean("value12", "value22", "value23"));
    }

    @GetMapping("/filtering-dynamic")
    public MappingJacksonValue dynamicFilterBean() {
        DynamicFilterBean dynamicFilterBean = new DynamicFilterBean("value1", "value2", "value3");

        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field1", "field2");

        FilterProvider filters = new SimpleFilterProvider().addFilter("dynamicfilter", filter);

        MappingJacksonValue mapping = new MappingJacksonValue(dynamicFilterBean);
        mapping.setFilters(filters);

        return mapping;
    }

    @GetMapping("/filtering-list-dynamic")
    public MappingJacksonValue dynamicLostOfFilterBean() {
        List<DynamicFilterBean> list = Arrays.asList(new DynamicFilterBean("value1", "value2", "value3"), new DynamicFilterBean("value12", "value22", "value23"));

        DynamicFilterBean dynamicFilterBean = new DynamicFilterBean("value1", "value2", "value3");

        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field1", "field2");

        FilterProvider filters = new SimpleFilterProvider().addFilter("dynamicfilter", filter);

        MappingJacksonValue mapping = new MappingJacksonValue(list);
        mapping.setFilters(filters);

        return mapping;


    }
}
