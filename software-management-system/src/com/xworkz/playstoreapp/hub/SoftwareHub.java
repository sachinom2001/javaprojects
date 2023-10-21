package com.xworkz.playstoreapp.hub;

import com.xworkz.playstoreapp.application.Application;

import java.util.Arrays;

public class SoftwareHub {

    Application application[] ;
    int index=0,applicationId=1;

    public SoftwareHub(int size){
        application=new Application[size];
    }


//    1 method
    public boolean addApplication(Application application) {
        boolean isAdded = false;
        if (application != null) {
            application.setAppId(applicationId++);
            this.application[index++]= application;
            System.out.println("Id for an application is added successfully..!");
            isAdded = true;
        }
        else {
            System.out.println("null pointer Exception");
        }
        return isAdded;
    }

//    2 method

    public boolean getAllApplication() {
        System.out.println("List of Application are: ");
        for (int index = 0; index < application.length; index++) {
            System.out.println(application[index].getAppId() + " " + application[index].getAppName() + " " +
                    application[index].getReleaseDate() + " " + application[index].getAppType() + " " +
                    application[index].getAppVersion() + " " + application[index].getSizeinMB() + " " +
                    application[index].getCompanyName());
        }
        return false;
    }


//    getApplicationById(int appId)
//    getApplicationByName(String appName)
//    getApplicationNameByAppType(String appType)
//    getApplicationTypeByAppName(String appName)
//    getApplicationSizeByType(String appType)
//    getApplicationVersionByType(String appType)
//    getApplicationReleaseDateByVersion(double appVersion)
//    updateApplicationVersionByAppName(double updatedAppVersion, String existingAppName)
//    updatedApplicationCompanyNameById(String updatedCompanyName, int existingAppId)
//    deleteApplicationByAppName(String appName)

    public Application getaApplicationByName(String appName) {

        System.out.println("Serching for an application: ");
        Application application1 = null;
        for (int appIndex = 0; appIndex < this.application.length; appIndex++) {
            if (application[appIndex].getAppName() .equals(appName)) {
                application1 = application[appIndex];
                System.out.println("Application found.. please collect in the executor : ");
            }

        }
        return application1;

    }


    public Application getApplicationById(int appId) {

        Application applctaion2 = null;
        for (int appIndex = 0; appIndex < this.application.length; appIndex++) {
            if (application[appIndex].getAppId() == appId) {
                applctaion2 = application[appIndex];
                System.out.println("Application found.. please collect in the executor : ");
            }

        }
        return applctaion2;

    }


    public String getApplicationNameByType(String appType) {

        String applicationName = "";
        for (int appIndex = 0; appIndex < this.application.length; appIndex++) {
            if (application[appIndex].getAppType() .equals(appType)) {
                applicationName = application[appIndex].getAppName();
                System.out.println("Application found.. please collect in the executor : ");
            }

        }
        return applicationName;

    }

    public String getApplicationTypeByName(String appName) {

        String applicationType = "";
        for (int appIndex = 0; appIndex < this.application.length; appIndex++) {
            if (application[appIndex].getAppName() .equals (appName)) {
                applicationType = application[appIndex].getAppType();
                System.out.println("Application found.. please collect in the executor : ");
            }

        }
        return applicationType;

    }

    public String getApplicationSizeByType(String appType) {

        String applicationSize = "";
        for (int appIndex = 0; appIndex < this.application.length; appIndex++) {
            if (application[appIndex].getAppType() .equals (appType)) {
                applicationSize = application[appIndex].getSizeinMB();
                System.out.println("Application found.. please collect in the executor : ");
            }

        }
        return applicationSize;

    }

    public double getApplicationVersionByType(String appType) {
        double applicationVersion = 0;
        for (int appindex = 0; appindex < this.application.length; appindex++) {
            if (application[appindex].getAppType() .equals(appType)) {
                applicationVersion = application[appindex].getAppVersion();
                System.out.println("Application found...please collect in the executor : ");
            }
        }
        return applicationVersion;
    }

    public int getApplicationReleaseDateByVersion(double appVersion) {
        int applicationReleaseDate = 0;
        for (int appindex = 0; appindex < this.application.length; appindex++) {
            if (application[appindex].getAppVersion() == appVersion) {
                applicationReleaseDate = application[appindex].getReleaseDate();
                System.out.println("Application found...please collect in the executor : ");
            }
        }
        return applicationReleaseDate;
    }


    public boolean updateApplicationVersionByAppName( String existingAppName,double updatedAppVersion) {
        boolean isVersionUpdated = false;
        for (int appindex = 0; appindex < this.application.length; appindex++) {
            if (application[appindex].getAppName() .equals(existingAppName)) {
                application[appindex].setAppVersion(updatedAppVersion);
                isVersionUpdated = true;
                System.out.println("Application updated by : ");
            }
        }
        return isVersionUpdated;
    }


    public boolean updatedApplicationCompanyNameById( int existingAppId,String updatedCompanyName) {
        boolean isCompanyNameUpdated = false;
        for (int appindex = 0; appindex < this.application.length; appindex++) {
            if (application[appindex].getAppId() == existingAppId) {
                application[appindex].setCompanyName(updatedCompanyName);
                isCompanyNameUpdated = true;
                System.out.println("Application updated by : ");
            }
        }
        return isCompanyNameUpdated;
    }


    public void deleteApplicationByAppName(String appName) {
        System.out.println("Invoked deleteApplicationByAppName : ");
        Application newapplication[] = new Application[this.application.length - 1];
        int index ,newIndex;
        for (index = 0,newIndex=0; index < this.application.length; index++) {
            if (!application[index].getAppName() .equals(appName)) {
                newapplication[newIndex++] = application[index];
            }
        }

//        one type
//        for (int i = 0; i < newapplication.length; i++) {
//            System.out.println(newapplication[i].getAppId() + " " + newapplication[i].getAppName() + " " +
//                    newapplication[i].getReleaseDate() + " " + newapplication[i].getAppType() + " " +
//                    newapplication[i].getAppVersion() + " " + newapplication[i].getSizeinMB() + " " +
//                    newapplication[i].getCompanyName());
//        }
//        System.out.println("Application deleted and get new application : ");


//        another type
       application =Arrays.copyOf(application,newIndex);
        getAllNewApplication(application);

    }
    private void getAllNewApplication(Application[] application) {
        for (int i = 0; i < application.length; i++) {
            System.out.println(application[i].getAppId()+" "+application[i].getAppName()+" "+application[i].getAppType()+" "+
                    application[i].getReleaseDate()+" "+application[i].getCompanyName()+" "+application[i].getAppVersion()+" "
                    +application[i].getSizeinMB());

        }
    }


}

