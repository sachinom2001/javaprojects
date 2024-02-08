package com.xworkz.playstoreapp.exception;

//custom unchecked/runtime exception

public class ApplicationNotFoundException extends Exception{

    public ApplicationNotFoundException(String errorMessage){
        System.out.println(errorMessage);
    }
}
