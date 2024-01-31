package com.xworkz.january.boot;

import com.xworkz.january.entity.ToyEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAFetchRunner {

    public static void main(String[] args) {

        // data fetch from database ( crud - to 'read' the data )
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
        EntityManager em = emf.createEntityManager();
        System.out.println("EM :"+em);
        System.out.println("operation started :");

        ToyEntity entityFetch = em.find(ToyEntity.class,1);
        System.out.println("entity fetch from database = "+entityFetch);
        System.out.println("operation completed :");
        System.out.println("close EM,EMF");
        em.close();
        emf.close();


    }
}
