package com.example.productservicenov24.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Product extends BaseModel{
    String description;
    Double price;
    @ManyToOne
    Category category;
}
