package javarunner.core.javaeight.conceptoftheday.typestream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestIntStream {

    public static void main(String[] args) {

        // You can create int stream of given values
       IntStream intStreamOf = IntStream.of(1,2,3,4,5,6,7);
       intStreamOf.forEach(i -> System.out.println(i));
        Stream<Integer> intStream = Stream.of(1,2,3,4,5);

       Optional<Integer> maxValue = intStream.max(Comparator.comparingInt(s ->s.intValue()));
        System.out.println("max value: "+ maxValue.get());

        // You can also create IntStream by using rangeClose() and range()
        // method. range() method returns an stream of increasing int in given range
        IntStream intStreamRange = IntStream.range(11,19);
        intStreamRange.forEach(i -> System.out.print(i+" "));
        System.out.println();

        // in rangeClosed() end number is also inclusive
        IntStream intStreamRangeClosed = IntStream.rangeClosed(21,29);
        intStreamRangeClosed.forEach(i-> System.out.print(i+" "));
        System.out.println();
        // You can also create IntStream by using mapToInt() function
        List<String> list =Arrays.asList("41","42","43","44");
        System.out.println("list of numbers: "+list);

        //mapToInt
        IntStream intStreamMapToInt = list.stream().mapToInt(n->Integer.valueOf(n));
        System.out.println("Total count of numbers using count: "+intStreamMapToInt.count());

        //maximum value in stream
        System.out.println("max value : "+list.stream().mapToInt(n->Integer.valueOf(n)).max());

        //sum
        System.out.println("sum of all numbers : "+list.stream().mapToInt(n->Integer.valueOf(n)).sum());
        //average
        System.out.println("average of all numbers : "+list.stream().mapToInt(n->Integer.valueOf(n)).average());

    }
}
