package javarunner.core.hash;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {

    public static void main(String[] args) {
        Map <String ,Integer> myMap = new HashMap<>();
        myMap.put("aaa", 11);
        myMap.put("aaa", 12);
        myMap.put("aaa", 13);
        System.out.println("get map value : "+myMap.get("aaa"));

    }
    }
