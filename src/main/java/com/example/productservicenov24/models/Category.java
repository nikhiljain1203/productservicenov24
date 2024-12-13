package com.example.productservicenov24.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@Entity
public class Category extends BaseModel implements Serializable {
    String description;
//    @OneToMany(fetch = FetchType.EAGER)
//    List<Product> productList;
//    @OneToOne
//    @JoinColumn(columnDefinition = )
//    Product product;
}
