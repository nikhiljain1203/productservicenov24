package com.example.productservicenov24.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductNotFoundExceptionDto {
    Long errorCode;
    String message;
}
