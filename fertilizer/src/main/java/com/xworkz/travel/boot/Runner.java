package com.xworkz.travel.boot;

import com.xworkz.travel.entity.TravelEntity;
import com.xworkz.travel.repository.TravelRepository;
import com.xworkz.travel.repository.TravelRepositoryImpl;

public class Runner {

    public static void main(String[] args) {
        TravelEntity travelEntity = new TravelEntity(
                2,"Davangere","Shivamogga",100,95,"03:00:00","Bus","2024-01-20","2024-01-25"
        );
        TravelRepository travelRepository = new TravelRepositoryImpl();
        travelRepository.save(travelEntity);
    }
}
