package com.xworkz.conditioner.boot;

import com.xworkz.conditioner.repository.ConditionerRepository;
import com.xworkz.conditioner.repository.ConditionerRepositoryImpl;

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
