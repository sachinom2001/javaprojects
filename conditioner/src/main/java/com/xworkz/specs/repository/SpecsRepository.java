package com.xworkz.specs.repository;

import com.xworkz.specs.entity.SpecsEntity;

import java.util.List;

public interface SpecsRepository {

    Integer save(SpecsEntity entity);

    void deleteByName(String name);

    void updateColorByName(String existingName,String updateColor);

    SpecsEntity findByLens(String lens);

    List<SpecsEntity> findAll();

    List<String> findNameByAll();



}
