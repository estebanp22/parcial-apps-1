package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

/**
 * Represents a category of products in the café-bar.
 */
@Entity
@Table(name = "categories")
@Data
public class Category {

    /**
     * Unique identifier for the category.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Name of the category.
     */
    @Column(nullable = false, length = 100, unique = true)
    private String name;

    /**
     * List of products that belong to this category.
     */
    @OneToMany(mappedBy = "category")
    private List<Product> products;
}
