package com.alecodes.studentsystem.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;

/**
 * The type Product.
 */
@Entity
@Table(name = "product")

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_product")
    private int id_product;

    @Column(name = "name")
    private String name;

    @Column(name = "brand")
    private String brand;

    @Column(name = "price")
    private int price;

    @Column(name="quantity")
    private String quantity;

    @Column(name = "stock")
    private int stock;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name="id_category")
    private Category id_category;

    /**
     * Instantiates a new Product.
     */
    public Product() {

    }

    /**
     * Instantiates a new Product.
     *
     * @param name     the name
     * @param brand    the brand
     * @param price    the price
     * @param quantity the quantity
     * @param stock    the stock
     */
    public Product(String name , String brand, int price , String quantity, int stock, Category id_category) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.quantity=quantity;
        this.stock = stock;
        this.id_category=id_category;
    }


    /**
     * Gets idproduct.
     *
     * @return the idproduct
     */
    public int getIdproduct() {
        return id_product;
    }

    /**
     * Sets idproduct.
     *
     * @param id_product the id product
     */
    public void setIdproduct(int id_product) {
        this.id_product = id_product;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets brand.
     *
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Sets brand.
     *
     * @param brand the brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Gets price.
     *
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * Sets price.
     *
     * @param price the price
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * Gets quantity.
     *
     * @return the quantity
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * Sets quantity.
     *
     * @param quantity the quantity
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    /**
     * Gets stock.
     *
     * @return the stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * Sets stock.
     *
     * @param stock the stock
     */
    public void setStock(int stock) {
        this.stock = stock;
    }


    public Category getId_category() {
        return id_category;
    }

    public void setId_category(Category id_category) {
        this.id_category = id_category;
    }
}
