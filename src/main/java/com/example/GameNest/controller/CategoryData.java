package com.example.GameNest.controller;

/**
 * Represents a category of games within the GameNest application.
 * This class stores specific details about the category, including
 * its name and description.
 * Use the getter and setter methods to access and update the values
 * for the name and description.
 */
public class CategoryData {
    private String name;
    private String description;

    /**
     * Retrieves the name of the category.
     * @return The name of the category.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the category.
     * @param name The new name of the category. This should not be null.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retrieves the description of the category.
     * @return The description of the category.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description of the category.
     * @param description The new description of the category. This should not be null.
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
