package com.xworkz.january.boot;

import com.xworkz.january.entity.*;

import javax.persistence.*;

public class JPARunner1 {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
        EntityManager em = emf.createEntityManager();
        System.out.println("Em :"+em);
        EntityTransaction et = em.getTransaction();
        System.out.println("ET :"+et);
        et.begin();
        System.out.println("ET begin :");
        System.out.println("operation started :");

        SportsEntity sportsEntity = new SportsEntity(
                1,"Cricket", "16th century",11,"England");
        em.persist(sportsEntity);
        System.out.println("operation completed :");
        et.commit();
        System.out.println("ET commit :");
        System.out.println("close EM,EMF");
        em.close();
        emf.close();

//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
//        EntityManager em = emf.createEntityManager();
//        System.out.println("EM :"+em);
//        EntityTransaction et = em.getTransaction();
//        System.out.println("ET :"+et);
//        et.begin();
//        System.out.println("ET begin :");
//        System.out.println("operation started :");
//
//        TransportEntity transportEntity = new TransportEntity(
//                1,"Land","Toyota Corolla","Toyota Motors","California");
//        em.persist(transportEntity);
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
//        System.out.println("Et begin :");
//        System.out.println("operation started :");
//
//        ActorEntity actorEntity = new ActorEntity(
//                1,"Sudeepa Sanjeev","Shivamogga","Abhinaya Chakravarty","kotigobba 2");
//        em.persist(actorEntity);
//        System.out.println("operation completed :");
//        et.commit();
//        System.out.println("Et commit :");
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
//        FestivalEntity festivalEntity = new FestivalEntity(
//                1,"Dasara","Mysore","Chamundeshwari","Hindu");
//        em.persist(festivalEntity);
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
//        OceanEntity oceanEntity = new OceanEntity(
//                1, "Indian Ocean", 12066, 70560000, "Mumbai, Singapore");
//        em.persist(oceanEntity);
//        System.out.println("operation completed :");
//        et.commit();
//        System.out.println("ET commit :");
//        System.out.println("close EM,EMF :");
//        em.close();
//        emf.close();
    }
}
