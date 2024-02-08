package com.xworkz.playstoreapp.exception;

public class InvalidIDFoundException extends RuntimeException{

    public InvalidIDFoundException(String errorMessage){
        System.out.println(errorMessage);
    }
}
