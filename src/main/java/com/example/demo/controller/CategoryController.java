package com.example.demo.controller;

import com.example.demo.entity.Category;
import com.example.demo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * REST controller for managing categories in the system.
 */
@RestController
@RequestMapping("/api/category")
@CrossOrigin("*")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    /**
     * Saves a new category in the database.
     * @param category Category data to be registered.
     * @return Saved category.
     */
    @PostMapping("/save")
    public Category saveCategory(@RequestBody Category category) {
        return categoryService.saveCategory(category);
    }

    /**
     * Retrieves a category by its ID.
     * @param id Unique identifier of the category.
     * @return Category found or empty if not exists.
     */
    @GetMapping("/{id}")
    public Optional<Category> getCategory(@PathVariable Long id) {
        return categoryService.findById(id);
    }

    /**
     * Retrieves the list of all registered categories.
     * @return List of categories.
     */
    @GetMapping("/getAll")
    public List<Category> getAllCategories() {
        return categoryService.getAllCategories();
    }

    /**
     * Updates an existing category's information.
     * @param id ID of the category to update.
     * @param category Updated category data.
     * @return Updated category.
     */
    @PutMapping("/{id}")
    public Category updateCategory(@RequestBody Category category, @PathVariable Long id) {
        category.setId(id);
        return categoryService.updateCategory(category);
    }

    /**
     * Deletes a category by its ID.
     * @param id The ID of the category to delete.
     */
    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable Long id) {
        categoryService.deleteCategory(id);
    }
}
