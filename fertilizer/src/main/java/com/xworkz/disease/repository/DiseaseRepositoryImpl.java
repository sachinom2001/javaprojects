package com.xworkz.disease.repository;

import com.xworkz.disease.entity.DiseaseEntity;

import javax.persistence.*;

public class DiseaseRepositoryImpl implements DiseaseRepository{

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");

    @Override
    public Integer save(DiseaseEntity entity) {
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
            System.err.println("PersistenceException in save method of DiseaseEntity : "+ pe.getMessage());
            et.rollback();
        }
        finally {
            System.out.println("finally closing the resources :");
            em.close();
        }
        return null;
    }
}
