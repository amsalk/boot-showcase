package com.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.boot.model.Customer;
import com.boot.model.CustomerStub;


@RestController
@RequestMapping("/api/v1/")
public class CustomerController {

    @Autowired
    private CustomerStub customers;

    @RequestMapping(value = "customers", method = RequestMethod.GET)
    public Iterable<Customer> list() {
        return customers.list();
    }

    @RequestMapping(value = "customers/{id}")
    public Customer get(@PathVariable String id) {
        return customers.get(id);
    }

}
