package com.xworkz.fertilizer.repository;

import com.xworkz.fertilizer.entity.FertilizerEntity;
import com.xworkz.fertilizer.repository.FertilizerRepository;

import javax.persistence.*;

public class FertilizerRepositoryImpl implements FertilizerRepository {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");

    @Override
    public Integer save(FertilizerEntity entity) {

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
            System.err.println("PersistenceException in save method of Fertilizer : "+ pe.getMessage());
            et.rollback();
        }
        finally {
            System.out.println("finally closing the resources :");
            em.close();
        }
        return null;
    }
}
