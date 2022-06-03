package com.alecodes.studentsystem.repository;

import com.alecodes.studentsystem.model.Admin;
import com.alecodes.studentsystem.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
