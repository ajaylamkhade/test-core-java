package javarunner.core.interview.javaeight;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GetcountOfEachCharInString {

    public static void main(String[] args) {
        String str = "Lamkhade";
  /*
        for (String str1: str.split("")){
            System.out.println(str1);
        }*/
        //Stream<String> strStream = Arrays.stream(str.split("")); or
       Stream<String> stream1= Stream.of(str.split(""));
        Map<String, Long> countMap =
                stream1.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(countMap);
    }
}
