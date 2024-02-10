package com.xworkz.platform.exception;

public class DeletedProductNotFoundException extends RuntimeException{

    public DeletedProductNotFoundException(String errorMessage){
        System.out.println(errorMessage);
    }
}
