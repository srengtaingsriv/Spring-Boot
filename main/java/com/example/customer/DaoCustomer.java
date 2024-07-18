package com.example.customer;

import java.util.List;

public interface DaoCustomer {

    List<Customer> finAllCustomers();
    Customer finCustomerById(int id);
    Customer saveCustomer(Customer customer);
}
