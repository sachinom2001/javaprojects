package com.xworkz.playstoreapp.exception;

public class ApplicationTypeNotFoundException extends RuntimeException{

    public ApplicationTypeNotFoundException(String errorMessage){
        System.out.println(errorMessage);
    }
}
