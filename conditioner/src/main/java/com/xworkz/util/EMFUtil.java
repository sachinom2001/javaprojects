package com.xworkz.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMFUtil {
    private static EntityManagerFactory mangerfactory ;

    public static EntityManagerFactory getEntitymangerfactory() {
        return mangerfactory;
    }

    static {
        System.out.println("initial by static method :");
        mangerfactory = Persistence.createEntityManagerFactory("x-workz");
        System.out.println("After creating EMF with EMFUtil :");
    }

}
