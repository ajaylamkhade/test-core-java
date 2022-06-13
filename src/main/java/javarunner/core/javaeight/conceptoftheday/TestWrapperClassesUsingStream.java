package javarunner.core.javaeight.conceptoftheday;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestWrapperClassesUsingStream {

    public static void main(String[] args) {
        Stream<Integer> streamOfInteger = Stream.of(5,8,1,4,3,7,2,1);
        //Stream<Integer> intStream = Stream.of(5,8,1,4,3,7,2,1);
        streamOfInteger.sorted(Comparator.comparingInt(n ->n)).collect(Collectors.toList()).forEach( s -> System.out.print(" "+s));
        // System.out.println("\n reverserd order: ");
        //streamOfInteger.sorted(Comparator.comparingInt((Integer n) ->Integer.valueOf(n)).reversed()).collect(Collectors.toList()).forEach( s -> System.out.print(" "+s));

        //Using IntStream
        IntStream intStream = IntStream.of(5,8,1,4,3,7,2,1);
        //u can use intStream.average(); intStream.sum(); intStream.summaryStatistics().getMax();
        intStream.mapToDouble( n ->n).forEach(s -> System.out.println(s));
        System.out.println(" mapTo: ");

        // New way:
        List<Integer> costBeforeTax = Arrays.asList(100, 200, 300, 400, 500);
        double bill = costBeforeTax.stream() .map((cost) -> cost + .12*cost)
                .reduce((sum, cost) -> sum + cost).get();

        System.out.println("Total : " + bill);


        IntStream intStream1 = IntStream.of(5,8,1,4,3,7,2,1);
        int sum = intStream1.filter(n -> n>5).sum();
        System.out.println("sum of number greater than 5: "+ sum);

        Stream<Integer> streamOfInteger1 = Stream.of(5,8,1,4,3,7,2,1);
        Integer sum1 = streamOfInteger1.filter(n -> n>5).collect(Collectors.summingInt(s ->s));
        System.out.println("**sum of number greater than 5: "+ sum);
    }
}
