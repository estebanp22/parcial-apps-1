package com.example.demo.controller;

import com.example.demo.entity.Customer;
import com.example.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * REST controller for managing customers in the system.
 */
@RestController
@RequestMapping("/api/customer")
@CrossOrigin("*")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    /**
     * Saves a new customer in the database.
     * @param customer Customer data to be registered.
     * @return Saved customer.
     */
    @PostMapping("/save")
    public Customer saveCustomer(@RequestBody Customer customer) {
        return customerService.saveCustomer(customer);
    }

    /**
     * Retrieves a customer by its ID.
     * @param id Unique identifier of the customer.
     * @return Customer found or empty if not exists.
     */
    @GetMapping("/{id}")
    public Optional<Customer> getCustomer(@PathVariable Long id) {
        return customerService.findById(id);
    }

    /**
     * Retrieves the list of all registered customers.
     * @return List of customers.
     */
    @GetMapping("/getAll")
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    /**
     * Updates an existing customer's information.
     * @param id ID of the customer to update.
     * @param customer Updated customer data.
     * @return Updated customer.
     */
    @PutMapping("/{id}")
    public Customer updateCustomer(@RequestBody Customer customer, @PathVariable Long id) {
        customer.setId(id);
        return customerService.updateCustomer(customer);
    }

    /**
     * Deletes a customer by its ID.
     * @param id The ID of the customer to delete.
     */
    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable Long id) {
        customerService.deleteCustomer(id);
    }
}
