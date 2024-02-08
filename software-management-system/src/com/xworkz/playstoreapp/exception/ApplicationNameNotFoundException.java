package com.xworkz.playstoreapp.exception;

public class ApplicationNameNotFoundException extends RuntimeException{

    public ApplicationNameNotFoundException(String errorMessage){
        System.out.println(errorMessage);
    }
}
