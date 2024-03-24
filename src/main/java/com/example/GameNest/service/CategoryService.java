package com.example.GameNest.service;

import com.example.GameNest.controller.CategoryData;
import com.example.GameNest.model.Category;
import com.example.GameNest.repository.ReposityCategory;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

    private ReposityCategory reposityCategory;

    public CategoryService(ReposityCategory reposityCategory)
    {
        this.reposityCategory = reposityCategory;
    }

    public Category insertCategory(CategoryData categoryData) {
        Category category = new Category();
        category.setName(categoryData.getName());
        category.setDescription(categoryData.getDescription());

        return reposityCategory.save(category);
    }

    public Category findCategory(CategoryData categoryData)
    {
        Category category = new Category();
        category = reposityCategory.findByName(categoryData.getName());
        System.out.println(category.getCategoryID());
        System.out.println(category.getDescription());
        System.out.println(category.getName());

        return category;
    }

    public Category updateCategory(CategoryData categoryData)
    {
        Category category = findCategory(categoryData);
        category.setName(categoryData.getName());
        category.setDescription(categoryData.getDescription());

        return reposityCategory.save(category);
    }

    public void deleteCategory(CategoryData categoryData)
    {
        Category category = new Category();
        category = findCategory(categoryData);
        category.setName(categoryData.getName());
        category.setDescription(categoryData.getDescription());

        reposityCategory.delete(category);
    }


}
