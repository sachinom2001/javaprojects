package com.xworkz.platform.exception;

public class ProductTypeNotFoundException extends RuntimeException{

    public ProductTypeNotFoundException(String errorMessage){
        System.out.println(errorMessage);
    }
}
