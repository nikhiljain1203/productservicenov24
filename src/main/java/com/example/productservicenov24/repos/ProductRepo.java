package com.example.productservicenov24.repos;

import com.example.productservicenov24.models.Product;
import com.example.productservicenov24.projections.ProductTitleAndDescription;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {
    List<Product> findByTitleContains(String keyword, Pageable pageable);
}
