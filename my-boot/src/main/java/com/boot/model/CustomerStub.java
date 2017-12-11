package com.boot.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Component;

@Component
public class CustomerStub {

    private Map<String, Customer> customers;

    /*
     * initially has been intended to use as static stub,
     * converted to spring component for show-case purpose.
     *
    static {
        Customer a = new Customer(UUID.randomUUID().toString(), "Max", "Mustermann", 1000.0f);
        customers.put(a.getId(), a);
        Customer b = new Customer(UUID.randomUUID().toString(), "Gabi", "Musterfrau", 1000.0f);
        customers.put(b.getId(), b);
        Customer c = new Customer(UUID.randomUUID().toString(), "Erika", "Test", 1000.0f);
        customers.put(c.getId(), c);
    }
    */

    public CustomerStub() {
        customers = new HashMap<>();
        Customer a = new Customer(UUID.randomUUID().toString(), "Max", "Mustermann", 1000.0f);
        customers.put(a.getId(), a);
        Customer b = new Customer(UUID.randomUUID().toString(), "Gabi", "Musterfrau", 1000.0f);
        customers.put(b.getId(), b);
        Customer c = new Customer(UUID.randomUUID().toString(), "Erika", "Test", 1000.0f);
        customers.put(c.getId(), c);
    }

    public Iterable<Customer> list() {
        return new ArrayList<Customer>(customers.values());
    }

    public Customer create(Customer customer) {
        customer.setId(UUID.randomUUID().toString());
        customers.put(customer.getId(), customer);
        return customer;
    }

    public Customer get(String id) {
        return customers.get(id);
    }

    public Customer update(String id, Customer customer) {
        customers.put(id, customer);
        return customer;
    }

    public Customer delete(String id) {
        return customers.remove(id);
    }

}
