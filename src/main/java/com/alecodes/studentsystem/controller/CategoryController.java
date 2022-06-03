package com.alecodes.studentsystem.controller;


import com.alecodes.studentsystem.logic.CategoryLogic;
import com.alecodes.studentsystem.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/category")
public class CategoryController {
    @Autowired
    private CategoryLogic categoryLogic;

    /**
     * Get categorys list.
     *
     * @return the list
     */
    @RequestMapping(method = RequestMethod.GET, value = "/getCategories")
    public List<Category> getCategories(){
        return categoryLogic.getCategories();
    }

    /**
     * Add string.
     *
     * @param category the category
     * @return the string
     */
    @PostMapping("/addCategory")
    public String add(@RequestBody Category category){
        categoryLogic.addCategory(category);
        return "Added category";
    }

    /**
     * Delete category.
     *
     * @param idCategory the id category
     * @return nothing
     */
    @DeleteMapping
    @RequestMapping(value = "/deleteCategory/{idCategory}")
    public void delete(@PathVariable int idCategory){
        categoryLogic.deleteCategory(idCategory);
    }

    /**
     * Update string.
     *
     * @param idCategory the id category
     * @param category   the category
     * @return the string
     */
    @PutMapping
    @RequestMapping(value = "/updateProdus/{id}")
    public String update(@PathVariable int idCategory, @RequestBody Category category){
        categoryLogic.updateCategory(idCategory, category);
        return "Updated category";
    }


}
