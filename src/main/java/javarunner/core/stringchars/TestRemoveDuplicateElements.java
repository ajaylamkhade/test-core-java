package javarunner.core.stringchars;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

//create array without duplicate elements for the provided input string
public class TestRemoveDuplicateElements {
    static String wordString ="MAHABALESHWAR";
    public static void main(String[] args) {
        char  []  wordStringArray = wordString.toCharArray();
        char tempArray [] = new char[wordStringArray.length];
        char characterInString = 0;
        int counter=0;

        for(int i=0; i<wordStringArray.length-1;i++){

            }

        Arrays.stream(wordString.split("")).collect(Collectors.toSet()).forEach(s -> System.out.println(s));

    }
}
