package com.example.productservicenov24.testdemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    /*
    When---then---
     */
    @Test
    void whenAddTwoIntegersThenRightResultExpected() {
        //Arrange
        int a = 10;
        int b = 20;
        Calculator c = new Calculator();

        //Act
        int result = c.add(a, b);

        //Assert
        Assertions.assertEquals(30, result);
//        if(result == 30) {
//            System.out.println("Success");
//        } else {
//            throw new RuntimeException("Failure");
//        }
    }

    @Test
    void divide() {
        //Arrange
        int a = 10;
        int b = 0;
        Calculator c = new Calculator();

        Assertions.assertThrows(ArithmeticException.class,
                ()->c.divide(a,b));
    }
}