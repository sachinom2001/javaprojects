package com.xworkz.platform.exception;

public class CannotAddNullProductsException extends RuntimeException{

    public CannotAddNullProductsException(String errorMessage){
        System.out.println(errorMessage);
    }
}
