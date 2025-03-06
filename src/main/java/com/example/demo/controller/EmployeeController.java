package com.example.demo.controller;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * REST controller for managing employees in the system.
 */
@RestController
@RequestMapping("/api/employee")
@CrossOrigin("*")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    /**
     * Saves a new employee in the database.
     * @param employee Employee data to be registered.
     * @return Saved employee.
     */
    @PostMapping("/save")
    public Employee saveEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    /**
     * Retrieves an employee by its ID.
     * @param id Unique identifier of the employee.
     * @return Employee found or empty if not exists.
     */
    @GetMapping("/{id}")
    public Optional<Employee> getEmployee(@PathVariable Long id) {
        return employeeService.findById(id);
    }

    /**
     * Retrieves the list of all registered employees.
     * @return List of employees.
     */
    @GetMapping("/getAll")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    /**
     * Updates an existing employee's information.
     * @param id ID of the employee to update.
     * @param employee Updated employee data.
     * @return Updated employee.
     */
    @PutMapping("/{id}")
    public Employee updateEmployee(@RequestBody Employee employee, @PathVariable Long id) {
        employee.setId(id);
        return employeeService.updateEmployee(employee);
    }

    /**
     * Deletes an employee by its ID.
     * @param id The ID of the employee to delete.
     */
    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
    }
}

