package com.example.GameNest.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;


/**
 * Represents a Category entity in the GameNest application.
 * Each category has an ID, a name, a description, and a set of games associated with it.
 * This entity is mapped to a "Categories" table in the database. Lombok annotations are
 * used to automatically generate getters, setters, a no-argument constructor, and an all-argument constructor.
 */
@Entity
@Table(name = "Categories")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer categoryID;

    @Column(nullable = false, length = 255)
    private String name;

    @Column(columnDefinition = "TEXT")
    private String description;

    @OneToMany(mappedBy = "category")
    private Set<Game> games;


}
