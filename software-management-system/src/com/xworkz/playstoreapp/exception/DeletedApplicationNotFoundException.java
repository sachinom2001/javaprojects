package com.xworkz.playstoreapp.exception;

import java.util.Date;

public class DeletedApplicationNotFoundException extends RuntimeException{

    public DeletedApplicationNotFoundException(String errorMessage){
        System.out.println(errorMessage);
    }
}
