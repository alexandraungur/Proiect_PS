package com.alecodes.studentsystem.service;

import com.alecodes.studentsystem.model.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    List<Category> getCategories();

    /**
     * Save category category.
     *
     * @param category the category
     * @return the category
     */
    public Category saveCategory(Category category);

    /**
     * Delete category.
     *
     * @param idCategory the id category
     */
    public void deleteCategory(int idCategory);

    /**
     * Gets category by id.
     *
     * @param idCategory the id category
     * @return the category by id
     */
    Optional<Category> getCategoryById(int idCategory);
}
