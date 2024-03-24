package com.example.GameNest.repository;

import com.example.GameNest.model.Category;
import org.springframework.data.repository.CrudRepository;


/**
 * Repository interface for {Category} entities.
 * This interface extends {CrudRepository}, providing CRUD operations for Category entities.
 * Additionally, it includes a custom query method to find a Category by its name.
 * Utilizing Spring Data's repository abstraction allows for significant reduction in boilerplate code
 * required to implement data access layers for various persistence stores.
 */
public interface ReposityCategory extends CrudRepository<Category,Integer> {
    /**
     * Finds a Category entity by its name.
     * This method declaration enables Spring Data JPA to automatically implement it based on the method name.
     * The implementation will query the database for a Category with the specified name.
     * @param name The name of the Category to find.
     * @return The found Category, or {null} if no Category with the given name exists.
     */
    Category findByName(String name);
}
