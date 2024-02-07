package com.xworkz.collection.list;

import java.util.*;

public class ListExecutor {

    public static void main(String[] args) {
//        List list = new ArrayList();
//        list.add(new Student(01,"Sachin","4th-year","ME","Shimoga"));
//        list.add(new Student(03,"Gagan","4th-year","CSE","Davangere"));
//        list.add(new Student(02,"Manoj","4th-year","EI","Hospete"));
//        list.add(new Student(05,"Amruth","4th-year","CSE","Davangere"));
//        list.add(new Student(04,"Nitish","4th-year","CSE","Davangwre"));

//        for (Object obj:list){
//            System.out.println(obj);
//        }

        LinkedList linkedList = new LinkedList();
        linkedList.add(new Student(01,"Ramesh","3rd-year","CSE","Bangalore"));
        linkedList.add(new Student(02,"Akash","3rd-year","EC","Tumkur"));
        linkedList.add(new Student(03,"Ganesh","3rd-year","Civil","Kadur"));
        linkedList.add(new Student(04,"Tejas","3rd-year","IP","Davangere"));
        linkedList.add(new Student(05,"Pavan","3rd-year","CSE","Haveri"));

        for (Object obj : linkedList ) {
            System.out.println(obj);
        }

    }

}
