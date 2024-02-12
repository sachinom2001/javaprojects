package com.xworkz.tourism.repository;

import com.xworkz.tourism.dto.WaterFall;

import java.util.List;

public interface WaterFallRepository {

    public void saveWaterFall(WaterFall waterFall);

    public void saveWaterFall(List<WaterFall> waterFalls);

    public void updateRiverByName(String existingWaterfallName , String updatedRiverName);

    public boolean deleteWaterFallByName(String waterFallName);

    public WaterFall getWaterFallByName(String waterFallName);

    List<WaterFall> getAllWaterFalls();

    public String getRiverNameByName(String waterFallName);


}
