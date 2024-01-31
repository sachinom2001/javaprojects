package com.xworkz.disease.boot;

import com.xworkz.disease.entity.DiseaseEntity;
import com.xworkz.disease.repository.DiseaseRepository;
import com.xworkz.disease.repository.DiseaseRepositoryImpl;

public class Runner {

    public static void main(String[] args) {

        DiseaseEntity disease = new DiseaseEntity(
                2,"Influenza","Fever, cough, sore throat","Antiviral medications","true");
        DiseaseRepository diseaseRepository = new DiseaseRepositoryImpl();
        diseaseRepository.save(disease);
    }
}
