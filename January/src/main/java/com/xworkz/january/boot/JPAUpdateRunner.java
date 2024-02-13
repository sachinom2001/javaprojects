package com.xworkz.january.boot;

import com.xworkz.january.entity.SuperHeroEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JPAUpdateRunner {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
        EntityManager em = emf.createEntityManager();
        System.out.println("EM :"+em);
        EntityTransaction et = em.getTransaction();
        et.begin();
        System.out.println("ET begin :");
        System.out.println("operation started :");

        SuperHeroEntity superHeroEntity = em.find(SuperHeroEntity.class,3);
        if (superHeroEntity != null){
            superHeroEntity.setFictionalName("Dom");
            em.merge(superHeroEntity);
            System.out.println("Data updated successfully :");
        }
        else {
            System.out.println(" please enter correct input :");
        }
        System.out.println("operation completed :");
        et.commit();
        System.out.println("ET commit :");
        System.out.println("close EM,EMF");
        em.close();
        emf.close();
    }
}
