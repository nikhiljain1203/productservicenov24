package com.example.productservicenov24.controllers;

import com.example.productservicenov24.dtos.ProductNotFoundExceptionDto;
import com.example.productservicenov24.exceptions.ProductNotFoundException;
import com.example.productservicenov24.models.Product;
import com.example.productservicenov24.services.ProductService;
import com.example.productservicenov24.services.SelfProductService;
import com.example.productservicenov24.services.TokenService;
import org.hibernate.cache.spi.access.UnknownAccessTypeException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.management.InstanceNotFoundException;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    ProductService productService;
    TokenService tokenService;

    public ProductController(ProductService productService,
                             TokenService tokenService) {
        this.productService = productService;
        this.tokenService = tokenService;
    }

    @GetMapping("/{id}")
    public Product getProductById(
            //@RequestHeader("Token") String token,
            @PathVariable("id") Long id) throws ProductNotFoundException {

//        if (!tokenService.validateToken(token)) {
//            throw new UnknownAccessTypeException("User is not authorised");
//        }

        Product product = null;
        //try {
            product = productService.getProductById(id);
//        } catch (InstanceNotFoundException e) {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
        ResponseEntity<Product> productResponseEntity;
//        if (product == null) {
//            productResponseEntity = new ResponseEntity<>("Product Not Found for Id: "+ id, HttpStatus.NOT_FOUND);
//            return productResponseEntity;
//        }
//        productResponseEntity = new ResponseEntity<>(product, HttpStatus.OK);
//        return productResponseEntity;
        return product;
    }

    @GetMapping()
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @PutMapping("/{id}")
    public Product replaceProduct(@PathVariable("id") Long id, @RequestBody Product product) {
        return productService.replaceProduct(id, product);
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }

//    @ExceptionHandler(ProductNotFoundException.class)
//    public ResponseEntity<ProductNotFoundExceptionDto> handleInstanceNotFoundException(ProductNotFoundException exception) {
//        ProductNotFoundExceptionDto productNotFoundExceptionDto = new ProductNotFoundExceptionDto();
//        productNotFoundExceptionDto.setErrorCode(exception.getId());
//        productNotFoundExceptionDto.setMessage(exception.getMessage());
//        return new ResponseEntity<>(productNotFoundExceptionDto, HttpStatus.NOT_FOUND);
//    }
//
//    @ExceptionHandler(NullPointerException.class)
//    public ResponseEntity<ProductNotFoundExceptionDto> handleNullException(ProductNotFoundException exception) {
//        ProductNotFoundExceptionDto productNotFoundExceptionDto = new ProductNotFoundExceptionDto();
//        productNotFoundExceptionDto.setErrorCode(exception.getId());
//        productNotFoundExceptionDto.setMessage(exception.getMessage());
//        return new ResponseEntity<>(productNotFoundExceptionDto, HttpStatus.NOT_FOUND);
//    }
}
