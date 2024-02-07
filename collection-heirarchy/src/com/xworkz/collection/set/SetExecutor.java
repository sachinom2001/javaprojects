package com.xworkz.collection.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExecutor {

    public static void main(String[] args) {

        Set set1 = new TreeSet();
        set1.add(new Employer(1,"Bharat","ASE","bharath@gmail.com",872345124));
        set1.add(new Employer(3,"Shekar","SDE","bharath@gmail.com",872345124));
        set1.add(new Employer(5,"Chetan","SDE","bharath@gmail.com",872345124));
        set1.add(new Employer(2,"Rohith","ATE","bharath@gmail.com",872345124));
        set1.add(new Employer(4,"Santosh","ASE","bharath@gmail.com",872345124));

        for (Object obj:set1){
            System.out.println(obj);
        }
        System.out.println();

        System.out.println(" -------------- ");
        Set set = new HashSet();
        set.add(new Employer(1,"Bharat","ASE","bharath@gmail.com",879935213));
        set.add(new Employer(2,"Shekar","SDE","shekar@gmail.com",872516342));
        set.add(new Employer(3,"Chetan","ASE","chetan@gmail.com",879784113));
        set.add(new Employer(4,"Rohith","SDE","rohithh@gmail.com",879653745));
        set.add(new Employer(5,"Santosh","SDE","santosh@gmail.com",879875262));

        for (Object obj:set){
            System.out.println(obj);
        }
        System.out.println();

        System.out.println(" -------------- ");
        Set set2 = new LinkedHashSet();
        set2.add(new Employer(4,"Bharath","ASE","bharath@gmail.com",879463541));
        set2.add(new Employer(5,"Shekar","ASE","bharath@gmail.com",879463541));
        set2.add(new Employer(2,"Rohith","ASE","bharath@gmail.com",879463541));
        set2.add(new Employer(1,"Santosh","ASE","bharath@gmail.com",879463541));
        set2.add(new Employer(3,"Ashok","ASE","bharath@gmail.com",879463541));

        for (Object obj:set2){
            System.out.println(obj);
        }

    }
}
