package com.xworkz.january.boot;

import com.xworkz.january.entity.SuperHeroEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JPADeleteRunner {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
        EntityManager em = emf.createEntityManager();
        System.out.println("EM :"+em);
        EntityTransaction et = em.getTransaction();
        et.begin();
        System.out.println("ET begin :");
        System.out.println("operation started :");

        SuperHeroEntity superHeroEntity = em.find(SuperHeroEntity.class,2);
        if (superHeroEntity != null){
            em.remove(superHeroEntity);
            System.out.println("Data deleted successfully :");
        }
        else {
            System.out.println(" please enter correct input which is available");
        }
        et.commit();
        System.out.println("Et commit :");
        System.out.println("close EM,EMF");
        em.close();
        emf.close();

    }
}
