package com.xworkz.maping;

import java.util.*;

public class MapExecutor {

    public static void main(String args[]){

//      methods of Map :   put(k, v) , clear() , get(k)- v  , remove(k)- v , containsKey(k)-boolean , containsValue(v)-boolean

//      Map<key   , value>
        Map<Integer, String> map = new HashMap<Integer,String>();  //ordered output
        System.out.println(map.put(1,"Sachin"));
        System.out.println(map.put(3,"Gagan"));
        map.put(2,"Manoj");
        map.put(5,"Yuvraj");
        map.put(4,"Nitish");
//        System.out.println(map);

        Set<Map.Entry<Integer, String>> set = map.entrySet();

        for ( Map.Entry<Integer,String> entry : set ) {
            System.out.println("key = "+entry.getKey()+","+"value = "+entry.getValue());
        }
//        System.out.println(map.entrySet());

        System.out.println(" ------------- ");
        System.out.println("method started : ");
        System.out.println(map.containsKey(3));    // return boolean
        System.out.println(map.containsValue("Sachin"));     //return boolean

        System.out.println(map.get(2));      //return String

        System.out.println(map.remove(3));   // return String
        System.out.println("method ended :");
        System.out.println();

        System.out.println("see what is happen after the method : ");
        System.out.println(map);

        System.out.println(" ------------ ");
        Set<Integer> integers= map.keySet();
        System.out.println(integers);

        System.out.println(" -------------- ");
        Map<Integer, String> map1 = new TreeMap<Integer,String>();   //ordered output
        map1.put(2,"Bharath");
        map1.put(3,"Chandan");
        map1.put(1,"Maltesh");
        map1.put(5,"Nandan");
        map1.put(4,"Surya");
        System.out.println(map1);

        System.out.println(" --------------- ");
        Map<Integer,String> map2 = new LinkedHashMap<Integer,String>();    //un-ordered output
        map2.put(3,"Abhishek");
        map2.put(5,"yuvraj");
        map2.put(2,"Varun");
        map2.put(4,"Darshan");
        map2.put(1,"Piyush");
        System.out.println(map2);

    }
}
