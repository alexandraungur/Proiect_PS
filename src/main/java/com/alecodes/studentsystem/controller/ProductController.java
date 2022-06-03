package com.alecodes.studentsystem.controller;


import com.alecodes.studentsystem.logic.ProductLogic;
import com.alecodes.studentsystem.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * The type Product controller.
 */
@RestController
@RequestMapping(path="api/v1/product")

public class ProductController{
    @Autowired
    private ProductLogic productLogic;

    /**
     * Get products list.
     *
     * @return the list
     */
    @RequestMapping(method = RequestMethod.GET, value = "/getProducts")
    public List<Product> getProducts(){
        return productLogic.getProducts();
    }

    /**
     * Add string.
     *
     * @param product the product
     * @return the string
     */
    @PostMapping("/addProduct")
    public String add(@RequestBody Product product){
        productLogic.addProduct(product);
        return "Added product";
    }

    /**
     * Delete product.
     *
     * @param idProduct the id product
     * @return nothing
     */
    @DeleteMapping
    @RequestMapping(value = "/deleteProduct/{idProduct}")
    public void delete(@PathVariable int idProduct){
        productLogic.deleteProduct(idProduct);
    }

    /**
     * Update string.
     *
     * @param idProduct the id product
     * @param product   the product
     * @return the string
     */
    @PutMapping
    @RequestMapping(value = "/updateProdus/{id}")
    public String update(@PathVariable int idProduct, @RequestBody Product product){
        productLogic.updateProduct(idProduct, product);
        return "Updated product";
    }


}
