package com.xworkz.conditioner.repository;

import com.xworkz.conditioner.entity.ConditionerEntity;
import com.xworkz.util.EMFUtil;

import javax.persistence.*;
import java.util.List;

public class ConditionerRepositoryImpl implements ConditionerRepository{

    private EntityManagerFactory emf = EMFUtil.getEntitymangerfactory();

    @Override
    public Integer save(ConditionerEntity entity) {
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
            System.err.println("PersistenceException in save method of ConditionerEntity : "+pe.getMessage());
            et.rollback();
        }
        finally {
            System.out.println("finally close the resources :");
            em.close();
        }
        return null;
    }

    @Override
    public void saveList(List<ConditionerEntity> list) {
        System.out.println(" ------------------- ");
        EntityManager em = this.emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        try {
            System.out.println("starting ET : ");
            et.begin();
            System.out.println("starting persist : ");

            for (ConditionerEntity entity : list) {
                em.persist(entity);
            }
            System.out.println("persist done successfully :");
            et.commit();
        }
        catch (PersistenceException pe){
            System.err.println("PersistenceException in saveAll method in ConditionerEntity : "+ pe.getMessage());
            et.rollback();
        }
        finally {
            System.out.println("finally close the resources :");
            em.close();
        }
    }

    @Override
    public void updateNetQuantityByBrand(String existingBrnad, String updateNetQuantity) {
        System.out.println(" ------------------- ");
        EntityManager em = this.emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        try {
            System.out.println("starting ET :");
            et.begin();
            System.out.println("starting update method :");
            Query updatedQuery = em.createNamedQuery("updateNetQuantityByBrand");
            updatedQuery.setParameter("Brand",existingBrnad);
            updatedQuery.setParameter("NetQuantity",updateNetQuantity);
            updatedQuery.executeUpdate();
            System.out.println("data updated successfully :");
            et.commit();
        }
        catch (PersistenceException pe){
            System.err.println("PersistenceException in updateNetQuantityByBrand method in ConditionerEntity : "+ pe.getMessage());
            et.rollback();
        }
        finally {
            System.out.println("finally close the resources :");
            em.close();
        }


    }

    @Override
    public void updateNumberOfItemByBrand(String existingBrand, int updateNumberOfItem) {
        System.out.println(" --------------------- ");
        EntityManager em =this.emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        try {
            System.out.println("starting ET :");
            et.begin();
            System.out.println("starting update method :");

            Query updatedQuery = em.createNamedQuery("updateNumberOfItemByBrand");
            updatedQuery.setParameter("Brand",existingBrand);
            updatedQuery.setParameter("NumberOfItem",updateNumberOfItem);
            updatedQuery.executeUpdate();
            System.out.println("data updated successfully :");
            et.commit();
        }
        catch (PersistenceException pe){
            System.err.println("PersistenceException in updateNumberOfItemByBrand method of ConditionerEntity : "+ pe.getMessage());
            et.rollback();
        }
       finally {
            System.out.println("finally close the resources :");
            em.close();
        }
    }

    @Override
    public List<ConditionerEntity> findAllByBrand(String brand) {
        System.out.println(" -------------------- ");
        EntityManager em = this.emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        try {
            System.out.println("starting ET :");
            et.begin();
            System.out.println("starting fetch method :");

            Query fetchedQuery = em.createNamedQuery("findAllByBrand");
            fetchedQuery.setParameter("Brand",brand);
            List<ConditionerEntity> list = fetchedQuery.getResultList();
            for (ConditionerEntity entity: list ) {
                System.out.println(entity);
            }
            System.out.println("data fetched successfully :");
            et.commit();
        }
        catch (PersistenceException pe){
            System.err.println("PersistenceException in findAllByBrand method of ConditionerEntity : "+ pe.getMessage());
            et.rollback();
        }
        finally {
            System.out.println("finally close the resources :");
            em.close();
        }
        return null;
    }

    @Override
    public List<ConditionerEntity> findAllByHairType(String hairType) {
        System.out.println(" ------------------- ");
        EntityManager em = this.emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        try {
            System.out.println("starting ET :");
            et.begin();
            System.out.println("starting fetch methoid :");

            Query fetchedQuery = em.createNamedQuery("findAllByHairType");
            fetchedQuery.setParameter("HairType",hairType);
            List<ConditionerEntity> list = fetchedQuery.getResultList();
            for (ConditionerEntity entity : list) {
                System.out.println(entity);
            }
            System.out.println("data fetched successfully :");
            et.commit();
        }
        catch (PersistenceException pe){
            System.err.println("PersistenceException in findAllByHairType method of ConditionerEntity : "+ pe.getMessage());
        }
        finally {
            System.out.println("finally close the resources :");
            em.close();
        }
        return null;
    }

    @Override
    public String findItemFormById(int id) {
        System.out.println(" -------------------- ");
        EntityManager em = this.emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        try {
            System.out.println("starting ET :");
            et.begin();
            System.out.println("starting fetch method :");

            Query fetchedQuery = em.createNamedQuery("findItemFormById");
            fetchedQuery.setParameter("Id",id);
            String result = (String) fetchedQuery.getSingleResult();
            System.out.println("result = "+result);
            System.out.println("data fetched successfully :");
            et.commit();
        }
        catch (PersistenceException pe){
            System.err.println("PersistenceException in findItemFormById of ConditionerEntity : "+ pe.getMessage());
            et.rollback();
        }
        finally {
            System.out.println("finally close the resources :");
            em.close();
        }
        return null;
    }

    @Override
    public List<String> getAllNetQuantity() {
        System.out.println(" -------------------- ");
        EntityManager em = this.emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        try {
            System.out.println("starting ET :");
            et.begin();
            System.out.println("starting get method :");

            Query fetchedQuery = em.createNamedQuery("getAllNetQuantity");
            List<String> list = fetchedQuery.getResultList();
            for (String result : list ) {
                System.out.println("result = "+result);
            }
            System.out.println("data fetched successfully : ");
            et.commit();
        }
        catch (PersistenceException pe){
            System.err.println("PersistenceException in getAllNetQuantity method of ConditionerEntity : "+ pe.getMessage());
            et.rollback();
        }
        finally {
            System.out.println("finally close the resources :");
            em.close();
        }
        return null;
    }

    @Override
    public List<String> getAllBrand() {
        System.out.println(" ------------------ ");
        EntityManager em = this.emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        try {
            System.out.println("starting ET :");
            et.begin();
            System.out.println("starting get method :");

            Query fetchedQuery = em.createNamedQuery("getAllBrand");
            List<String> list = fetchedQuery.getResultList();
            for (String result : list ) {
                System.out.println("result = "+result);
            }
            System.out.println("data fetched successfully : ");
            et.commit();
        }
        catch (PersistenceException pe){
            System.err.println("PersistenceException in getAllNetQuantity method of ConditionerEntity : "+ pe.getMessage());
            et.rollback();
        }
        finally {
            System.out.println("finally close the resources :");
            em.close();
        }
        return null;
    }
}
