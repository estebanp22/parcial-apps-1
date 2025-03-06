package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

/**
 * Represents a customer who places orders in the café-bar.
 */
@Entity
@Table(name = "customers")
@Data
public class Customer {

    /**
     * Id for the customer.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Full name of the customer.
     */
    @Column(nullable = false, length = 100)
    private String name;

    /**
     * Contact email of the customer.
     */
    @Column(nullable = false, length = 100, unique = true)
    private String email;

    /**
     * Contact phone number of the customer.
     */
    @Column(length = 20)
    private String phone;
}
