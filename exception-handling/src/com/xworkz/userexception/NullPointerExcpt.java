package com.xworkz.userexception;

public class NullPointerExcpt {

    public static void main(String args[]){

        System.out.println("Main method start : ");
        String st1=null;
        String st2="xworkz";

        try {
            System.out.println(st1.equals(st2));
        }catch (NullPointerException e){
            System.out.println("Cannot access null value :");
        }
//        System.out.println(st2.equals(st1));
        System.out.println("Main method end : ");
    }

}
