package com.example.demo.repository;

import com.example.demo.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository for managing Order entities.
 */
@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
