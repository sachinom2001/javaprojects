package com.xworkz.policestationapp.exception;

public class OfficersIDNotFoundException extends RuntimeException{

    public OfficersIDNotFoundException(String errorMessage){
        System.out.println(errorMessage);
    }
}
