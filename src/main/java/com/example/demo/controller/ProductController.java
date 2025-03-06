package com.example.demo.controller;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * REST controller for managing products in the system.
 */
@RestController
@RequestMapping("/api/product")
@CrossOrigin("*")
public class ProductController {

    @Autowired
    private ProductService productService;

    /**
     * Saves a new product in the database.
     * @param product Product data to be registered.
     * @return Saved product.
     */
    @PostMapping("/save")
    public Product saveProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }

    /**
     * Retrieves a product by its ID.
     * @param id Unique identifier of the product.
     * @return Product found or empty if not exists.
     */
    @GetMapping("/{id}")
    public Optional<Product> getProduct(@PathVariable Long id) {
        return productService.findById(id);
    }

    /**
     * Retrieves the list of all registered products.
     * @return List of products.
     */
    @GetMapping("/getAll")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    /**
     * Updates an existing product's information.
     * @param id ID of the product to update.
     * @param product Updated product data.
     * @return Updated product.
     */
    @PutMapping("/{id}")
    public Product updateProduct(@RequestBody Product product, @PathVariable Long id) {
        product.setId(id);
        return productService.updateProduct(product);
    }

    /**
     * Deletes a product by its ID.
     * @param id The ID of the product to delete.
     */
    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
    }
}
