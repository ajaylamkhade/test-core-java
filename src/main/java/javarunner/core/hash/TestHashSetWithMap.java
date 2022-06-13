package javarunner.core.hash;

import java.util.HashSet;
import java.util.Set;

public class TestHashSetWithMap {

    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("Shruti");
        stringSet.add(new String("Shruti"));
        stringSet.add("Shruti");
        stringSet.add(new String("Ajay"));
        stringSet.add(new String("ajay"));
        System.out.println("stringSet: "+stringSet);
    }
}
