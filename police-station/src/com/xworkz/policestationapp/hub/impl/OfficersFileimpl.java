package com.xworkz.policestationapp.hub.impl;

import com.xworkz.policestationapp.PoliceStation.Officer;
import com.xworkz.policestationapp.exception.*;
import com.xworkz.policestationapp.hub.OfficerHub;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OfficersFileimpl implements OfficerHub {

//    Officer officers[] ;
//    int index,officerId=1;

    List<Officer> officers = new ArrayList<>();
    int index=0,officerId=1;

//    public OfficersFileimpl(int size){
//        officers=new Officer[size];
//    }
    public OfficersFileimpl(){

    }

    public boolean addOfficers(Officer officer) {
        System.out.println("started addOfficers method : ");
        boolean isAdded = false;

        try {
            if (officer != null) {
                officer.setOfficerID(officerId++);
                this.officers.add(officer);
                isAdded = true;
            } else {
                CannotAddNullApplication cannotAddNullApplication=new CannotAddNullApplication("error message : ");
                throw cannotAddNullApplication;
            }
        }catch (CannotAddNullApplication e){
            e.printStackTrace();
        }
        return isAdded;
    }

    public boolean getAllOfficers() {
        System.out.println("started getAllOfficers method: List of an Officers are : ");

            for (Officer officer : officers) {
                System.out.println(officer.getOfficerID() + "    " + officer.getOfficerName() + "    " +
                        officer.getPostName() + "    " + officer.getAge() + "   " + officer.getGender() + "    " +
                        officer.getBloodGroup() + "   " + officer.getEmailId() + "    " + officer.getAddress());
            }
        return true;
    }

    public String getOfficersNameByPostName(String postName){
        System.out.println("started getOfficersNameByPostName method : ");
        String officersName=null;

        try {
            for (Officer officer : officers) {
                if (officer.getPostName().equals(postName)) {
                    officersName = officer.getOfficerName();
                    System.out.println("Request found... please collect in the executor : ");
                }
            }
            if (officersName == null) {
                OfficersPostNameNotFoundException officersPostNameNotFoundException = new OfficersPostNameNotFoundException("error message :");
                throw officersPostNameNotFoundException;
            }
        }catch (OfficersPostNameNotFoundException e){
            e.printStackTrace();
        }
        return officersName;
    }

    public String getAddressByOfficerID(int officerID){
        System.out.println("started getAddressByOfficerID method : ");
        String officerAddress=null;

        try {
            for (Officer officer : officers) {
                if (officer.getOfficerID() == officerID) {
                    officerAddress = officer.getAddress();
                    System.out.println("Request found.. please collect in the executor : ");
                }
            }
            if (officerAddress==null){
                OfficersIDNotFoundException officersIDNotFoundException=new OfficersIDNotFoundException("error message : ");
                throw officersIDNotFoundException;
            }
        }catch (OfficersIDNotFoundException e){
            e.printStackTrace();
        }
        return officerAddress;
    }

    public Officer getOfficersInfoByID(int officerID){
        System.out.println("started getOfficersInfoByID method : ");
        Officer officersInfo=null;

        try {
            for (Officer officer : officers) {
                if (officer.getOfficerID() == officerID) {
                    officersInfo = officer;
                    System.out.println("Request found.. please collect in the executor : ");
                }
            }
            if (officersInfo==null){
                OfficersIDNotFoundException officersIDNotFoundException=new OfficersIDNotFoundException("error message :");
                throw officersIDNotFoundException;
            }
        }catch (OfficersIDNotFoundException e){
            e.printStackTrace();
        }
        return officersInfo;
    }

    public Officer getOfficersInfoByPostName(String postName){
        System.out.println("started getOfficersInfoByPostName method :");
        Officer officerInfo=null;

        try {

            for (Officer officer : officers) {
                if (officer.getPostName().equals(postName)) {
                    officerInfo = officer;
                    System.out.println("Request found.. please collect in the executor : ");
                }
            }
            if (officerInfo == null) {
                OfficersPostNameNotFoundException officersPostNameNotFoundException = new OfficersPostNameNotFoundException("error message");
                throw officersPostNameNotFoundException;
            }
        }catch (OfficersPostNameNotFoundException e){
            e.printStackTrace();
        }
        return officerInfo;
    }

    public boolean updateOfficerPostNameByOfficerName(String existingOfficerName,String updatedPostName){
        System.out.println("started updateOfficerPostNameByOfficerName method : ");
        boolean isPostNameUpdated=false;

        try {
            for (Officer officer : officers) {
                if (officer.getOfficerName().equals(existingOfficerName)) {
                    officer.setPostName(updatedPostName);
                    isPostNameUpdated = true;
                    System.out.println("PostName is updated : ");
                }
            }
            if (isPostNameUpdated==false){
                UpdatedOfficersPostNameNotFoundException updatedOfficersPostNameNotFoundException=new UpdatedOfficersPostNameNotFoundException("error message :");
                throw updatedOfficersPostNameNotFoundException;
            }
        }catch (UpdatedOfficersPostNameNotFoundException e){
            e.printStackTrace();
        }
        return isPostNameUpdated;
    }

    public void deleteOfficerByID(int officerID){
        System.out.println("started deleteOfficerByID method : ");
//            Officer newofficers[]=new Officer[this.officers.length-1];
//        int index,newindex=0;

        boolean isDeleted=false;

        try {
            if (this.officers.size() > 0) {
                for (Officer officer : officers) {
                    if (officer.getOfficerID() == officerID) {
                        officers.remove(officer);
                        isDeleted = true;
                    }
                }
                System.out.println("After delete method :");
                for (Officer officer : officers) {
                    System.out.println(officer);
                }
                if (isDeleted == false) {
                    DeletedOfficerNotFoundException deletedOfficerNotFoundException = new DeletedOfficerNotFoundException("error message :");
                    throw deletedOfficerNotFoundException;
                }
            } else {
                    DeletedOfficerNotFoundException deletedOfficerNotFoundException=new DeletedOfficerNotFoundException("error message :");
                    throw deletedOfficerNotFoundException;
                }

        }catch (DeletedOfficerNotFoundException e){
            e.printStackTrace();
        }

//        officers= Arrays.copyOf(officers,newindex);
//       getAllNewOfficers(officers);

    }


}
