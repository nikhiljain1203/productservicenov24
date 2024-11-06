package com.example.productservicenov24.services;

import com.example.productservicenov24.models.Product;

import java.util.List;

public interface ProductService {
    Product getProductById(Long id);

    List<Product> getAllProducts();

    Product replaceProduct(Long id, Product product);
}
