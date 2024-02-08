package com.xworkz.playstoreapp.exception;

public class CannotAddNullApplication extends RuntimeException{

    public CannotAddNullApplication(String errorMessage){
        System.out.println(errorMessage);
    }
}
