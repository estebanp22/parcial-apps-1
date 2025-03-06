package com.example.demo.service;

import com.example.demo.entity.Category;
import com.example.demo.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Service class for managing Category operations.
 */
@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    /**
     * Saves a new category in the database.
     * @param category The category to save.
     * @return The saved category.
     */
    public Category saveCategory(Category category) {
        return categoryRepository.save(category);
    }

    /**
     * Finds a category by its ID.
     * @param id The ID of the category.
     * @return An Optional containing the found category, or empty if not found.
     */
    public Optional<Category> findById(Long id) {
        return categoryRepository.findById(id);
    }

    /**
     * Retrieves all categories from the database.
     * @return A list of categories.
     */
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    /**
     * Updates an existing category.
     * @param category The category to update.
     * @return The updated category.
     */
    public Category updateCategory(Category category) {
        return categoryRepository.save(category);
    }

    /**
     * Deletes a category by its ID.
     * @param id The ID of the category to delete.
     */
    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }
}
