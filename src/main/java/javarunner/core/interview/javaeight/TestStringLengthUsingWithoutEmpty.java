package javarunner.core.interview.javaeight;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
Count the number of characters in a string without empty characters
 */
public class TestStringLengthUsingWithoutEmpty {


    public static void main(String[] args) {

        String str ="AJAY LAMKHADE SAHEB";
        Long charCount = Arrays.stream(str.split("")).filter(s -> !s.equals(" ")).collect(Collectors.counting());
        System.out.println("Number of chars in String without empty chars: "+charCount);

        List<String> charCount1 = Stream.of(str.split("")).filter(s ->!s.equals(" ")).collect(Collectors.toList());
        System.out.println("Number of chars in String without empty chars, 2nd approach : "+charCount1.size());


    }
}
