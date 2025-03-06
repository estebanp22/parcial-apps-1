package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

/**
 * Represents an employee working in the café-bar.
 */
@Entity
@Table(name = "employees")
@Data
public class Employee {

    /**
     * Id for the employee.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Full name of the employee.
     */
    @Column(nullable = false, length = 100)
    private String name;

    /**
     * Employee's job position.
     */
    @Column(nullable = false, length = 50)
    private String position;

    /**
     * Contact email of the employee.
     */
    @Column(nullable = false, length = 100, unique = true)
    private String email;
}
