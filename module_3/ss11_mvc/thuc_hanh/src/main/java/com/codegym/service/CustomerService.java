package com.codegym.service;

import com.codegym.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findall();
    void save(Customer customer);
    Customer findByid(int id);
    void update(int id,Customer customer);
    void remove(int id);
}
