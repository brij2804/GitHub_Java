package com.brijesh.springbootmongodbbasics.service;

import com.brijesh.springbootmongodbbasics.entity.Customer;
import com.brijesh.springbootmongodbbasics.repository.CustomerRepository;
import com.brijesh.springbootmongodbbasics.utils.StaticValues;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository respository;

    public Customer getCustomerByFirstName(String firstName) {
        return respository.findByFirstName(firstName);
    }

    public List<Customer> getAllCustomerByLastName(String lastName) {
        return respository.findByLastName(lastName);
    }

    public List<Customer> findAllCustomer() {
        return respository.findAll();
    }

    public List<Customer> saveCustomer(String firstName, String lastName) {
        Customer customer = new Customer(firstName, lastName);
        customer.setId(StaticValues.getIdCounter());
        respository.save(customer);
        return respository.findAll();
    }

    public List<Customer> saveCustomer(Customer customer) {
        customer.setId(StaticValues.getIdCounter());
        respository.save(customer);
        return respository.findAll();
    }

    public void deleteAllCustomers() {
        StaticValues.setIdCounter();
        respository.deleteAll();
    }

    public List<Customer> deleteCustomerByFirstName(String firstname) {
        respository.deleteByFirstName(firstname);
        return respository.findAll();
    }

}
