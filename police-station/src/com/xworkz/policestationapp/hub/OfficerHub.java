package com.xworkz.policestationapp.hub;
import com.xworkz.policestationapp.PoliceStation.Officer;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class OfficerHub {

    Officer officers[] ;
    int index;

   public OfficerHub(int size){
        officers=new Officer[size];
    }


    public boolean addOfficers(Officer officers) {
        boolean isAdded = false;
        if (officers != null) {
            this.officers[index++] = officers;
            isAdded =true;
        }
        else {
            System.out.println("nullpointer exception : ");
        }
        return isAdded;
    }

    public boolean getAllOfficers() {
        System.out.println("List of  an Officers are : ");
        for (int index = 0; index < this.officers.length; index++) {
            System.out.println(officers[index].getOfficerID() + "    " + officers[index].getOfficerName()+"    "+
                    officers[index].getPostName()+"    "+officers[index].getAge()+"   "+officers[index].getGender()+"    "+
                    officers[index].getBloodGroup()+"   "+officers[index].getEmailId()+"    "+officers[index].getAddress());
        }
        return false;
    }


    public String getOfficersNameByPostName(String postName){

        String officersName="";
        for (int offindex = 0; offindex <this.officers.length ; offindex++) {
            if (officers[offindex].getPostName().equals(postName)){
                officersName=officers[offindex].getOfficerName();
                System.out.println("Request found... please collect in the executor : ");
            }
        }
        return officersName;
    }

    public String getAddressByOfficerID(int officerID){
            String officerAddress="";
        for (int offindex = 0; offindex < this.officers.length; offindex++) {
            if (officers[offindex].getOfficerID()==officerID){
                officerAddress=officers[offindex].getAddress();
                System.out.println("Request found.. please collect in the executor : ");
            }
        }
        return officerAddress;
    }

    public Officer getOfficersInfoByID(int officerID){
        Officer officersInfo=null;
        for (int offindex = 0; offindex < this.officers.length; offindex++) {
            if (officers[offindex].getOfficerID()==officerID){
                officersInfo=officers[offindex];
                System.out.println("Request found.. please collect in the executor : ");
            }
        }
        return officersInfo;
    }


   public boolean updateOfficerPostNameByOfficerName(String existingOfficerName,String updatedPostName){

        boolean isPostNameUpdated=false;
       for (int appindex = 0; appindex < this.officers.length; appindex++) {
           if (officers[appindex].getOfficerName() .equals(existingOfficerName) ) {
               officers[appindex].setPostName(updatedPostName);
               isPostNameUpdated = true;
               System.out.println("PostName is updated : ");
           }
       }
       return isPostNameUpdated;
   }


   public void deleteOfficerByID(int officerID){
//        Officer newofficers[]=new Officer[this.officers.length-1];
        int index,newindex;
       for (index = 0,newindex=0; index < this.officers.length; index++) {
           if (officers[index].getOfficerID()!=officerID){
                officers[newindex++]=officers[index];
           }
       }

       officers= Arrays.copyOf(officers,newindex);
//       getAllNewOfficers(officers);
   }

//    private void getAllNewOfficers(Officer[] officers) {
//        System.out.println("Officer's after deletion are : ");
//        for (int i = 0; i < officers.length; i++) {
//            System.out.println(officers[i].getOfficerID() + " " + officers[i].getOfficerName() + " " + officers[i].getPostName() + " " +
//                    officers[i].getAge() + " " + officers[i].getGender() + " " + officers[i].getBloodGroup() + " " + officers[i].getEmailId()
//                    + " " + officers[i].getAddress());
//
//        }
//    }

}






