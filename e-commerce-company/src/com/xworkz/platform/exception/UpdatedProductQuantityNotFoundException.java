package com.xworkz.platform.exception;

public class UpdatedProductQuantityNotFoundException extends  RuntimeException{

    public  UpdatedProductQuantityNotFoundException(String erroeMessage){
        System.out.println(erroeMessage);
    }
}
