package com.example.demo.repository;

import com.example.demo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository for managing Product entities.
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
