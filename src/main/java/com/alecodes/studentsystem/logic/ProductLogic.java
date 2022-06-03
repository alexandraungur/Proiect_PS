package com.alecodes.studentsystem.logic;


import com.alecodes.studentsystem.model.Product;
import com.alecodes.studentsystem.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

/**
 * The type Product logic.
 */
@Controller
public class ProductLogic {
    private final ProductService productService;

    /**
     * Instantiates a new Product logic.
     *
     * @param productService the product service
     */
    @Autowired
    public ProductLogic(ProductService productService) {
        this.productService = productService;
    }

    /**
     * Add product string.
     *
     * @param product the product
     * @return the string
     */
    public String addProduct(@RequestBody Product product){
        productService.saveProduct(product);
        return "New product is added";
    }

    /**
     * Get products list.
     *
     * @return the list
     */
    public List<Product> getProducts(){
        return productService.getProducts();
    }

    /**
     * Delete product.
     *
     * @param idProduct the id product
     */
    public void deleteProduct(int idProduct){
        productService.deleteProduct(idProduct);
    }

    /**
     * Update product.
     *
     * @param idProduct  the id product
     * @param newProduct the new product
     */
    public void updateProduct(int idProduct, Product newProduct){
        Optional<Product> product = productService.getProductById((idProduct));
        product.ifPresent(pr -> {

                    pr.setName(newProduct.getName());
                    pr.setBrand(newProduct.getBrand());
                    pr.setPrice(newProduct.getPrice());
                    pr.setQuantity(newProduct.getQuantity());
                    pr.setStock(newProduct.getStock());
                    productService.saveProduct(pr);

                }
        );
    }


}