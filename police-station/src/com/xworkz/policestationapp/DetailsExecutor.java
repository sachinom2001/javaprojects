package com.xworkz.policestationapp;

import com.xworkz.policestationapp.PoliceStation.Officer;
import com.xworkz.policestationapp.hub.OfficerHub;
import com.xworkz.policestationapp.hub.impl.OfficersFileimpl;

import java.util.Scanner;

public class DetailsExecutor {

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of officer's to be added : ");
        int size=sc.nextInt();
        OfficerHub officerHub=new OfficersFileimpl();

        for (int index = 0; index < size; index++) {
            Officer officer=new Officer();
//            System.out.println("Enter the officer ID : ");
//            officer.setOfficerID(sc.nextInt());

            System.out.println("Enter the Name of an officer : ");
            officer.setOfficerName(sc.next());

            System.out.println("Enter the PostName of an officer : ");
            officer.setPostName(sc.next());

            System.out.println("Enter the Age of an officer : ");
            officer.setAge(sc.nextInt());

            System.out.println("Enter the Gender of an officer : ");
            officer.setGender(sc.next());

            System.out.println("Enter the Blood Group of an officer : ");
            officer.setBloodGroup(sc.next());

            System.out.println("Enter the E-mailid of an officer : ");
            officer.setEmailId(sc.next());

            System.out.println("Enter the Adress of an officer : ");
            officer.setAddress(sc.next());

            officerHub.addOfficers(officer);
        }
        System.out.println();
        officerHub.getAllOfficers();
        System.out.println();
        

        String input="";

        do {
            System.out.println("Enter 1 : to get AllOfficers ");
            System.out.println("Enter 2 : to get Officers Name By PostName ");
            System.out.println("Enter 3 : to get Address By OfficerID ");
            System.out.println("Enter 4 : to get Officers Information By ID ");
            System.out.println("Enter 5 : to get Officers Information By PostName ");
            System.out.println("Enter 6 : to update Officer PostName By OfficerName ");
            System.out.println("Enter 7 : to delete Officer By ID ");

            int options= sc.nextInt();
            switch (options){
                case 1 :
                    boolean offi1=officerHub.getAllOfficers();
                    System.out.println(offi1);
                break;

                case 2 :
                    System.out.println("Enter the PostName of an officer : ");
                    String offi2=officerHub.getOfficersNameByPostName(sc.next());
                    System.out.println(offi2);
                break;

                case 3 :
                    System.out.println("Enter the ID of an officer : ");
                    String offi3=officerHub.getAddressByOfficerID(sc.nextInt());
                    System.out.println(offi3);
                    break;

                case 4 :
                    System.out.println("Enter the ID of an officer : ");
                    Officer offi4=officerHub.getOfficersInfoByID(sc.nextInt());
                    try {
                        System.out.println(offi4.getOfficerID() + " " + offi4.getOfficerName() + " " + offi4.getPostName() + " " +
                                offi4.getAge() + " " + offi4.getGender() + " " + offi4.getBloodGroup() + " " + offi4.getEmailId() + " " + offi4.getAddress());
                    }catch (NullPointerException e){
                        System.out.println("given officers id is not found :");
                    }
                    break;

                case 5 :
                    System.out.println("Enter the PostName of an officer : ");
                    Officer offi5=officerHub.getOfficersInfoByPostName(sc.next());
                    try {
                        System.out.println(offi5.getOfficerID() + " " + offi5.getOfficerName() + " " + offi5.getPostName() + " " +
                                offi5.getAge() + " " + offi5.getGender() + " " + offi5.getBloodGroup() + " " + offi5.getEmailId() + " " + offi5.getAddress());
                    }catch (NullPointerException e){
                        System.out.println("given officers id is not found :");
                    }
                    break;

                case 6 :
                    System.out.println("Enter the officerName : ");
                    System.out.println("Enter the PostName to be update : ");
                    boolean offi6=officerHub.updateOfficerPostNameByOfficerName(sc.next(), sc.next());
                    officerHub.getAllOfficers();
                    break;

                case 7 :
                    System.out.println("Enter the ID of an officer : ");
                    officerHub.deleteOfficerByID(sc.nextInt());
                    break;

                default:
                    System.out.println("Please select the option which is available in the above : ");
            }

            System.out.println("If you want to continue please enter Y/N : ");
            input= sc.next();

        }while (input.equals("Y"));

            System.out.println("Thank you ..!! enjoy your day...");

    }

}
