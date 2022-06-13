package javarunner.core.javaeight.conceptoftheday.functionalinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Test1 {
    public static void main(String[] args) {
       List<Integer> list= Arrays.asList(23,4,21,19,18,11,7,9,5);
        Predicate<Integer> predicate = t -> t>11;
        //System.out.println(predicate.test(4));
        list.stream().filter(predicate).sorted().forEach((t) -> System.out.println(t));


    }
}
