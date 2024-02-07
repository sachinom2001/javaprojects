package com.xworkz.userexception;

public class ArithmeticExcpt {

    public static void main(String args[]){
        System.out.println("Main method is start :");
        try {
            System.out.println(4/0);
        }catch (ArithmeticException e){
            System.out.println("Cannot divide number by zero ");
        }
        System.out.println("Main method is end :");
    }
}
