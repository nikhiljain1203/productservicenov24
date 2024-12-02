package com.example.productservicenov24.controllers;

import com.example.productservicenov24.exceptions.ProductNotFoundException;
import com.example.productservicenov24.models.Product;
import com.example.productservicenov24.services.FakeStoreProductService;
import com.example.productservicenov24.services.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

//@SpringBootTest
class ProductControllerTest {

    //@Autowired
    ProductController productController;

    //@MockBean
    ProductService productService;


//    @Test
//    void getProductById() throws ProductNotFoundException {
//        // Arrange
//        //long productId = 2L;
//        Product product = new Product();
//        product.setId(1L);
//        product.setTitle("Test Product");
//
//        when(productService.getProductById(1L)).thenReturn(product);
//
//        // Act
//        Product p = productController.getProductById(1L);
//
//        //Assert
//        Assertions.assertEquals("Test Product", p.getTitle());
//    }
//
//    @Test
//    void getProductByIdThrowsExcpetion() throws ProductNotFoundException {
//        // Arrange
//        Product product = new Product();
//        product.setId(1L);
//        product.setTitle("Test Product");
//
//        when(productService.getProductById(1L))
//                .thenThrow(ProductNotFoundException.class);
//
//        // Act & Assert
//        Assertions.assertThrows(ProductNotFoundException.class,
//                () ->productController.getProductById(1L));
//    }
//
//    @Test
//    void createProduct() throws ProductNotFoundException {
//        // Arrange
//        long productId = 2L;
//        Product product = new Product();
//        product.setId(1L);
//        product.setTitle("Test Product");
//
//        //when(productService.createProduct(product)).
//        doNothing().when(productService.createProduct(product));
//
//        // Act
//        Product p = productController.getProductById(productId);
//
//        //Assert
//        verify(productService.createProduct(product));
//        //Assertions.assertEquals("Test Product", p.getTitle());
//    }
}