package com.xworkz.userexception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMissMatchExcpt {

    public static void main(String[] args) {
        System.out.println("Main started");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age :");
        try{
            int age = sc.nextInt();
            System.exit(0);
        }catch(InputMismatchException e){
            System.out.println("Enter the age value correctly");
        }finally {
            System.out.println("Hey this is finally block");
        }
        System.out.println("Main ended");
    }
}
