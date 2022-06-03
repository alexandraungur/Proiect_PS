package com.alecodes.studentsystem.repository;

import com.alecodes.studentsystem.model.Client;
import com.alecodes.studentsystem.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The interface Client repository.
 */
@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {
}
