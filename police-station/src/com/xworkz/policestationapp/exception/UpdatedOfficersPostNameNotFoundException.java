package com.xworkz.policestationapp.exception;

public class UpdatedOfficersPostNameNotFoundException extends RuntimeException{

    public UpdatedOfficersPostNameNotFoundException(String errorMessage){
        System.out.println(errorMessage);
    }
}
