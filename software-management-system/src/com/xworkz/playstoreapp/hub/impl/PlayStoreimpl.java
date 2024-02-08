package com.xworkz.playstoreapp.hub.impl;

import com.xworkz.playstoreapp.application.Application;
import com.xworkz.playstoreapp.exception.*;
import com.xworkz.playstoreapp.hub.SoftwareHub;

import java.util.Arrays;

//  custom runtime exception
public class PlayStoreimpl implements SoftwareHub {

    Application application[] ;
    int index=0,applicationId=1;

    public PlayStoreimpl() {
    }

    public PlayStoreimpl(int size){
        application=new Application[size];
    }

    @Override
    public boolean addApplication(Application application) {
        boolean isAdded = false;

        try {
            if (application != null) {
                application.setAppId(applicationId++);
                this.application[index++] = application;
                System.out.println("Id for an application is added successfully..!");
                isAdded = true;
            } else {
                CannotAddNullApplication cannotAddNullApplication=new CannotAddNullApplication("error message :");
                throw cannotAddNullApplication;
            }
        }catch (CannotAddNullApplication e){
            e.printStackTrace();
        }
        return isAdded;
    }

    public boolean getAllApplication() {
        System.out.println("List of Application are: ");
        for (int index = 0; index < application.length; index++) {
            System.out.println(application[index].getAppId() + " " + application[index].getAppName() + " " +
                    application[index].getAppType() + " " + application[index].getAppVersion() + " " +
                    application[index].getCompanyName() + " " + application[index].getReleaseDate() + " " +
                    application[index].getSizeinMB());
        }
        return true;
    }

    public Application getApplicationById(int appId) throws ApplicationNotFoundException{
        System.out.println("started getApplicationById method : ");
        Application applctaion2 = null;

//        try {
            if (appId > 0) {
                for (int appIndex = 0; appIndex < this.application.length; appIndex++) {
                    if (application[appIndex].getAppId() == appId) {
                        applctaion2 = application[appIndex];
                    }
                }
                if (applctaion2 == null) {
                        ApplicationNotFoundException applicationNotFoundException = new ApplicationNotFoundException("error message : ");
                        throw applicationNotFoundException;
                }
            }else {
                InvalidIDFoundException invalidIDFoundException=new InvalidIDFoundException("error message :");
                throw invalidIDFoundException;
            }

//        }catch (ApplicationNotFoundException | InvalidIDFoundException e){
////            System.out.println(e);
//            e.printStackTrace();
//        }
        return applctaion2;
    }


    public Application getaApplicationByName(String appName) {
        System.out.println("started getApplicationByName method : ");
        Application application1 = null;

        try {
            for (int appIndex = 0; appIndex < this.application.length; appIndex++) {
                if (application[appIndex].getAppName().equals(appName)) {
                    application1 = application[appIndex];
                    System.out.println("Application found.. please collect in the executor : ");
                }

            if (application1==null){
                ApplicationNameNotFoundException applicationNameNotFoundException=new ApplicationNameNotFoundException("error message");
                throw applicationNameNotFoundException;
              }
            }
        }catch (ApplicationNameNotFoundException e){
            e.printStackTrace();
        }
        return application1;
    }

    public String getApplicationNameByType(String appType) {
        System.out.println("started getApplicationNameByType method : ");
        String applicationName =null;

        try {
            for (int appIndex = 0; appIndex < this.application.length; appIndex++) {
                if (application[appIndex].getAppType().equals(appType)) {
                    applicationName = application[appIndex].getAppName();
                    System.out.println("Application found.. please collect in the executor : ");
                }
                if (applicationName==null){
//                    ApplicationTypeNotFoundException applicationTypeNotFoundException=new ApplicationTypeNotFoundException("error message");
//                    throw applicationTypeNotFoundException;
                    throw new ApplicationTypeNotFoundException("message");
                }
            }
        }catch (ApplicationTypeNotFoundException e){
            e.printStackTrace();
        }
        return applicationName;
    }
    public String getApplicationTypeByName(String appName) {
        System.out.println("started getApplicationTypeByName method : ");
        String applicationType = null;

        try {
            for (int appIndex = 0; appIndex < this.application.length; appIndex++) {
                if (application[appIndex].getAppName().equals(appName)) {
                    applicationType = application[appIndex].getAppType();
                    System.out.println("Application found.. please collect in the executor : ");
                }
                if (applicationType==null){
                    ApplicationNameNotFoundException applicationNameNotFoundException=new ApplicationNameNotFoundException("error message :");
                    throw applicationNameNotFoundException;
                }
            }
        }catch (ApplicationNameNotFoundException e){
            e.printStackTrace();
        }
        return applicationType;

    }

    public String getApplicationSizeByType(String appType) {
        System.out.println("started getApplicationSizeByType method : ");
        String applicationSize = null;

        try {
            for (int appIndex = 0; appIndex < this.application.length; appIndex++) {
                if (application[appIndex].getAppType().equals(appType)) {
                    applicationSize = application[appIndex].getSizeinMB();
                    System.out.println("Application found.. please collect in the executor : ");
                }
            }
                if (applicationSize==null){
                    ApplicationTypeNotFoundException applicationTypeNotFoundException=new ApplicationTypeNotFoundException("error message : ");
                    throw applicationTypeNotFoundException;
                }
        }catch (ApplicationTypeNotFoundException e){
            e.printStackTrace();
        }
        return applicationSize;
    }

    public double getApplicationVersionByType(String appType) {
        System.out.println("started getApplicationVersionByType method : ");
        double applicationVersion = 0;

        try {
            for (int appindex = 0; appindex < this.application.length; appindex++) {
                if (application[appindex].getAppType().equals(appType)) {
                    applicationVersion = application[appindex].getAppVersion();
                    System.out.println("Application found...please collect in the executor : ");
                }
            }
                if (applicationVersion==0){
                    ApplicationTypeNotFoundException applicationTypeNotFoundException=new ApplicationTypeNotFoundException("error message :");
                    throw applicationTypeNotFoundException;
                }
        }catch (ApplicationTypeNotFoundException e){
            e.printStackTrace();
        }
        return applicationVersion;
    }

    public int getApplicationReleaseDateByVersion(double appVersion) {
        System.out.println("started getApplicationReleaseDateByVersion method : ");
        int applicationReleaseDate = 0;

        try {
            for (int appindex = 0; appindex < this.application.length; appindex++) {
                if (application[appindex].getAppVersion() == appVersion) {
                    applicationReleaseDate = application[appindex].getReleaseDate();
                    System.out.println("Application found...please collect in the executor : ");
                }
            }
            if (applicationReleaseDate==0){
                ApplicationVersionNotFoundException applicationVersionNotFoundException=new ApplicationVersionNotFoundException("error message :");
                throw applicationVersionNotFoundException;
            }
        }catch (ApplicationVersionNotFoundException e){
            e.printStackTrace();
        }
        return applicationReleaseDate;
    }

    public boolean updateApplicationVersionByAppName( String existingAppName,double updatedAppVersion) {
        System.out.println("started updateApplicationVersionByAppName method : ");
        boolean isVersionUpdated = false;

        try {
            for (int appindex = 0; appindex < this.application.length; appindex++) {
                if (application[appindex].getAppName().equals(existingAppName)) {
                    application[appindex].setAppVersion(updatedAppVersion);
                    isVersionUpdated = true;
                    System.out.println("Application updated by : ");
                }
            }
                if (isVersionUpdated==false) {
                    UpdatedApplicationNotFoundException updatedApplicationNotFoundException=new UpdatedApplicationNotFoundException("error message");
                    throw updatedApplicationNotFoundException;
                }

        }catch (UpdatedApplicationNotFoundException e){
            e.printStackTrace();
        }
        return isVersionUpdated;
    }

    public boolean updatedApplicationCompanyNameById( int existingAppId,String updatedCompanyName) {
        System.out.println("started updatedApplicationCompanyNameById method : ");
        boolean isCompanyNameUpdated = false;

        try {
            for (int appindex = 0; appindex < this.application.length; appindex++) {
                if (application[appindex].getAppId() == existingAppId) {
                    application[appindex].setCompanyName(updatedCompanyName);
                    isCompanyNameUpdated = true;
                    System.out.println("Application updated by : ");
                }
            }
            if (isCompanyNameUpdated==false){
                UpdatedApplicationNotFoundException updatedApplicationNotFoundException=new UpdatedApplicationNotFoundException("error message :");
                throw updatedApplicationNotFoundException;
            }
        }catch (UpdatedApplicationNotFoundException e){
            e.printStackTrace();
        }
        return isCompanyNameUpdated;
    }

    public void deleteApplicationByAppName(String appName) {
        System.out.println("started Invoked delete application by app name method : ");
//        Application newapplication[] = new Application[this.application.length - 1];
        int index, newIndex = 0;
        boolean isPresent=false;

        try {
            if (this.application.length > 0) {
                for (index = 0, newIndex = 0; index < this.application.length; index++) {
                    if (!application[index].getAppName().equals(appName)) {
                        application[newIndex++] = application[index];
                        isPresent=false;
                    }
                    else {
                        isPresent=true;
                        break;
                    }
                }
                if (isPresent==false){
                    DeletedApplicationNotFoundException deletedApplicationNotFoundException = new DeletedApplicationNotFoundException("error message :");
                    throw deletedApplicationNotFoundException;
                }
            } else {
                DeletedApplicationNotFoundException deletedApplicationNotFoundException = new DeletedApplicationNotFoundException("error message :");
                throw deletedApplicationNotFoundException;
            }
        } catch (DeletedApplicationNotFoundException e) {
            e.printStackTrace();
        }
        application = Arrays.copyOf(application,newIndex);
    }


//        one type
//        for (int i = 0; i < newapplication.length; i++) {
//            System.out.println(newapplication[i].getAppId() + " " + newapplication[i].getAppName() + " " +
//                    application[i].getReleaseDate() + " " + newapplication[i].getAppType() + " " +
//                    newapplication[i].getAppVersion() + " " + newapplication[i].getSizeinMB() + " " +
//                    newapplication[i].getCompanyName());
//        }
//        System.out.println("Application deleted and get new application : ");

//        another type
//            application = Arrays.copyOf(application,newIndex);
//            getAllNewApplication(application);


//    private void getAllNewApplication(Application[] application) {
//        for (int i = 0; i < application.length; i++) {
//            System.out.println(application[i].getAppId()+" "+application[i].getAppName()+" "+application[i].getAppType()+" "+
//                    application[i].getReleaseDate()+" "+application[i].getCompanyName()+" "+application[i].getAppVersion()+" "
//                    +application[i].getSizeinMB());
//
//        }
//    }


}
