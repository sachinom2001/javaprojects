package com.xworkz.policestationapp.exception;

public class DeletedOfficerNotFoundException extends RuntimeException{

    public DeletedOfficerNotFoundException(String errorMessage){
        System.out.println(errorMessage);
    }
}
