package com.example.productservicenov24.services;

import com.example.productservicenov24.exceptions.ProductNotFoundException;
import com.example.productservicenov24.models.Product;

import javax.management.InstanceNotFoundException;
import java.util.List;

public interface ProductService {
    Product getProductById(Long id) throws ProductNotFoundException;

    List<Product> getAllProducts();

    Product replaceProduct(Long id, Product product);

    Product createProduct(Product product);
}
