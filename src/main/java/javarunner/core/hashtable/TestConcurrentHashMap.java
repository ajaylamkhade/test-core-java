package javarunner.core.hashtable;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class TestConcurrentHashMap {

    public static void main(String[] args) {


        ConcurrentHashMap<String,Integer> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("dhawal", 1);
        concurrentHashMap.put("tushar", 2);
        concurrentHashMap.put("sneha", 3);
        concurrentHashMap.put("manasi", 4);


        Iterator iterator =concurrentHashMap.keySet().iterator();


    while (iterator.hasNext()){
         iterator.next();
         //System.out.println("hasNext");
            concurrentHashMap.put("ajay", 5); //it works
        }

        concurrentHashMap.keySet().forEach(e->System.out.println(e));
    }


}

