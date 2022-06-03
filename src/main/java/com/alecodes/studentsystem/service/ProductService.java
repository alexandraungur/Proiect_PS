package com.alecodes.studentsystem.service;

import com.alecodes.studentsystem.model.Product;

import java.util.List;
import java.util.Optional;

/**
 * The interface Product service.
 */
public interface ProductService {
    /**
     * Gets products.
     *
     * @return the products
     */
    List<Product> getProducts();

    /**
     * Save product product.
     *
     * @param product the product
     * @return the product
     */
    public Product saveProduct(Product product);

    /**
     * Delete product.
     *
     * @param idProduct the id product
     */
    public void deleteProduct(int idProduct);

    /**
     * Gets product by id.
     *
     * @param idProduct the id product
     * @return the product by id
     */
    Optional<Product> getProductById(int idProduct);
}
