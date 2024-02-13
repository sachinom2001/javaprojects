package com.xworkz.email.repository;

import com.xworkz.email.entity.EmailEntity;

import javax.persistence.*;

public class EmailRepositoryImpl implements EmailRepository{

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");

    @Override
    public Integer save(EmailEntity entity) {
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
            System.err.println("PersistenceException in save method of EmailEntity :"+ pe.getMessage());
        }

        finally {
            System.out.println("finally close the resources :");
            em.close();
        }
        return null;
    }
}
