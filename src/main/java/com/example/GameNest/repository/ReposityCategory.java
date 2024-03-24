package com.example.GameNest.repository;

import com.example.GameNest.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface ReposityCategory extends CrudRepository<Category,Integer> {

    Category findByName(String name);
}
