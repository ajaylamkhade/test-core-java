package javarunner.core.checkqueue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TestQueue {
    public static void main(String[] args) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("Karan");
        priorityQueue.add("Vijay");
        priorityQueue.add("Amit");
        priorityQueue.add("Ajay");
        priorityQueue.add("Aaa");


        priorityQueue.add("Jay");
        priorityQueue.add("Rahul");

        System.out.println("head: "+priorityQueue.element());
        System.out.println("head peek: "+priorityQueue.peek());
        System.out.println("Iterating the queue elements!");
        Iterator iterator = priorityQueue.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    priorityQueue.remove();
    priorityQueue.poll();
    Iterator iterator1 = priorityQueue.iterator();
        System.out.println("after removing two elements");
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

    }
}
