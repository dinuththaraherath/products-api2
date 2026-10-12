package uk.ac.westminster.products_api;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service

public class productService{

    private final List<Products> Products = new ArrayList<>();

    private Long nextId = 1L;

    public List<Products> getAllProducts() {
        return Products;

    }
    public Products addProduct(Products product) {
        product.setId(nextId++);
        Products.add(product);
        return product;

    }

    public void deleteById(Long id) {
        Products.removeIf(products ->products.getId().equals(id) );
    }
