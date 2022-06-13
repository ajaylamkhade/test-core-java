package javarunner.core.interview.javaeight;

import java.util.Comparator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestStringOrderByLengthThenName {

    public static void main(String[] args) {

    Stream.of("AJAY","DHAWAL","JAY","NACHIKET","YASH","RAJ","AMIT").
            sorted(Comparator.comparing(String::length).thenComparing(Function.identity()))
            .collect(Collectors.toList()).forEach(s -> System.out.println(s));

    }
}
