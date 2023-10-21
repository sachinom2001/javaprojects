package com.xworkz.cellphoneproducts;


import com.xworkz.cellphoneproducts.hub.MobileShop;
import com.xworkz.cellphoneproducts.smartphone.SmartPhone;

import java.util.Scanner;

public class ProductExecutor {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of MobilePhones to be added : ");
        int size=sc.nextInt();
        MobileShop mobileShop=new MobileShop(size);

        for (int index = 0; index < size; index++) {
            SmartPhone smartPhone=new SmartPhone();
            System.out.println("Enter the Device Name : ");
            smartPhone.setDeviceName(sc.next());

            System.out.println("Enter the Model Name : ");
            smartPhone.setModel(sc.next());

            System.out.println("Enter the Android Version : ");
            smartPhone.setAndroidVersion(sc.nextInt());

            System.out.println("Enter the Processor : ");
            smartPhone.setProcessor(sc.next());

            System.out.println("Enter the Device Storage : ");
            smartPhone.setDeviceStorage(sc.next());

            System.out.println("Enter the Mobile Ram : ");
            smartPhone.setRam(sc.next());

            System.out.println("Enter the Camera Resolution : ");
            smartPhone.setCameraResolution(sc.next());

            System.out.println("Enter the Battery Capacity : ");
            smartPhone.setBatteryCapacity(sc.next());

            System.out.println("Enter the Mobile Price : ");
            smartPhone.setPrice(sc.nextDouble());

            mobileShop.addPhones(smartPhone);
        }
        System.out.println();
        mobileShop.getAllPhones();
        System.out.println();

        String input=null;

        do {
            System.out.println("Enter 1 : to get AllPhones ");
            System.out.println("Enter 2 : to get DeviceName By Processor ");
            System.out.println("Enter 3 : to get DeviceName By Version ");
            System.out.println("Enter 4 : to update Mobile Processor By Model ");
            System.out.println("Enter 5 : to delete Mobile By DeviceName");

            int options= sc.nextInt();
            switch (options){
                case 1 :
                    boolean offi1=mobileShop.getAllPhones();
                    System.out.println(offi1);
                    break;

                case 2 :
                    System.out.println("Enter the Mobile Processor : ");
                    String offi2=mobileShop.getDeviceNameByProcessor(sc.next());
                    System.out.println(offi2);
                    break;

                case 3 :
                    System.out.println("Enter the Version of Mobile : ");
                    String offi3=mobileShop.getDeviceNameByVersion(sc.nextInt());
                    System.out.println(offi3);
                    break;

                case 4 :
                    System.out.println("Enter the Model Name : ");
                    System.out.println("Enter the processor to be update : ");
                    boolean offi5=mobileShop.updateMoibleProcessorByModel(sc.next(), sc.next());
                    mobileShop.getAllPhones();
                    break;

                case 5 :
                    System.out.println("Enter the Device Name : ");
                    mobileShop.deleteMobileByDeviceName(sc.next());
                    break;

                default:
                    System.out.println("Please select the option which is available in the above : ");
            }

            System.out.println("If you want to continue please enter Y/N : ");
            input= sc.next();

        }while (input.equals("Y"));

        System.out.println("Thank you for visiting our site ..!! enjoy your day...");

    }
}
