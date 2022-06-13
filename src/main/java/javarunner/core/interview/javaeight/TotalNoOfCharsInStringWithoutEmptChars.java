package javarunner.core.interview.javaeight;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TotalNoOfCharsInStringWithoutEmptChars {

    public static void main(String[] args) {
        String str ="AJAY GOPAL LAMKHADE";

        //convert string to char array or some collection
       /*Map<String,Long> charCountMap =Arrays.stream(str.split("")).filter(s-> !s.equals(" ")).
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(charCountMap);
        */

       List<String>  numberOfCharsInString = Arrays.stream(str.split("")).filter(s ->!s.equals(" ")).collect(Collectors.toList());
        System.out.println(numberOfCharsInString.size());


    }

}
