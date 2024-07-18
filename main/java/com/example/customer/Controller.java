package com.example.customer;

import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    @RequestMapping("/customer")
    public class Controller {
        public  Service customerService;

        public Controller(Service customerService) {
            this.customerService = customerService;
        }
        @GetMapping()
        public List<Customer> getCustomers() {
            return customerService.getAllCustomers();
        }

        @GetMapping("/{id}")
        public Customer getCustomer(@PathVariable int id) {
            return customerService.getCustomer(id);
        }
        @PostMapping()
        public Customer createCustomer(@RequestBody Customer customer) {
            return customerService.addCustomer(customer);
        }
        @PutMapping("/{id}")
        public Customer updateCustomer(@PathVariable int id, @RequestBody Customer customer) {
            return customerService.updateCustomer(id, customer);
        }
    }



