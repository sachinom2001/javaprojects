package com.xworkz.temple.boot;

import com.xworkz.temple.entity.TempleEntity;
import com.xworkz.temple.repository.TempleRepository;
import com.xworkz.temple.repository.TempleRepositoryImpl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
//        TempleEntity temple = new TempleEntity(
//                1,"Ram mandir","Ayodhya",50,120,LocalDate.of(2024,01,22),"Sri Ram",3);

//        List<TempleEntity> list = new ArrayList<>();
//        list.add(new TempleEntity(2,"Sri Kshetra Dharmasthala","Dharmasthala",50,100,LocalDate.of(1970,01,25),"Lord Shiva",4));
//        list.add(new TempleEntity(3,"Kukke Shree Subrahmanya","Kukke Subrahmanya",50,100,LocalDate.of(1972,01,25)," Subrahmanya",4));


        TempleRepository templeRepository = new TempleRepositoryImpl();
//        templeRepository.save(temple);

//        templeRepository.saveAll(list);

//        templeRepository.findAllByLocation("Dharmastala");

//        templeRepository.findAllByEntryFeeGreaterThan(30);

//        templeRepository.findAllByEntryFeeBetween(50,120);

//        templeRepository.findAllByInaguratedDateGreaterThan(LocalDate.of(1970,01,25));

//        templeRepository.findAllByMainGodAndLocation("Lord Shiva","Dharmastala");

//        templeRepository.findById(2);

//        templeRepository.findByIdAndMainGod(3," Subrahmanya");

//        templeRepository.findTotal();

//        templeRepository.findTempleByMexEntryFee();

//        templeRepository.updateLocationByName("Ram mandir","Uttar Pradesh,Ayodhya");

//        templeRepository.updateEntryFeeByName("Ram mandir",80);

//        templeRepository.updateLocationAndDimensionById(2,"Dharmasthala,Karnataka",6);

//        templeRepository.deleteByName("Ram mandir");
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        templeRepository.updateAllVipEntry(200,list);


    }

}
