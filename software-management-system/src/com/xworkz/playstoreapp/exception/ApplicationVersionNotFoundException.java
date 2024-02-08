package com.xworkz.playstoreapp.exception;

public class ApplicationVersionNotFoundException extends RuntimeException{

    public ApplicationVersionNotFoundException(String errorMessage){
        System.out.println(errorMessage);
    }
}
