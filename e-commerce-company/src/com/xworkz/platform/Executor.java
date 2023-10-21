package com.xworkz.platform;

import com.xworkz.platform.dmart.DMart;
import com.xworkz.platform.product.Product;

import java.util.Scanner;

public class Executor {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number products to be added : ");
        int size=sc.nextInt();
        DMart dMart=new DMart(size);

        for (int index = 0; index < size; index++) {
            Product product=new Product();

//            System.out.println("Enter the product id : ");
//            product.setProductID(sc.nextInt());

            System.out.println("Enter the product name : ");
            product.setProductName(sc.next());

            System.out.println("Enter the product type : ");
            product.setProductType(sc.next());

            System.out.println("Enter the product price : ");
            product.setPrice(sc.nextDouble());

            System.out.println("Enter the product quantity : ");
            product.setQuantity(sc.nextInt());

            System.out.println("Enter the product manufacturing date : ");
            product.setManufacturingDate(sc.next());

            System.out.println("Enter the product expiration date : ");
            product.setExpirationDate(sc.next());

            System.out.println("Enter the product manufacture by country name : ");
            product.setManufacturedByCountry(sc.next());

            dMart.addProducts(product);

        }
        System.out.println();
        dMart.getAllProducts();
        System.out.println();


        String input="";
        do {
            System.out.println("Enter 1 : to get AllProducts ");
            System.out.println("Enter 2 : to get Product By ProductID ");
            System.out.println("Enter 3 : to get Product By Product Type ");
            System.out.println("Enter 4 : to update Product Quantity By Product Name ");
            System.out.println("Enter 5 : to update Product Price By Quantity");
            System.out.println("Enter 6 : to delete Application By Product id ");

            int option=sc.nextInt();
            switch (option){

                case 1 :
                    System.out.println("");
                    boolean appl1=dMart.getAllProducts();
                    System.out.println(appl1);
                    break;

                case 2 :
                    System.out.println("Enter the product id : ");
                    Product appl2=dMart.getProductByProductID(sc.nextInt());
                    System.out.println(appl2.getProductID()+" "+appl2.getProductName()+" "+appl2.getProductType()+" "+
                            appl2.getPrice()+" "+appl2.getQuantity()+" "+appl2.getManufacturingDate()+" "+
                            appl2.getExpirationDate()+" "+appl2.getManufacturedByCountry());
                    break;

                case 3 :
                    System.out.println("Enter the product type : ");
                    Product appl3=dMart.getProductByProductType(sc.next());
                    System.out.println(appl3.getProductID()+" "+appl3.getProductName()+" "+appl3.getProductType()+" "+
                            appl3.getPrice()+" "+appl3.getQuantity()+" "+appl3.getManufacturingDate()+" "+
                            appl3.getExpirationDate()+" "+appl3.getManufacturedByCountry());
                    break;

                case 4 :
                    System.out.println("Enter the product quantity : ");
                    System.out.println("Enter the price to be update : ");
                    boolean appl4=dMart.updateProductPriceByQuantity(sc.nextInt(),sc.nextDouble());
                    dMart.getAllProducts();
                    break;

                case 5 :
                    System.out.println("Enter the product name : ");
                    System.out.println("Enter the product quantity to be update : ");
                    boolean apll11=dMart.updateProductQuantityByProductName(sc.next(), sc.nextInt());
                    dMart.getAllProducts();
                    break;

                case 6 :
                    System.out.println("Enter the product id : ");
                    dMart.deleteProductByProductID(sc.nextInt());
                    break;

                default:
                    System.out.println("Please select the option which is available in the above : ");

            }
            System.out.println("If you want to continue please enter Y/N : ");
            input= sc.next();

        }while (input.equals("Y"));

        System.out.println("Thank you for visiting our platform...!! enjoy your day...");


    }


}
