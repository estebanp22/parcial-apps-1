package com.example.demo.service;
import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Service class for managing Customer operations.
 */
@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    /**
     * Saves a new customer in the database.
     * @param customer The customer to save.
     * @return The saved customer.
     */
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    /**
     * Finds a customer by its ID.
     * @param id The ID of the customer.
     * @return An Optional containing the found customer, or empty if not found.
     */
    public Optional<Customer> findById(Long id) {
        return customerRepository.findById(id);
    }

    /**
     * Retrieves all customers from the database.
     * @return A list of customers.
     */
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    /**
     * Updates an existing customer.
     * @param customer The customer to update.
     * @return The updated customer.
     */
    public Customer updateCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    /**
     * Deletes a customer by its ID.
     * @param id The ID of the customer to delete.
     */
    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }
}