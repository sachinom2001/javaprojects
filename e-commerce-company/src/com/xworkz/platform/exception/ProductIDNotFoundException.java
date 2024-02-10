package com.xworkz.platform.exception;

public class ProductIDNotFoundException extends RuntimeException{

    public ProductIDNotFoundException(String errorMessage){
        System.out.println(errorMessage);
    }
}
