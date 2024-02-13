package com.xworkz.temple.repository;

import com.xworkz.temple.entity.TempleEntity;

import java.time.LocalDate;
import java.util.List;

public interface TempleRepository {

    Integer save(TempleEntity entity);

    void saveAll(List<TempleEntity> entities);

    void findAllByLocation(String location);

    void findAllByEntryFeeGreaterThan(int entryFee);

    void findAllByEntryFeeBetween(int startFee,int endFee);

    void findAllByInaguratedDateGreaterThan(LocalDate inaguratedDate);

    void findAllByMainGodAndLocation(String mainGod,String location);

    TempleEntity findById(int id);

    TempleEntity findByIdAndMainGod(int id, String mainGod);

    long findTotal();

    TempleEntity findTempleByMexEntryFee();

    void updateLocationByName(String existingName,String updateLocation);

    void updateEntryFeeByName(String existingName,int updateEntryFee);

    void updateLocationAndDimensionById(int existingId,String updateLocation,int updateDimensionInAcre);

    void updateAllVipEntry(int updateVipEntry,List<Integer> ids);

    void deleteByName(String name);


}
