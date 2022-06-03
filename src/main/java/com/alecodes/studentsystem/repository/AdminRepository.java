package com.alecodes.studentsystem.repository;

import com.alecodes.studentsystem.model.Admin;
import com.alecodes.studentsystem.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The interface Admin repository.
 */
@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {
}
