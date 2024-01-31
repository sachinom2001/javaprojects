package com.xworkz.travel.repository;

import com.xworkz.travel.entity.TravelEntity;

import javax.persistence.*;

public class TravelRepositoryImpl implements TravelRepository{

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");

    @Override
    public Integer save(TravelEntity entity) {
        EntityManager em = this.emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        try {
            System.out.println("starting ET :");
            et.begin();
            System.out.println("starting persist :");
            em.persist(entity);
            System.out.println("persist done successfully :");
            et.commit();
            return entity.getId();
        }
        catch (PersistenceException pe){
            System.err.println("PersistenceException in save method of TravelEntity : "+ pe.getMessage());
            et.rollback();
        }
        finally {
            System.out.println("finally close the resources :");
            em.close();
        }
        return null;
    }
}
