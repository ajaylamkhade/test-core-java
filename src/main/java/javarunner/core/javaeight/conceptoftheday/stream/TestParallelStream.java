package javarunner.core.javaeight.conceptoftheday.stream;

import java.util.stream.IntStream;

public class TestParallelStream {

    public static void main(String[] args) {
        //normal stream
        IntStream.rangeClosed(1,10).forEach(t -> System.out.println(Thread.currentThread().getName()+" :  "+t));
        System.out.println("=========================================================");
        //parallel stream
        IntStream.rangeClosed(1,10).parallel().forEach(t -> System.out.println(Thread.currentThread().getName()+" :  "+t));
    }
}
