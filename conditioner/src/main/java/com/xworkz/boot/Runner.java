package com.xworkz.boot;

import com.xworkz.entity.ConditionerEntity;
import com.xworkz.repository.ConditionerRepository;
import com.xworkz.repository.ConditionerRepositoryImpl;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
//        ConditionerEntity entity = new ConditionerEntity(
//                1,"Biolage","Liquid","All","Smoothening","196.0 millimetre",1,200.00);

        ConditionerRepository conditionerRepository = new ConditionerRepositoryImpl();
//        conditionerRepository.save(entity);

//        List<ConditionerEntity> list = new ArrayList<>();
//        list.add(new ConditionerEntity(2, "Herbal Essences", "Cream", "Curly hair", "Defines curls and reduces frizz", "250 ml", 15,250.00));
//        list.add(new ConditionerEntity(3, "Garnier Fructis", "Gel", "Oily hair", "Controls oil and adds volume", "200 ml", 8, 150.00));
//        conditionerRepository.saveList(list);

//        conditionerRepository.updateNetQuantityByBrand("Herbal Essences","350 ml");

//        conditionerRepository.updateNumberOfItemByBrand("Garnier Fructis",2);

//        conditionerRepository.findAllByBrand("Herbal Essences");

//        conditionerRepository.findAllByHairType("Oily hair");

//        conditionerRepository.findItemFormById(2);

//        conditionerRepository.getAllNetQuantity();

        conditionerRepository.getAllBrand();



    }
}
