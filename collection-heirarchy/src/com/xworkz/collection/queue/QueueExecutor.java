package com.xworkz.collection.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExecutor {

    public static void main(String[] args) {
//        List list = new ArrayList();
//        list.add(new Patient(1,"Rohit",983561234,"Bangalore"));
//        list.add(new Patient(3,"Rakesh",983578236,"Bangalore"));
//        list.add(new Patient(2,"Suresh",983635128,"Bangalore"));
//        list.add(new Patient(5,"Arun",978354619,"Bangalore"));
//        list.add(new Patient(4,"Ashok",983523546,"Bangalore"));
//
//        for (Object obj:list){
//            System.out.println(obj);
//        }


        Queue queue = new PriorityQueue();
        queue.add(new Patient(4,"Rohit",983526735,"Bangalore"));
        queue.add(new Patient(3,"Rakesh",983578236,"Bangalore"));
        queue.add(new Patient(2,"Suresh",983635128,"Bangalore"));
        queue.add(new Patient(5,"Arun",978354619,"Bangalore"));
        queue.add(new Patient(1,"Ashok",983523546,"Bangalore"));
//        queue.add(null);
        for (Object obj : queue ) {
            System.out.println(obj);
        }

        System.out.println(" ---------------- ");
        System.out.println("offer method executed : ");    //output is boolean
        System.out.println(queue.offer(new Patient(4,"Ramesh",983526735,"Bangalore")));
        System.out.println();

        System.out.println("peak method executed : ");     //execute top element
        System.out.println(queue.peek());
        System.out.println();

        System.out.println("poll method executed : ");     //remove top element
        System.out.println(queue.poll());
        System.out.println();

        System.out.println("element method executed");       //same as peek method
                                                          // but in case of collection is null then shows NullPointerException
        System.out.println(queue.element());
        System.out.println();

        System.out.println("remove method executed : ");
        System.out.println(queue.remove());
        System.out.println();

        System.out.println("see what is happen ofter the method : ");
        for ( Object obj1: queue ) {
            System.out.println(obj1);
        }

    }
}
