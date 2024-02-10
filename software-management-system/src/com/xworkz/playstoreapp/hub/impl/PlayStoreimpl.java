package com.xworkz.playstoreapp.hub.impl;

import com.xworkz.playstoreapp.application.Application;
import com.xworkz.playstoreapp.exception.*;
import com.xworkz.playstoreapp.hub.SoftwareHub;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//  custom runtime exception
public class PlayStoreimpl implements SoftwareHub {

    List<Application> applications = new ArrayList<>();
    int index=0,applicationId=1;

    public PlayStoreimpl() {

    }

//    public PlayStoreimpl(int size){
//        application=new Application[size];
//    }

    @Override
    public boolean addApplication(Application application) {
        boolean isAdded = false;

        try {
            if (application != null) {
                application.setAppId(applicationId++);
                this.applications.add(application);
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
        for (Application application:applications){
            System.out.println(application);
        }
        return true;
    }

    public Application getApplicationById(int appId) throws ApplicationNotFoundException{
        System.out.println("started getApplicationById method : ");
        Application applctaion1 = null;

//        try {
            if (appId > 0) {
                for (Application application :applications) {
                    if (application.getAppId() == appId) {
                        applctaion1 = application;
                    }
                }
                if (applctaion1 == null) {
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
        return applctaion1;
    }

    public Application getaApplicationByName(String appName) {
        System.out.println("started getApplicationByName method : ");
        Application application1 = null;

        try {
            for (Application application: applications) {
                if (application.getAppName().equals(appName)) {
                    application1 = application;
                    System.out.println("Application found.. please collect in the executor : ");
                }
            }

            if (application1==null){
                ApplicationNameNotFoundException applicationNameNotFoundException=new ApplicationNameNotFoundException("error message");
                throw applicationNameNotFoundException;
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
            for (Application application:applications) {
                if (application.getAppType().equals(appType)) {
                    applicationName = application.getAppName();
                    System.out.println("Application found.. please collect in the executor : ");
                }
            }
                if (applicationName==null){
//                    ApplicationTypeNotFoundException applicationTypeNotFoundException=new ApplicationTypeNotFoundException("error message");
//                    throw applicationTypeNotFoundException;
                    throw new ApplicationTypeNotFoundException("message");
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
            for (Application application: applications) {
                if (application.getAppName().equals(appName)) {
                    applicationType = application.getAppType();
                    System.out.println("Application found.. please collect in the executor : ");
                }
            }
            if (applicationType==null){
                ApplicationNameNotFoundException applicationNameNotFoundException = new ApplicationNameNotFoundException("error message :");
                throw applicationNameNotFoundException;
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
            for (Application application : applications) {
                if (application.getAppType().equals(appType)) {
                    applicationSize = application.getSizeinMB();
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
            for (Application application:applications) {
                if (application.getAppType().equals(appType)) {
                    applicationVersion = application.getAppVersion();
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
            for (Application application:applications) {
                if (application.getAppVersion() == appVersion) {
                    applicationReleaseDate = application.getReleaseDate();
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
            for (Application application : applications) {
                if (application.getAppName().equals(existingAppName)) {
                    application.setAppVersion(updatedAppVersion);
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
            for (Application application : applications) {
                if (application.getAppId() == existingAppId) {
                    application.setCompanyName(updatedCompanyName);
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
//        int index, newIndex = 0;
        boolean isdeleted=false;

        try {
            if (this.applications.size() > 0) {
                for (Application application : applications) {
                    if (application.getAppName().equals(appName)) {
                        applications.remove(application);
                        isdeleted=true;
                    }
                }
                System.out.println(" After delete method  :");
                for ( Application application:applications ) {
                    System.out.println(application);
                }
                if (isdeleted==false){
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
//        application = Arrays.copyOf(application,newIndex);

    }


}
