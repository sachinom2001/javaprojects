package com.xworkz.repository;

import com.xworkz.entity.ConditionerEntity;

import java.util.List;

public interface ConditionerRepository {

    Integer save(ConditionerEntity entity);

    void saveList(List<ConditionerEntity> list);

    void updateNetQuantityByBrand(String existingBrnad,String updateNetQuantity);

    void updateNumberOfItemByBrand(String existingBrand,int updateNumberOfItem);

    List<ConditionerEntity> findAllByBrand(String brand);

    List<ConditionerEntity> findAllByHairType(String hairType);

    String findItemFormById(int id);

    List<String> getAllNetQuantity();

    List<String> getAllBrand();




}
