package com.alecodes.studentsystem.repository;

import com.alecodes.studentsystem.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.lang.Math.abs;

/**
 * The type Product data repository.
 */
@Repository
public class ProductDataRepository implements ProductRepo {

    /**
     * The Products.
     */
    public List<Product> products;


    /**
     * Instantiates a new Product data repository.
     */
    public ProductDataRepository() {
        products = new ArrayList<Product>();
    }


    public java.util.Optional<Product> findById(int id)
    {
        for(Product i : products)
        {
            if(i.getIdproduct() == id)
                return java.util.Optional.of(i);
        }
        return null;
    }


    public List<Product> findAll()
    {
        return products;
    }

    public Product saveProduct(Product product)
    {
        Random rand = new Random();
        product.setIdproduct((int) abs(rand.nextLong()));
        products.add(product);
        return product;
    }


    public void deleteProduct(int id)
    {
        Product product = new Product();
        for(Product i : products)
        {
            if(i.getIdproduct() == id)
                product = i;
        }
        products.remove(product);
    }

}

