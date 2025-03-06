package com.example.demo.service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Service class for managing Employee operations.
 */
@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    /**
     * Saves a new employee in the database.
     * @param employee The employee to save.
     * @return The saved employee.
     */
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    /**
     * Finds an employee by its ID.
     * @param id The ID of the employee.
     * @return An Optional containing the found employee, or empty if not found.
     */
    public Optional<Employee> findById(Long id) {
        return employeeRepository.findById(id);
    }

    /**
     * Retrieves all employees from the database.
     * @return A list of employees.
     */
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    /**
     * Updates an existing employee.
     * @param employee The employee to update.
     * @return The updated employee.
     */
    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    /**
     * Deletes an employee by its ID.
     * @param id The ID of the employee to delete.
     */
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
}