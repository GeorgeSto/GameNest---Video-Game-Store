package com.example.GameNest.controller;

import com.example.GameNest.service.CategoryService;
import org.springframework.web.bind.annotation.*;

/**
 * Controller for category operations within the GameNest application.
 * Provides endpoints for adding, finding, updating, and deleting categories.
 * This controller relies on {CategoryService} to perform the actual business logic.
 */
@RestController
@RequestMapping("/category")
public class ControllerCategory {

    private final CategoryService categoryService;

    /**
     * Constructs a new ControllerCategory with the specified CategoryService.
     * @param categoryService The category service to use for category operations. This service
     * provides the logic for adding, finding, updating, and deleting categories.
     */
    public ControllerCategory(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    /**
     * Adds a new category.
     * @param categoryData The category data to add. This includes the name and description of the category.
     */
    @PostMapping("/insert")
    public void addCategory(@RequestBody CategoryData categoryData) {
        this.categoryService.insertCategory(categoryData);
    }

    /**
     * Finds a category. The method signature suggests this might be intended to return category information,
     * but currently does not return anything. Consider updating the method to return a {CategoryData}
     * or a collection of {CategoryData} objects as appropriate.
     * @param categoryData The category to find. This is likely meant to include criteria to search for the category.
     */
    @GetMapping("/get")
    public void findCategory(@RequestBody CategoryData categoryData) {
        this.categoryService.findCategory(categoryData);
    }

    /**
     * Updates an existing category.
     * @param categoryData The new data for the category. This should include the category's
     * identifier and the new values for the name and/or description.
     */
    @PutMapping("/update")
    public void updateCategory(@RequestBody CategoryData categoryData) {
        this.categoryService.updateCategory(categoryData);
    }

    /**
     * Deletes a category.
     * @param categoryData The category to delete. This should include the identifier of the category to be deleted.
     */
    @DeleteMapping("/delete")
    public void deleteCategory(@RequestBody CategoryData categoryData) {
        this.categoryService.deleteCategory(categoryData);
    }
}
