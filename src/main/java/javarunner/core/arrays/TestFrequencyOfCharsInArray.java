package javarunner.core.arrays;

import java.util.*;
import java.util.stream.Collectors;

//calculate the occurrance of
class TestArrayWithCollection {

    public static void main(String[] args) {
        String [] arr = {"a","b","c","a","d","b","a"};
        List<String> list = Arrays.asList(arr);
        HashMap<String,Integer> hashMap = new HashMap();
        list.stream().forEach(str ->hashMap.put(str, Collections.frequency(list,str)));
        System.out.println(hashMap);
        //second approach using collectors
        List<String> list1 = Arrays.asList(arr);
       Map<String, Long>  map =list1.stream().collect(Collectors.groupingBy(s ->s ,Collectors.counting()));
       //or use Function.identity()
       //Map<String, Long>  map =list1.stream().collect(Collectors.groupingBy(Function.identity() ,Collectors.counting()));
        System.out.println(map);



    }
}
