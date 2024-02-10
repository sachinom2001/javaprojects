package com.xworkz.policestationapp.exception;

public class OfficersPostNameNotFoundException extends RuntimeException{

    public OfficersPostNameNotFoundException(String errorMessage){
        System.out.println(errorMessage);
    }
}
