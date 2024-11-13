package com.example.productservicenov24.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Product extends BaseModel{
    String description;
    Double price;
    @ManyToOne(cascade = CascadeType.DETACH)
    Category category;
    int qty;
    int amount;

//    @ManyToMany(mappedBy = "productList")
//    List<Category> categoryList;

//    @ManyToOne
//    @JoinColumn
//    Category category;
}
