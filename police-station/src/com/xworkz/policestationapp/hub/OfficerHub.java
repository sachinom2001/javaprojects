package com.xworkz.policestationapp.hub;
import com.xworkz.policestationapp.PoliceStation.Officer;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public interface OfficerHub {

    public boolean addOfficers(Officer officers) ;

    public boolean getAllOfficers() ;

    public String getOfficersNameByPostName(String postName);

    public String getAddressByOfficerID(int officerID);

    public Officer getOfficersInfoByID(int officerID);

    public Officer getOfficersInfoByPostName(String postName);

   public boolean updateOfficerPostNameByOfficerName(String existingOfficerName,String updatedPostName);

   public void deleteOfficerByID(int officerID);


}






