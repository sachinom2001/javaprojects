package com.xworkz.temple.repository;

import com.xworkz.temple.entity.TempleEntity;
import com.xworkz.temple.util.EMFUtil;

import javax.persistence.*;
import javax.xml.stream.Location;
import java.time.LocalDate;
import java.util.List;

public class TempleRepositoryImpl implements TempleRepository{
    private EntityManagerFactory emf = EMFUtil.getManagerFactory();

    @Override
    public Integer save(TempleEntity entity) {
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
            System.err.println("PersistenceException in save method of TempleEntity : "+ pe.getMessage());
            et.rollback();
        }
        finally {
            System.out.println("finally close the resources :");
            em.close();
        }
        return null;
    }

    @Override
    public void saveAll(List<TempleEntity> entities) {
        System.out.println(" -------------------- ");
        System.out.println(" save All method started : ");
        EntityManager em = this.emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        try {
            System.out.println("starting ET :");
            et.begin();
            System.out.println("starting persist :");
            for (TempleEntity entity : entities) {
                em.persist(entity);
            }
            System.out.println("persist successfully ;");
            et.commit();
        }
        catch (PersistenceException pe){
            System.err.println("PersistenceException in saveAll method of TempleEntity :" + pe.getMessage());
            et.rollback();
        }
        finally {
            System.out.println("finally close the resources : ");
            em.close();
        }

    }

    @Override
    public void findAllByLocation(String location) {
        System.out.println(" -------------------- ");
        EntityManager em = this.emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        try{
            System.out.println("starting ET :");
            et.begin();
            System.out.println("fetch method started :");
            Query fetchedQuery = em.createNamedQuery("findAllByLocation");
            fetchedQuery.setParameter("place",location);
            List<TempleEntity> list = fetchedQuery.getResultList();
            for (TempleEntity obj : list) {
                System.out.println(obj);
            }
            System.out.println("data fetched successfully :");
            et.commit();
        }
        catch (PersistenceException pe){
            System.err.println("PersistenceException in findAllLocation method of TempleEntity : "+ pe.getMessage());
            et.rollback();
        }
        finally {
            System.out.println("finally close the resources :");
            em.close();
        }
    }

    @Override
    public void findAllByEntryFeeGreaterThan(int entryFee) {
        System.out.println(" --------------------- ");
        EntityManager em = this.emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        try {
            System.out.println("starting ET : ");
            et.begin();
            System.out.println("fetch method started :");
            Query fetchedQuery = em.createNamedQuery("findAllByEntryFeeGreaterThan");
            fetchedQuery.setParameter("EntryFee",entryFee);
            List<TempleEntity> list = fetchedQuery.getResultList();
//            for ( TempleEntity obj : list ) {
//                System.out.println(list);
//            }
            list.forEach(c-> System.out.println(c));
            System.out.println("data fetched successfully : ");
            et.commit();
        }
        catch (PersistenceException pe ){
            System.err.println("PersistenceException in findAllByEntryFeeGreaterThan method of TempleEntity :"+ pe.getMessage());
            et.rollback();
        }
        finally {
            System.out.println("finally close the resources :");
            em.close();
        }
    }

    @Override
    public void findAllByEntryFeeBetween(int startFee, int endFee) {
        System.out.println(" --------------------- ");
        EntityManager em = this.emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        try {
            System.out.println("starting ET :");
            et.begin();
            System.out.println("fetch method started :");
            Query fetchQuery = em.createNamedQuery("findAllByEntryFeeBetween");
            fetchQuery.setParameter("startFee",startFee);
            fetchQuery.setParameter("endFee",endFee);
            List<TempleEntity> list = fetchQuery.getResultList();
            list.forEach(c -> System.out.println(c));
            System.out.println("data fetched successfully :");
            et.commit();
        }
        catch (PersistenceException pe){
            System.err.println("PersistenceException in findAllByEntryFeeBetween method of TempleEntity : "+pe.getMessage());
            et.rollback();
        }
        finally {
            System.out.println("finally close the resources :");
            em.close();
        }




    }

    @Override
    public void findAllByInaguratedDateGreaterThan(LocalDate inaguratedDate) {
        System.out.println(" -------------------- ");
        EntityManager em = this.emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        try {
            System.out.println("started ET :");
            et.begin();
            System.out.println("fetched method started :");
            Query fetchedQuery = em.createNamedQuery("findAllByInaguratedDateGreaterThan");
            fetchedQuery.setParameter("InaguratedDate",inaguratedDate);
            List<TempleEntity> list = fetchedQuery.getResultList();
            list.forEach(c -> System.out.println(c));
            System.out.println("data fetched successfully :");
            et.commit();
        }
        catch (PersistenceException pe ){
            System.err.println("PersistenceException in findAllByInaguratedDateGreaterThan method of TempleEntity : "+ pe.getMessage());
            et.rollback();
        }
        finally {
            System.out.println("finally close the resources :");
            em.close();
        }

    }

    @Override
    public void findAllByMainGodAndLocation(String mainGod, String location) {
        System.out.println(" --------------------- ");
        EntityManager em = this.emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        try {
            System.out.println("started ET :");
            et.begin();
            System.out.println("fetched method started");
            Query fetchedQuery= em.createNamedQuery("findAllByMainGodAndLocation");
            fetchedQuery.setParameter("MainGod",mainGod);
            fetchedQuery.setParameter("Location",location);
            List<TempleEntity> list = fetchedQuery.getResultList();
            list.forEach(c -> System.out.println(c));
            System.out.println("data fetched successfully : ");
            et.commit();
        }
        catch (PersistenceException pe ){
            System.err.println("PersistenceException in findAllByMainGodAndLocation method of TempleEntity : "+pe.getMessage());
            et.rollback();
        }
        finally {
            System.out.println("finally close the resources :");
            em.close();
        }
    }

    @Override
    public TempleEntity findById(int id) {
        System.out.println(" -------------------- ");
        EntityManager em = this.emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        try {
            System.out.println("started ET :");
            et.begin();
            System.out.println("fetched method started :");
            Query fetchedQuery = em.createNamedQuery("findById");
            fetchedQuery.setParameter("templeId",id);
            TempleEntity isPresent = (TempleEntity) fetchedQuery.getSingleResult();
            System.out.println(isPresent);
            System.out.println("data fetched successfully :");
            et.commit();
            return isPresent;
        }
        catch (PersistenceException pe){
            System.err.println("PersistenceException in findById method of TempleEntity : "+ pe.getMessage());
            et.rollback();
        }
        finally {
            System.out.println("finally close the resources :");
            em.close();
        }
        return null;
    }

    @Override
    public TempleEntity findByIdAndMainGod(int id, String mainGod) {
        System.out.println(" ------------------- ");
        EntityManager em =this.emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        try {
            System.out.println("started ET :");
            et.begin();
            System.out.println("fetched method started :");
            Query fetchedQuery = em.createNamedQuery("findByIdAndMainGod");
            fetchedQuery.setParameter("TempleId",id);
            fetchedQuery.setParameter("MainGod",mainGod);
            TempleEntity isPresent = (TempleEntity) fetchedQuery.getSingleResult();
            System.out.println(isPresent);
            System.out.println("data fetched successfully :");
            et.commit();
            return isPresent;
        }
        catch (PersistenceException pe){
            System.err.println("PersistenceException in findByIdAndMainGod method of TempleEntity : "+pe.getMessage());
            et.rollback();
        }
        finally {
            System.out.println("finally close the resources :");
            em.close();
        }
        return null;
    }

    @Override
    public long findTotal() {
        System.out.println(" ------------------- ");
        EntityManager em = this.emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        try {
            System.out.println("started ET :");
            et.begin();
            System.out.println("fetched method started :");
            Query fetchedQuery = em.createNamedQuery("findTotal");
            long isCount= (long) fetchedQuery.getSingleResult();
            System.out.println("total data = "+isCount);
            System.out.println("data fetched successfully :");
            et.commit();
            return isCount;
        }
        catch (PersistenceException pe){
            System.err.println("PersistenceException in findTotal method of TempleEntity : "+pe.getMessage());
            et.rollback();
        }
        finally {
            System.out.println("finally close the resources :");
            em.close();
        }
        return 0;
    }

    @Override
    public TempleEntity findTempleByMexEntryFee() {
        System.out.println(" -------------------- ");
        EntityManager em = this.emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        try {
            System.out.println("started ET :");
            et.begin();
            System.out.println("fetched method started :");
            Query fetchedQuery = em.createNamedQuery("findTempleByMexEntryFee");
            Object isPresent = fetchedQuery.getSingleResult();
            System.out.println("data fetched successfully = "+isPresent);
            et.commit();
        }
        catch (PersistenceException pe){
            System.err.println("PersistenceException in findTempleByMexEntryFee method of TempleEntity : "+ pe.getMessage());
            et.rollback();
        }
        finally {
            System.out.println("finally close the resources :");
            em.close();
        }
        return null;
    }

    @Override
    public void updateLocationByName(String existingName, String updateLocation) {
        System.out.println(" --------------------- ");
        EntityManager em = this.emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        try {
            System.out.println("started ET :");
            et.begin();
            System.out.println("update method started :");
            Query updatedQuery = em.createNamedQuery("updateLocationByName");
            updatedQuery.setParameter("Name",existingName);
            updatedQuery.setParameter("Location", updateLocation);
            updatedQuery.executeUpdate();
            System.out.println("data updated successfully :");
            et.commit();
        }
        catch (PersistenceException pe){
            System.err.println("PersistenceException in updateLocationByName method of TempleEntity : "+pe.getMessage());
            et.rollback();
        }
        finally {
            System.out.println("finally close the resources :");
            em.close();
        }
    }

    @Override
    public void updateEntryFeeByName(String existingName, int updateEntryFee) {
        System.out.println(" --------------------- ");
        EntityManager em =this.emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        try {
            System.out.println("started ET :");
            et.begin();
            System.out.println("update method started :");
            Query updatedQuery = em.createNamedQuery("updateEntryFeeByName");
            updatedQuery.setParameter("Name",existingName);
            updatedQuery.setParameter("EntryFee",updateEntryFee);
            updatedQuery.executeUpdate();
            System.out.println("data updated successfully :");
            et.commit();
        }
        catch (PersistenceException pe){
            System.err.println("PersistenceException in updateEntryFeeByName method of TempleEntity : "+ pe.getMessage());
            et.rollback();
        }
        finally {
            System.out.println("finally close the resources :");
            em.close();
        }
    }

    @Override
    public void updateLocationAndDimensionById(int existingId, String updateLocation, int updateDimensionInAcre) {
        System.out.println(" -------------------- ");
        EntityManager em = this.emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        try {
            System.out.println("started ET :");
            et.begin();
            System.out.println("update method started :");
            Query updatedQuery = em.createNamedQuery("updateLocationAndDimensionById");
            updatedQuery.setParameter("Id",existingId);
            updatedQuery.setParameter("Location",updateLocation);
            updatedQuery.setParameter("Dimension",updateDimensionInAcre);
            updatedQuery.executeUpdate();
            System.out.println("data updated successfully :");
            et.commit();
        }
        catch (PersistenceException pe){
            System.err.println("PersistenceException in updateLocationAndDimensionById method of TempleEntity :"+ pe.getMessage());
            et.rollback();
        }finally {
            System.out.println("finally close the resources :");
            em.close();
        }
    }

    @Override
    public void updateAllVipEntry(int updateVipEntry, List<Integer> ids) {
        System.out.println(" -------------------- ");
        EntityManager em = this.emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        try {
            System.out.println("started ET :");
            et.begin();
            System.out.println("update method started :");
            Query updatedQuery = em.createNamedQuery("updateAllVipEntry");
            updatedQuery.setParameter("VipEntry",updateVipEntry);
            for (Integer id:ids ) {
                updatedQuery.setParameter("Id",id);
                updatedQuery.executeUpdate();
            }
            System.out.println("data updated successfully :");
            et.commit();
        }
        catch (PersistenceException pe){
            System.err.println("PersistenceException in updateAllVipEntry of TempleEntity : "+ pe.getMessage());
            et.rollback();
        }
        finally {
            System.out.println("finally close the resources :");
            em.close();
        }
    }

    @Override
    public void deleteByName(String name) {
        System.out.println(" --------------------- ");
        EntityManager em = this.emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        try {
            System.out.println("started ET :");
            et.begin();
            System.out.println("delete method started :");
            Query deletedQuery = em.createNamedQuery("deleteByName");
            deletedQuery.setParameter("Name",name);
            deletedQuery.executeUpdate();
            System.out.println("data deleted successfully :");
            et.commit();
        }
        catch (PersistenceException pe){
            System.out.println("PersistenceException in deleteByName of templeEntity :"+ pe.getMessage());
            et.rollback();
        }
        finally {
            System.out.println("finally close the resources :");
            em.close();
        }

    }
}
