package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

/**
 * Represents a product available in the café-bar menu.
 */
@Entity
@Table(name = "products")
@Data
public class Product {

    /**
     * Unique identifier for the product.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Name of the product.
     */
    @Column(nullable = false, length = 100)
    private String name;

    /**
     * Price of the product.
     */
    @Column(nullable = false)
    private double price;

    /**
     * Category to which the product belongs.
     */
    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;
}
