package com.brijesh.springbootmongodbbasics.controller;

import com.brijesh.springbootmongodbbasics.entity.Customer;
import com.brijesh.springbootmongodbbasics.repository.CustomerRepository;
import com.brijesh.springbootmongodbbasics.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class CustomerController {

    @Autowired
    private CustomerService service;

    @GetMapping("/customers/firstName/{firstName}")
    public Customer getCustomerByFirstName(@PathVariable String firstName) {
        return service.getCustomerByFirstName(firstName);
    }

    @GetMapping("/customers/lastName/{lastName}")
    public List<Customer> getAllCustomerByLastName(@PathVariable String lastName) {
        return service.getAllCustomerByLastName(lastName);
    }

    @GetMapping("/customers")
    public List<Customer> findAllCustomer() {
        return service.findAllCustomer();
    }

    @PostMapping("/customers/firstname/{firstName}/lastname/{lastName}")
    public List<Customer> saveCustomer(@PathVariable String firstName, @PathVariable String lastName) {
        return service.saveCustomer(firstName, lastName);
    }

    @PostMapping("/customers")
    public List<Customer> saveCustomer(@RequestBody Customer customer) {
        return service.saveCustomer(customer);
    }

    @DeleteMapping("/customers")
    public void deleteAllCustomers() {
        service.deleteAllCustomers();
    }

    @DeleteMapping("/customers/firstName/{firstName}")
    public List<Customer> deleteCustomerByFirstName(@PathVariable String firstName) {
        return service.deleteCustomerByFirstName(firstName);
    }
}
