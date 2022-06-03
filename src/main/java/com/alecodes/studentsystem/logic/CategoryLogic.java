package com.alecodes.studentsystem.logic;


import com.alecodes.studentsystem.model.Category;
import com.alecodes.studentsystem.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Controller
public class CategoryLogic {
    private final CategoryService categoryService;

    /**
     * Instantiates a new Category logic.
     *
     * @param categoryService the category service
     */
    @Autowired
    public CategoryLogic(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    /**
     * Add category string.
     *
     * @param category the category
     * @return the string
     */
    public String addCategory(@RequestBody Category category){
        categoryService.saveCategory(category);
        return "New category is added";
    }

    /**
     * Get categorys list.
     *
     * @return the list
     */
    public List<Category> getCategories(){
        return categoryService.getCategories();
    }

    /**
     * Delete category.
     *
     * @param idCategory the id category
     */
    public void deleteCategory(int idCategory){
        categoryService.deleteCategory(idCategory);
    }

    /**
     * Update category.
     *
     * @param idCategory  the id category
     * @param newCategory the new category
     */
    public void updateCategory(int idCategory, Category newCategory){
        Optional<Category> category = categoryService.getCategoryById((idCategory));
        category.ifPresent(pr -> {

                    pr.setName(newCategory.getName());
                    categoryService.saveCategory(pr);

                }
        );
    }

}
