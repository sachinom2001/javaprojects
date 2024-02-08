package com.xworkz.playstoreapp.hub;

import com.xworkz.playstoreapp.application.Application;
import com.xworkz.playstoreapp.exception.ApplicationNotFoundException;

import java.util.Arrays;

public interface SoftwareHub {

//    final static int dummy=10;

//    public static void m(){
////        dummy=20;
//        System.out.println(dummy);
//    }

//    1 method
    public boolean addApplication(Application application) ;

//    2 method
    public boolean getAllApplication() ;

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


//    customer compile/checked exception
    public Application getApplicationById(int appId) throws ApplicationNotFoundException;

    public Application getaApplicationByName(String appName) ;

    public String getApplicationNameByType(String appType) ;

    public String getApplicationTypeByName(String appName) ;

    public String getApplicationSizeByType(String appType) ;

    public double getApplicationVersionByType(String appType) ;

    public int getApplicationReleaseDateByVersion(double appVersion) ;

    public boolean updateApplicationVersionByAppName( String existingAppName,double updatedAppVersion) ;

    public boolean updatedApplicationCompanyNameById( int existingAppId,String updatedCompanyName) ;

    public void deleteApplicationByAppName(String appName) ;

//    public void getAllNewApplication(Application[] application) ;

}

