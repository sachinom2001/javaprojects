package com.xworkz.playstoreapp.exception;

public class UpdatedApplicationNotFoundException extends RuntimeException{

    public UpdatedApplicationNotFoundException(String errorMessage){
        System.out.println(errorMessage);
    }
}
