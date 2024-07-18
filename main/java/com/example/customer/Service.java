package com.example.customer;

import jakarta.transaction.Transactional;

import java.util.List;
@org.springframework.stereotype.Service
@Transactional
public class Service {

    private final DaoCustomer daoCustomer;
    public Service(DaoCustomer daoCustomer) {
        this.daoCustomer = daoCustomer;
    }

    public List<Customer> getAllCustomers() {
        return daoCustomer.finAllCustomers();

    }

    public Customer getCustomer(int id) {
        return daoCustomer.finCustomerById(id);
    }@Transactional
    public Customer addCustomer(Customer customer) {
        customer.setId(0);
        return daoCustomer.saveCustomer(customer);
        //  return customer;
    }@Transactional
    public Customer updateCustomer(int id,Customer customer) {
        customer.setId(id);
        return daoCustomer.saveCustomer(customer);

    }
}
