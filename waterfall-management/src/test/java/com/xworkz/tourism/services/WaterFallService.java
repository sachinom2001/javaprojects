package com.xworkz.tourism.services;

import com.xworkz.tourism.dto.WaterFall;

import java.util.List;

public interface WaterFallService {

    public void validationAndSaveWaterFall(WaterFall waterFall);

    public void validationAndSaveWaterFall(List<WaterFall> waterFalls);

    public void validateAndUpdateRiverByName(String waterFall,String riverName);

    public void validateAndDeleteWaterFallByName(String waterFallName);

    public void validateAndGetWaterFallByName(String waterFall);

    public void validateAndGetRiverNameByName(String waterFallName);

    void validateAndGetAllWaterFalls();
}
