package javarunner.core.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestStringManipulationUsingStreams {

    public static void main(String[] args) {
        String str = "100101100";
        int count=0;
        int i =0;
        for (char c : str.toCharArray()){
            if (str.charAt(i)=='0'){
                count++;
            }
            i++;
        }
        System.out.println("Number of zeros in string : "+count);


        System.out.println("Number of zeros in string using java8 stream API: "+countNumberOccurences(str));

    }

    //another approach using stream
    private static Long countNumberOccurences(String str){

        Long countOfZeros = Arrays.stream(str.split("")).filter(c -> c.equals("0")).collect(Collectors.counting());
        return  countOfZeros;

    }
}
