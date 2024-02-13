package com.xworkz.specs.repository;

import com.xworkz.specs.entity.SpecsEntity;
import com.xworkz.util.EMFUtil;

import javax.persistence.*;
import java.util.List;

public class SpecsRepositoryImpl implements SpecsRepository{

    private EntityManagerFactory emf = EMFUtil.getEntitymangerfactory();

    @Override
    public Integer save(SpecsEntity entity) {
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
            System.err.println("PersistenceException in save method of SpecsEntity");
            et.commit();
        }
        finally {
            System.out.println("finally close the resources :");
            em.close();
        }
        return 0;
    }

    @Override
    public void deleteByName(String name) {
        System.out.println(" -------------------- ");
        EntityManager em = this.emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        try {
            System.out.println("starting ET :");
            et.begin();
            System.out.println("starting delete method :");

            Query deletedQuery = em.createNamedQuery("deleteByName");
            deletedQuery.setParameter("Name",name);
            deletedQuery.executeUpdate();
            System.out.println("data deleted successfully :");
            et.commit();
        }
        catch (PersistenceException pe){
            System.err.println("PersistenceException in deleteByName method of SpecsEntity :"+pe.getMessage());
            et.rollback();
        }
        finally {
            System.out.println("finally close the resources :");
            em.close();
        }
    }

    @Override
    public void updateColorByName(String existingName, String updateColor) {
        System.out.println(" ------------------ ");
        EntityManager em = this.emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        try {
            System.out.println("starting ET :");
            et.begin();
            System.out.println("starting update method :");

            Query updatedQuery = em.createNamedQuery("updateColorByName");
            updatedQuery.setParameter("Name",existingName);
            updatedQuery.setParameter("Color",updateColor);
            updatedQuery.executeUpdate();
            System.out.println("data updated successfully :");
            et.commit();
        }
        catch (PersistenceException pe){
            System.out.println("PersistenceException in updateColorByName method of SpecsEntity : "+ pe.getMessage());
            et.rollback();
        }
        finally {
            System.out.println("finally close the resources :");
            em.close();
        }
    }

    @Override
    public SpecsEntity findByLens(String lens) {
        System.out.println(" --------------------- ");
        EntityManager em = this.emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        try {
            System.out.println("starting ET :");
            et.begin();
            System.out.println("starting fetch method :");

            Query fetchQuery = em.createNamedQuery("findByLens");
            fetchQuery.setParameter("Lens",lens);
            SpecsEntity result = (SpecsEntity) fetchQuery.getSingleResult();
            System.out.println("data fetched successfully :");
            et.commit();
            return result;
        }
        catch (PersistenceException pe){
            System.err.println("PersistenceException in findByLens method of SpecsEntity :"+pe.getMessage());
            et.rollback();
        }
        finally {
            System.out.println("finally close the resources :");
            em.close();
        }
        return null;
    }

    @Override
    public List<SpecsEntity> findAll() {
        System.out.println(" -------------------- ");
        EntityManager em = this.emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        try {
            System.out.println("starting ET :");
            et.begin();
            System.out.println("starting fetch method :");

            Query fetchedQuery = em.createNamedQuery("findAll");
            List<SpecsEntity> list = fetchedQuery.getResultList();
            System.out.println("data fetched successfully :");
            et.commit();
            return list;
        }
        catch (PersistenceException pe){
            System.err.println("PersistenceException in findAll method of SpecsEntity : "+pe.getMessage());
            et.rollback();
        }
        finally {
            System.out.println("finally close the resources :");
            em.close();
        }
        return null;
    }

    @Override
    public List<String> findNameByAll() {
        System.out.println(" ------------------- ");
        EntityManager em = this.emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        try {
            System.out.println("starting ET :");
            et.begin();
            System.out.println("starting fetch method");

            Query fetchedQuery = em.createNamedQuery("findNameByAll");
            List<String> list = fetchedQuery.getResultList();
            System.out.println("data fetched successfully :");
            et.commit();
            return list;
        }
        catch (PersistenceException pe){
            System.err.println("PersistenceException in findNameByAll method of SpecsEntity : "+pe.getMessage());
            et.rollback();
        }
        finally {
            System.out.println("finally close the resources :");
            em.close();
        }
        return null;
    }

}
