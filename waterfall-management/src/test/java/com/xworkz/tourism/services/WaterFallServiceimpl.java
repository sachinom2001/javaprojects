package com.xworkz.tourism.services;

import com.xworkz.tourism.dto.WaterFall;
import com.xworkz.tourism.repository.WaterFallRepository;
import com.xworkz.tourism.repository.WaterFallRepositoryImpl;

import java.util.ArrayList;
import java.util.List;

public class WaterFallServiceimpl implements WaterFallService{

    WaterFallRepository waterFallRepository = new WaterFallRepositoryImpl();

    @Override
    public void validationAndSaveWaterFall(WaterFall waterFall) {
        // Validation logic

        if (waterFall.getName()!=null && waterFall.getPlace()!=null &&
                waterFall.getRiver_name()!=null && waterFall.getState()!=null ){
            waterFallRepository.saveWaterFall(waterFall);
            System.out.println("Validation is done :");
        }else {
            // Print message
            System.out.println("Invalid name or river name or place or state ..... Please Enter correct details !!!!!");
        }

    }

    @Override
    public void validationAndSaveWaterFall(List<WaterFall> waterFalls) {

        // validation logic
        boolean isValid = false;
        for(WaterFall waterFall : waterFalls){
            if(waterFall.getName() != null && waterFall.getRiver_name() != null){
                isValid = true;
            }else{
                isValid = false;
                System.out.println("Invalid name or river name" + " ---- Please enter valid details");
                break;
            }
        }
        //save in repository
        if(isValid == true){
            waterFallRepository.saveWaterFall(waterFalls);
        }
    }

    @Override
    public void validateAndUpdateRiverByName(String waterFall, String riverName) {
        if(waterFall != null && !waterFall.isEmpty() && riverName != null && !riverName.isEmpty()){
            System.out.println("Updating the entries-----------");
            waterFallRepository.updateRiverByName(waterFall,riverName);
        }else{
            System.out.println("Enter a valid values-----------------");
        }
    }

    @Override
    public void validateAndDeleteWaterFallByName(String waterFallName) {
        boolean deletedResult = false;
        if (waterFallName!= null){
                deletedResult = waterFallRepository.deleteWaterFallByName(waterFallName);
        }
        else {
            System.out.println(" ------ invalid input ------ ");
        }
    }

    @Override
    public void validateAndGetWaterFallByName(String waterFall) {
        WaterFall waterFalls = new WaterFall();

        if (waterFall != null && !waterFall.isEmpty()){
            waterFalls = waterFallRepository.getWaterFallByName(waterFall.toLowerCase());
            System.out.println("Details of the waterfall with entered name are --: ");
            System.out.println("Name : "+waterFalls.getName());
            System.out.println("River_name : "+waterFalls.getRiver_name());
            System.out.println("Place : "+waterFalls.getPlace());
            System.out.println("State : "+waterFalls.getState());
        }else {
            System.out.println(" --------- please provide valid input --------- ");
        }
    }

    @Override
    public void validateAndGetRiverNameByName(String waterFallName) {
        String riverName = "";

        if(waterFallName != null && !waterFallName.isEmpty()){
            riverName = waterFallRepository.getRiverNameByName(waterFallName.toLowerCase());
            System.out.println("Name of the river that flows in ---"+waterFallName+"--- is -----"+riverName);
        }
        else{
            System.out.println("-------- please provide valid input -------");
        }
    }

    @Override
    public void validateAndGetAllWaterFalls() {
        System.out.println(" validateAndGetAllWaterFalls method invoked ............");
        List<WaterFall> waterFalls = new ArrayList<>();

        waterFalls = waterFallRepository.getAllWaterFalls();

        for (WaterFall waterFall : waterFalls){
            if(waterFall != null){
                System.out.println("WaterfallName : "+waterFall.getName()+" | "+
                        "River name : "+waterFall.getRiver_name()+" | "+
                        "Place : "+waterFall.getPlace()+" | "+
                        "State : "+waterFall.getState());
            }else{
                System.out.println("No waterfall is present in the table ------------");
            }
        }

    }

}
