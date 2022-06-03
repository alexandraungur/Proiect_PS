package com.alecodes.studentsystem.service;

import com.alecodes.studentsystem.model.Product;
import com.alecodes.studentsystem.repository.ProductRepo;
import com.alecodes.studentsystem.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * The type Product service.
 */
@Service
public class ProductServiceImpl implements ProductService{

    /**
     * The Product repository.
     */
    @Autowired
    ProductRepo productRepo;

    @Override
    public List<Product> getProducts() {
        return productRepo.findAll();
    }

    @Override
    public Product saveProduct(Product product) {
        return productRepo.saveProduct(product);
    }

    public void deleteProduct(int idProduct){
        productRepo.deleteProduct(idProduct);
    }

    @Override
    public Optional<Product> getProductById(int idProduct) {
        return productRepo.findById(idProduct);
    }
}
