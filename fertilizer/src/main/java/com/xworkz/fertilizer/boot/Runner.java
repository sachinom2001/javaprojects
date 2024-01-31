package com.xworkz.fertilizer.boot;

import com.xworkz.fertilizer.entity.FertilizerEntity;
import com.xworkz.fertilizer.repository.FertilizerRepository;
import com.xworkz.fertilizer.repository.FertilizerRepositoryImpl;

public class Runner {

    public static void main(String[] args) {
        FertilizerEntity fertilizerEntity = new FertilizerEntity(
                2,"GreenBoost Max","FarmFresh",10,15.00,"2023-05-10","2024-05-10");
        FertilizerRepository fertilizerRepository = new FertilizerRepositoryImpl();
        fertilizerRepository.save(fertilizerEntity);
    }
}
