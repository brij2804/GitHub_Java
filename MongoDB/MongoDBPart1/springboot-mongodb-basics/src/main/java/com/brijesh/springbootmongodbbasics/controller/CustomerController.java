package com.brijesh.springbootmongodbbasics.controller;

import com.brijesh.springbootmongodbbasics.entity.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CustomerController {

    @GetMapping("/customer/{firstName}")
    public Customer getCustomer(@PathVariable String firstName) {
        return null;
    }
}
