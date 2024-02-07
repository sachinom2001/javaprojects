package com.xworkz.userexception;

public class IndexOutOfBoundExcpt {


    public static void main(String args[]){
        System.out.println("Main method is start :");
        int arr[]={0,1,2,3,4};

        try{
            System.out.println(arr[5]);
        }catch (IndexOutOfBoundsException e){
            System.out.println("array cannot print index out of bound ");
        }
        System.out.println("Main method is end :");

    }

}
