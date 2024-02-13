package com.xworkz.temple.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMFUtil{

    // singleton
    private static EntityManagerFactory managerFactory;      //to initial we have 4 ways - constructor,literals,setter,ref
    public static EntityManagerFactory getManagerFactory() {
        return managerFactory;
    }

    static {
        System.out.println("initial by static method ");
        managerFactory = Persistence.createEntityManagerFactory("x-workz");
        System.out.println("After creating EMF with EMFUtil :");
    }

}
