package uk.ac.westminster.products_api;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

import java.util.List;

@Service

public class productService{

    private List<Products> products = new ArrayList<>();

    private Long nextId = 1L;

    public List<Products> getAllProducts() {
        return products;

    }
    public Products addProduct(Products product) {
        product.setId(nextId++);
        products.add(product);
        return product;

    }

}