package com.xworkz.platform;

import com.xworkz.platform.product.Product;
import com.xworkz.platform.supermarket.SuperMarket;
import com.xworkz.platform.supermarket.impl.Dmartimpl;

import java.util.Scanner;

public class Executor {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number products to be added : ");
        int size=sc.nextInt();
        SuperMarket superMarket=new Dmartimpl();

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

            superMarket.addProducts(product);

        }
        System.out.println();
        superMarket.getAllProducts();
        System.out.println();


        String input="";
        do {
            System.out.println("Enter 1 : to get AllProducts ");
            System.out.println("Enter 2 : to get Product By ProductID ");
            System.out.println("Enter 3 : to get Product By Product Type ");
            System.out.println("Enter 4 : to update Product Quantity By ProductName ");
            System.out.println("Enter 5 : to update Product Price By Product Quantity");
            System.out.println("Enter 6 : to delete Application By Product id ");

            int option=sc.nextInt();
            switch (option){

                case 1 :
                    System.out.println("");
                    boolean appl1=superMarket.getAllProducts();
                    System.out.println(appl1);
                    break;

                case 2 :
                    System.out.println("Enter the product id : ");
                    Product appl2=superMarket.getProductByProductID(sc.nextInt());
                    try {
                        System.out.println(appl2.getProductID() + " " + appl2.getProductName() + " " + appl2.getProductType() + " " +
                                appl2.getPrice() + " " + appl2.getQuantity() + " " + appl2.getManufacturingDate() + " " +
                                appl2.getExpirationDate() + " " + appl2.getManufacturedByCountry());
                    }catch(NullPointerException e){
                        System.out.println("given product id is not found :");
                    }
                    break;

                case 3 :
                    System.out.println("Enter the product type : ");
                    Product appl3=superMarket.getProductByProductType(sc.next());
                    try {
                        System.out.println(appl3.getProductID() + " " + appl3.getProductName() + " " + appl3.getProductType() + " " +
                                appl3.getPrice() + " " + appl3.getQuantity() + " " + appl3.getManufacturingDate() + " " +
                                appl3.getExpirationDate() + " " + appl3.getManufacturedByCountry());
                    }catch (NullPointerException e){
                        System.out.println("given product type is not found : ");
                    }
                    break;

                case 4 :
                    System.out.println("Enter the product name : ");
                    System.out.println("Enter the quantity to be update : ");
                    boolean appl4=superMarket.updateProductQuantityByProductName(sc.next(),sc.nextInt());
                    superMarket.getAllProducts();
                    break;

                case 5 :
                    System.out.println("Enter the product quantity : ");
                    System.out.println("Enter the product price to be update : ");
                    boolean apll5=superMarket.updateProductPriceByQuantity(sc.nextInt(), sc.nextInt());
                    superMarket.getAllProducts();
                    break;

                case 6 :
                    System.out.println("Enter the product id : ");
                    superMarket.deleteProductByProductID(sc.nextInt());
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
