package com.example.demo.service;

import com.example.demo.entity.Order;
import com.example.demo.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Service class for managing Order operations.
 */
@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    /**
     * Saves a new order in the database.
     * @param order The order to save.
     * @return The saved order.
     */
    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }

    /**
     * Finds an order by its ID.
     * @param id The ID of the order.
     * @return An Optional containing the found order, or empty if not found.
     */
    public Optional<Order> findById(Long id) {
        return orderRepository.findById(id);
    }

    /**
     * Retrieves all orders from the database.
     * @return A list of orders.
     */
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    /**
     * Updates an existing order.
     * @param order The order to update.
     * @return The updated order.
     */
    public Order updateOrder(Order order) {
        return orderRepository.save(order);
    }

    /**
     * Deletes an order by its ID.
     * @param id The ID of the order to delete.
     */
    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }
}