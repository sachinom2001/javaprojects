package com.xworkz.platform.exception;

public class UpdatedProductPriceNotFoundException extends RuntimeException{

    public UpdatedProductPriceNotFoundException(String errorMessage){
        System.out.println(errorMessage);
    }
}
