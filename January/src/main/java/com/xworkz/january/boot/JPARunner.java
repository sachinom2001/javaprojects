package com.xworkz.january.boot;

import com.xworkz.january.entity.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JPARunner {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
        EntityManager em = emf.createEntityManager();
        System.out.println("EM :"+em);
        EntityTransaction et = em.getTransaction();
        System.out.println("Et :"+et);
        et.begin();
        System.out.println("ET begin");

        System.out.println("started operation :");
        SuperHeroEntity superHeroEntity = new SuperHeroEntity
                (2,"Yash","Rocky Bhai","Gold","India","Mother");
        em.persist(superHeroEntity);
        System.out.println("operation completed :");
        et.commit();
        System.out.println("ET commit :");
        System.out.println("clos EM,EMF");
        em.close();
        emf.close();


//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
//        EntityManager em = emf.createEntityManager();
//        System.out.println("EM :"+em);
//        EntityTransaction et = em.getTransaction();
//        System.out.println("ET :"+et);
//        et.begin();
//        System.out.println("ET begin :");
//
//        System.out.println("operation started :");
//        FilmEntity filmEntity = new FilmEntity(2,"Salaar","Telugu","Prabhas","Prashant Neel");
//        em.persist(filmEntity);
//        System.out.println("operation completed :");
//        et.commit();
//        System.out.println("ET commit :");
//        System.out.println("close EM,EMF");
//        em.close();
//        emf.close();


//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
//        EntityManager em = emf.createEntityManager();
//        System.out.println("Em :"+em);
//        EntityTransaction et = em.getTransaction();
//        System.out.println("ET :"+et);
//        et.begin();
//        System.out.println("ET begin :");
//        System.out.println("operation started :");
//
//        TrafficEntity trafficEntity = new TrafficEntity(
//                 1,"Bashyam circle","Rajaji nagar","Bangalore",80);
//        em.persist(trafficEntity);
//        System.out.println("operation completed :");
//        et.commit();
//        System.out.println("ET commit :");
//        System.out.println("close EM,EMF");
//        em.close();
//        emf.close();

//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
//        EntityManager em = emf.createEntityManager();
//        System.out.println("EM :"+em);
//        EntityTransaction et = em.getTransaction();
//        System.out.println("ET :"+et);
//        et.begin();
//        System.out.println("ET begin :");
//        System.out.println("operation started :");
//
//        ResumeEntity resumeEntity = new ResumeEntity(
//                1,"Sachin","Bachelor of Engineering","UBDTCE",2023);
//        em.persist(resumeEntity);
//        System.out.println("operation completed :");
//        et.commit();
//        System.out.println("ET commit :");
//        System.out.println("close EM,EMF");
//        em.close();
//        emf.close();


//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
//        EntityManager em = emf.createEntityManager();
//        System.out.println("EM :"+em);
//        EntityTransaction et = em.getTransaction();
//        System.out.println("ET :"+et);
//        et.begin();
//        System.out.println("ET begin :");
//        System.out.println("operation started :");
//
//        ShopEntity shopEntity = new ShopEntity(
//                1,"Manjunath Provisional Store","Nitish","Provisional store","5 main road ," +
//                " Agrahara Dasarahalli");
//        em.persist(shopEntity);
//        System.out.println("operation completed :");
//        et.commit();
//        System.out.println("ET commit :");
//        System.out.println("close EM,EMF");
//        em.close();
//        emf.close();

    }
}
