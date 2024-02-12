package com.xworkz.tourism;

import com.xworkz.tourism.dto.WaterFall;
import com.xworkz.tourism.repository.WaterFallRepository;

import com.xworkz.tourism.services.WaterFallService;
import com.xworkz.tourism.services.WaterFallServiceimpl;

import java.util.ArrayList;
import java.util.List;

public class WaterFallRunner {

    public static void main(String[] args) {

//        WaterFallRepository waterFallRepository = new WaterFallRepositoryimpl();

//        WaterFall waterFall = new WaterFall("Shivanasamudra falls","Mandya","Kaveri", "Karnataka");
//        waterFallRepository.saveWaterFall(waterFall);

//        WaterFall waterFall1 = new WaterFall("Abbey falls","Madikeri","Kaveri","Karnataka");
//        waterFallService.validationAndSaveWaterFall(waterFall1);

        WaterFallService waterFallService = new WaterFallServiceimpl();

//        List<WaterFall> waterFalls = new ArrayList<>();
//        waterFalls.add(waterFall);
//        waterFalls.add(waterFall1);
//        waterFalls.add(waterFall2);
//        waterFallService.validationAndSaveWaterFall(waterFalls);

        waterFallService.validateAndUpdateRiverByName("Shivanasamudra falls","Kaveri");

        waterFallService.validateAndDeleteWaterFallByName("Abbey Falls");

        waterFallService.validateAndGetWaterFallByName("Jog falls ");

        waterFallService.validateAndGetRiverNameByName("Abbey falls");

        waterFallService.validateAndGetAllWaterFalls();


    }
}
