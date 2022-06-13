package javarunner.core.interview.javaeight;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

//calculate the occurrance of
class TestArrayWithCollection {

    public static void main(String[] args) {
        String [] arr = {"a","b","c","a","d","b","a"};
        List<String> list = Arrays.asList(arr);
        HashMap<String,Integer> hashMap = new HashMap();
        list.stream().forEach(str ->hashMap.put(str, Collections.frequency(list,str)));
        System.out.println(hashMap);
    }
}
