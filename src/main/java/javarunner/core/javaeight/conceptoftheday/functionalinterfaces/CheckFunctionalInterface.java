package javarunner.core.javaeight.conceptoftheday.functionalinterfaces;

import java.io.IOException;
import java.util.function.Function;
import java.util.stream.Stream;

public class CheckFunctionalInterface {

    public static void main(String[] args) {
        Function<String,String> function = Function.identity();
        System.out.println( function.apply("10"));

        MyInterface <String,Integer> myInterface = str -> Integer.parseInt(str);
        System.out.println(myInterface.myMethod("21"));
        Function <String,Integer> myInterface1 = str -> {
            try {
                return CheckFunctionalInterface.myMethod1(str);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return 0;
        };
        System.out.println(myInterface1.apply("999"));

  }

    interface MyInterface <T,R> {

        Integer myMethod(String str); //throws IOException;
    }

    private static Integer myMethod1(String str) throws IOException{
        System.out.println("myMethod1 called ! ");

        return Integer.parseInt(str);
    }

}
