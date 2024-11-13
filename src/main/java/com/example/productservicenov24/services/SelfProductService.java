package com.example.productservicenov24.services;

import com.example.productservicenov24.exceptions.ProductNotFoundException;
import com.example.productservicenov24.models.Category;
import com.example.productservicenov24.models.Product;
import com.example.productservicenov24.projections.ProductTitleAndDescription;
import com.example.productservicenov24.repos.CategoryRepo;
import com.example.productservicenov24.repos.ProductRepo;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("SelfProductService")
public class SelfProductService implements ProductService {
    ProductRepo productRepo;
    private final CategoryRepo categoryRepo; // Ideally category service

    public SelfProductService(ProductRepo productRepo,
                              CategoryRepo categoryRepo) {
        this.productRepo = productRepo;
        this.categoryRepo = categoryRepo;
    }
    @Override
    public Product getProductById(Long id) throws ProductNotFoundException {
        ProductTitleAndDescription productTitleAndDescription = productRepo.getProductTitleAndDesc(id);
        System.out.println("Pojection" + productTitleAndDescription.getTitle() + " " +productTitleAndDescription.getDescription());
        return productRepo.findById(id).get();
        //return productRepo.getProductTitleAndDesc(id);
    }

    @Override
    public List<Product> getAllProducts() {
        return null;
    }

    @Override
    public Product replaceProduct(Long id, Product product) {
        return null;
    }

    @Override
    public Product createProduct(Product product) {
//        Category category = product.getCategory();
//        if(category.getId() == null) {
//            Category savedCategory = categoryRepo.save(category);
//            product.setCategory(savedCategory);
//        } else {
//            // we should check if category is valid or not
//        }
        return productRepo.save(product);
    }
}
