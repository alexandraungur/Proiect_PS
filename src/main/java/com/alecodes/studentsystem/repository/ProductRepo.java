package com.alecodes.studentsystem.repository;

import com.alecodes.studentsystem.model.Product;

import java.util.List;

/**
 * The interface Product repo.
 */
public interface ProductRepo {
    /**
     * Find by id java . util . optional.
     *
     * @param id the id
     * @return the java . util . optional
     */
    java.util.Optional<Product>  findById(int id);

    /**
     * Save product product.
     *
     * @param product the product
     * @return the product
     */
    Product saveProduct(Product product);

    /**
     * Find all list.
     *
     * @return the list
     */
    List<Product> findAll();

    /**
     * Delete product.
     *
     * @param id the id
     */
    void deleteProduct(int id);
}
