package javarunner.core.interview.javaeight;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//use java8 remove empty string from array
public class TestRemoveEmptyStringFromArray {

    public static void main(String[] args) {
        String nameArray [] ={"ABC","PQR" ,"","DEF","","JKL","","STU"};

        Stream<String> nameArrayStr =Arrays.stream(nameArray);
        //remove empty string using filter method
      List<String> strArrayList = nameArrayStr.filter(s-> !s.equals("")).collect(Collectors.toList());
        System.out.println(strArrayList);


    }
}
