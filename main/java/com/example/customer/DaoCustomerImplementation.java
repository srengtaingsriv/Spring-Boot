package com.example.customer;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class DaoCustomerImplementation implements DaoCustomer{
    private final EntityManager entityManager;
    public DaoCustomerImplementation(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    @Override
    public List<Customer> finAllCustomers() {
        TypedQuery<Customer> query = entityManager.createQuery("SELECT c FROM Customer c", Customer.class);
        return query.getResultList();
    }

    @Override
    public Customer finCustomerById(int id) {
        return entityManager.find(Customer.class, id);
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        return entityManager.merge(customer);
    }
}
