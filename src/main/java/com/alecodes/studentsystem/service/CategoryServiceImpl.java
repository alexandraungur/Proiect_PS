package com.alecodes.studentsystem.service;

import com.alecodes.studentsystem.model.Category;
import com.alecodes.studentsystem.model.Category;
import com.alecodes.studentsystem.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryRepository categoryRepository;


    @Override
    public List<Category> getCategories() {
        return null;
    }

    @Override
    public Category saveCategory(Category category) {
        return categoryRepository.save(category);
    }

    public void deleteCategory(int idCategory){
        categoryRepository.deleteById(idCategory);
    }

    @Override
    public Optional<Category> getCategoryById(int idCategory) {
        return categoryRepository.findById(idCategory);
    }
}
