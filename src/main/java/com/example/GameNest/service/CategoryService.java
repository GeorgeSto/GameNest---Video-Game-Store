package com.example.GameNest.service;

import com.example.GameNest.controller.CategoryData;
import com.example.GameNest.model.Category;
import com.example.GameNest.repository.ReposityCategory;
import org.springframework.stereotype.Service;

/**
 * Service class for managing categories in the GameNest application.
 * Provides methods to insert, find, update, and delete categories.
 * This service acts as a bridge between the controller and repository layers, translating between
 * {CategoryData} objects used in the web layer and {@Category} entities used in the repository layer.
 */
@Service
public class CategoryService {

    private ReposityCategory reposityCategory;

    /**
     * Constructs a new CategoryService with the specified {RepositoryCategory}.
     * reposityCategory The repository used for category data operations.
     */
    public CategoryService(ReposityCategory reposityCategory)
    {
        this.reposityCategory = reposityCategory;
    }

    /**
     * Inserts a new category into the database.
     * @param categoryData The category data to insert.
     * @return The inserted {Category} entity.
     */
    public Category insertCategory(CategoryData categoryData) {
        Category category = new Category();
        category.setName(categoryData.getName());
        category.setDescription(categoryData.getDescription());

        return reposityCategory.save(category);
    }

    /**
     * Finds a category by its name.
     * @param categoryData The category data containing the name of the category to find.
     * @return The found {Category} entity, or {null} if no category with the given name exists.
     */
    public Category findCategory(CategoryData categoryData)
    {
        Category category = new Category();
        category = reposityCategory.findByName(categoryData.getName());
        System.out.println(category.getCategoryID());
        System.out.println(category.getDescription());
        System.out.println(category.getName());

        return category;
    }


    /**
     * Updates an existing category.
     * @param categoryData The updated category data.
     * @return The updated {Category} entity.
     */
    public Category updateCategory(CategoryData categoryData)
    {
        Category category = findCategory(categoryData);
        category.setName(categoryData.getName());
        category.setDescription(categoryData.getDescription());

        return reposityCategory.save(category);
    }


    /**
     * Deletes a category.
     * @param categoryData The category data of the category to delete.
     */
    public void deleteCategory(CategoryData categoryData)
    {
        Category category = new Category();
        category = findCategory(categoryData);
        category.setName(categoryData.getName());
        category.setDescription(categoryData.getDescription());

        reposityCategory.delete(category);
    }


}
