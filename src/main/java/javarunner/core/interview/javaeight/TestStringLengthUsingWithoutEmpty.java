package javarunner.core.interview.javaeight;

import java.util.Arrays;
import java.util.stream.Collectors;
/*
Count the number of characters in a string without empty characters
 */
public class TestStringLengthUsingWithoutEmpty {


    public static void main(String[] args) {

        String str ="AJAY LAMKHADE SAHEB";
        Long charCount = Arrays.stream(str.split("")).filter(s -> !s.equals(" ")).collect(Collectors.counting());
        System.out.println("Number of chars in String without empty chars: "+charCount);

    }
}
