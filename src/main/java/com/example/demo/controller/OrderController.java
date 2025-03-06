package com.example.demo.controller;

import com.example.demo.entity.Order;
import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * REST controller for managing orders in the system.
 */
@RestController
@RequestMapping("/api/order")
@CrossOrigin("*")
public class OrderController {

    @Autowired
    private OrderService orderService;

    /**
     * Saves a new order in the database.
     * @param order Order data to be registered.
     * @return Saved order.
     */
    @PostMapping("/save")
    public Order saveOrder(@RequestBody Order order) {
        return orderService.saveOrder(order);
    }

    /**
     * Retrieves an order by its ID.
     * @param id Unique identifier of the order.
     * @return Order found or empty if not exists.
     */
    @GetMapping("/{id}")
    public Optional<Order> getOrder(@PathVariable Long id) {
        return orderService.findById(id);
    }

    /**
     * Retrieves the list of all registered orders.
     * @return List of orders.
     */
    @GetMapping("/getAll")
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }

    /**
     * Updates an existing order's information.
     * @param id ID of the order to update.
     * @param order Updated order data.
     * @return Updated order.
     */
    @PutMapping("/{id}")
    public Order updateOrder(@RequestBody Order order, @PathVariable Long id) {
        order.setId(id);
        return orderService.updateOrder(order);
    }

    /**
     * Deletes an order by its ID.
     * @param id The ID of the order to delete.
     */
    @DeleteMapping("/{id}")
    public void deleteOrder(@PathVariable Long id) {
        orderService.deleteOrder(id);
    }
}
