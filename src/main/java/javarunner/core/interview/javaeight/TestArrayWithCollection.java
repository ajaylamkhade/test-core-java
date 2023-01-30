package javarunner.core.interview.javaeight;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//calculate the occurrance of
class TestArrayWithCollection {

    public static void main(String[] args) {
        String [] arr = {"a","b","c","a","d","b","a"};
        List<String> list = Arrays.asList(arr);
        HashMap<String,Integer> hashMap = new HashMap();
        list.stream().forEach(str ->hashMap.put(str, Collections.frequency(list,str)));
        System.out.println(hashMap);

        Stream<String> stringStream =Arrays.stream(arr);

        Map<String ,Long>  hashMap1 =stringStream.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(hashMap1);



    }
}
