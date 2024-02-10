package com.xworkz.playstoreapp;

import java.util.*;
import com.xworkz.playstoreapp.application.Application;
import com.xworkz.playstoreapp.exception.ApplicationNotFoundException;
import com.xworkz.playstoreapp.hub.SoftwareHub;
import com.xworkz.playstoreapp.hub.impl.PlayStoreimpl;

public class AppExecutor {

    public static void main(String args[]) throws ApplicationNotFoundException, NullPointerException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of application to be added : ");
        int size=sc.nextInt();
        SoftwareHub softwareHub=new PlayStoreimpl();


        for (int index = 0; index < size; index++) {
            Application application=new Application();
//            System.out.println("Enter the Application Id : ");
//            application.setAppId(sc.nextInt());

            System.out.println("Enter the Application Name : ");
            application.setAppName(sc.next());

            System.out.println("Enter the Application Type : ");
            application.setAppType(sc.next());

            System.out.println("Enter the Application Version : ");
            application.setAppVersion(sc.nextDouble());

            System.out.println("Enter the Company Name : ");
            application.setCompanyName(sc.next());

            System.out.println("Enter the Release Date : ");
            application.setReleaseDate(sc.nextInt());

            System.out.println("Enter the application size : ");
            application.setSizeinMB(sc.next());

            softwareHub.addApplication(application);
        }

        System.out.println();
        softwareHub.getAllApplication();
        System.out.println();


        String input="";
        do {
            System.out.println("Enter 1 : to get All Application ");
            System.out.println("Enter 2 : to get Application By Name ");
            System.out.println("Enter 3 : to get Application By Id ");
            System.out.println("Enter 4 : to get Application Name By Type ");
            System.out.println("Enter 5 : to get Application Type By Name ");
            System.out.println("Enter 6 : to get Application Size By Type ");
            System.out.println("Enter 7 : to get Application Version By Type ");
            System.out.println("Enter 8 : to get Application Release Date By Version ");
            System.out.println("Enter 9 : to update Application Version By AppName ");
            System.out.println("Enter 10 : to updated Application Company Name By Id ");
            System.out.println("Enter 11 : to delete Application By AppName ");

            int option=sc.nextInt();
            switch (option){

                case 1 :
                    System.out.println("");
                    boolean appl1=softwareHub.getAllApplication();
                    System.out.println(appl1);
                    break;

                case 2 :
                    System.out.println("Enter the application Name : ");
                    Application appl2=softwareHub.getaApplicationByName(sc.next());
                    try {
                        System.out.println(appl2.getAppId()+" "+appl2.getAppName()+" "+appl2.getAppType()+" "+appl2.getAppVersion()+" "+
                                appl2.getReleaseDate()+" "+appl2.getCompanyName()+" "+appl2.getSizeinMB());
                    }catch (NullPointerException e){
                        System.out.println("given name of application is not found : ");
                    }
                    break;

                case 3 :
                    System.out.println("Enter the application Id : ");
                    Application appl3=softwareHub.getApplicationById(sc.nextInt());
                    System.out.println(appl3.getAppId()+" "+appl3.getAppName()+" "+appl3.getAppType()+" "+appl3.getAppVersion()+" "+
                            appl3.getReleaseDate()+" "+appl3.getCompanyName()+" "+appl3.getSizeinMB());
                    break;

                case 4 :
                    System.out.println("Enter the Type of an application : ");
                    String appl4=softwareHub.getApplicationNameByType(sc.next());
                        System.out.println(appl4);
                    break;

                case 5 :
                    System.out.println("Enter the Name of an application : ");
                    String appl5=softwareHub.getApplicationTypeByName(sc.next());
                    System.out.println(appl5);
                    break;

                case 6 :
                    System.out.println("Enter the type of an application : ");
                    String appl6=softwareHub.getApplicationSizeByType(sc.next());
                    System.out.println(appl6);
                    break;

                case 7 :
                    System.out.println("Enter the Type of an application : ");
                    double appl7=softwareHub.getApplicationVersionByType(sc.next());
                    System.out.println(appl7);
                    break;

                case 8 :
                    System.out.println("Enter the Version of an application : ");
                    int appl8=softwareHub.getApplicationReleaseDateByVersion(sc.nextDouble());
                    System.out.println(appl8);
                    break;

                case 9 :
                    System.out.println("Enter the application name : ");
                    System.out.println("Enter the Version to be update : ");
                    boolean appl9=softwareHub.updateApplicationVersionByAppName(sc.next(),sc.nextDouble());
                    softwareHub.getAllApplication();
                    break;

                case 10 :
                    System.out.println("Enter the ID of an application : ");
                    System.out.println("Enter the Company name to be update : ");
                    boolean apll10=softwareHub.updatedApplicationCompanyNameById(sc.nextInt(), sc.next());
                    softwareHub.getAllApplication();
                    break;

                case 11 :
                    System.out.println("Enter the name of an application : ");
                    softwareHub.deleteApplicationByAppName(sc.next());
                    break;

                default:
                    System.out.println("Please select the option which is available in the above : ");
            }

            System.out.println("If you want to continue please enter Y/N : ");
            input= sc.next();

        }while (input.equals("Y"));

        System.out.println("Thank you for using our app..!! enjoy your day...");


    }

}
