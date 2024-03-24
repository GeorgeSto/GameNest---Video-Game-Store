package com.example.GameNest.controller;

import com.example.GameNest.service.CategoryService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/category")
public class ControllerCategory {

    private CategoryService categoryService;

    public ControllerCategory(CategoryService categoryService)
    {
        this.categoryService = categoryService;
    }

    @PostMapping("/insert")
    public void addCategory(@RequestBody CategoryData categoryData)
    {
        this.categoryService.insertCategory(categoryData);
    }

    @GetMapping("/get")
    public void findCategory(@RequestBody CategoryData categoryData)
    {
        this.categoryService.findCategory(categoryData);
    }

}
