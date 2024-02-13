package com.xworkz.specs.boot;

import com.xworkz.specs.entity.SpecsEntity;
import com.xworkz.specs.repository.SpecsRepository;
import com.xworkz.specs.repository.SpecsRepositoryImpl;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        SpecsEntity entity = new SpecsEntity("Burberry","Concave","black");
        SpecsEntity entity1=new SpecsEntity("Polo","Convex","Red");
        SpecsEntity entity2 = new SpecsEntity("Converse","Cylindrical","green");

        SpecsRepository specsRepository = new SpecsRepositoryImpl();
//        specsRepository.save(entity);
//        specsRepository.save(entity1);
//        specsRepository.save(entity2);

//        specsRepository.deleteByName("Converse");
//
//        specsRepository.updateColorByName("Polo","orange");

        System.out.println(specsRepository.findByLens("Concave"));

//        specsRepository.findAll().forEach(c -> System.out.println(c));
//
//        specsRepository.findNameByAll().forEach(c -> System.out.println(c));




    }
}
