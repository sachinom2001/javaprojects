package com.xworkz.cellphoneproducts.hub;

import com.xworkz.cellphoneproducts.smartphone.SmartPhone;

import java.util.Arrays;

public class MobileShop {

    SmartPhone smartPhone[];
    int index;

    public MobileShop(int size){
        smartPhone=new SmartPhone[size];
    }

    public boolean addPhones(SmartPhone smartPhone) {
        boolean isAdded = false;
        if (smartPhone != null) {
            this.smartPhone[index++] = smartPhone;
            isAdded =true;
        }
        else {
            System.out.println("nullpointer exception : ");
        }
        return isAdded;
    }

    public boolean getAllPhones() {
        System.out.println("List of mobile Phones are : ");
        for (int index = 0; index < this.smartPhone.length; index++) {
            System.out.println(smartPhone[index].getDeviceName() + "    " + smartPhone[index].getModel()+"    "+
                    smartPhone[index].getAndroidVersion()+"    "+smartPhone[index].getProcessor()+"   "
                    +smartPhone[index].getDeviceStorage()+"    "+smartPhone[index].getRam()+"   "+
                    smartPhone[index].getCameraResolution()+"    "+smartPhone[index].getBatteryCapacity()+" "+
                    smartPhone[index].getPrice());
        }
        return false;
    }

    public String getDeviceNameByProcessor(String processor){

        String phoneName="";
        for (int index = 0; index <this.smartPhone.length ; index++) {
            if (smartPhone[index].getProcessor().equals(processor)){
                phoneName=smartPhone[index].getDeviceName();
                System.out.println("Request found... please collect in the executor : ");
            }
        }
        return phoneName;
    }

    public String getDeviceNameByVersion(int androidVersion){
        String deviceName="";
        for (int index = 0; index < this.smartPhone.length; index++) {
            if (smartPhone[index].getAndroidVersion()==androidVersion){
                deviceName=smartPhone[index].getDeviceName();
                System.out.println("Request found.. please collect in the executor : ");
            }
        }
        return deviceName;
    }

    public boolean updateMoibleProcessorByModel(String existingModel,String updatedProcessor){

        boolean isProcessorUpdated=false;
        for (int index = 0; index < this.smartPhone.length; index++) {
            if (smartPhone[index].getModel().equals(existingModel) ) {
                smartPhone[index].setProcessor(updatedProcessor);
                isProcessorUpdated = true;
                System.out.println("Mobile Processor is updated : ");
            }
        }
        return isProcessorUpdated;
    }

    public void deleteMobileByDeviceName(String deviceName){
//        SmartPhone newsmartPhones[]=new SmartPhone[][this.smartPhone.length-1];
        int index,newindex;
        for (index = 0,newindex=0; index < this.smartPhone.length; index++) {
            if (!smartPhone[index].getDeviceName().equals(deviceName)){
                smartPhone[newindex++]=smartPhone[index];
            }
        }

        smartPhone= Arrays.copyOf(smartPhone,newindex);
//       getAllNewOfficers(officers);
    }




}
