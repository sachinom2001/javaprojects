package com.xworkz.policestationapp.exception;

public class CannotAddNullApplication extends RuntimeException{

    public CannotAddNullApplication(String errorMessage){
        System.out.println(errorMessage);
    }
}
