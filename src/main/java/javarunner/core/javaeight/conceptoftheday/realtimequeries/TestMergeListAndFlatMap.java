package javarunner.core.javaeight.conceptoftheday.realtimequeries;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestMergeListAndFlatMap {

    public static void main(String[] args) {
        List<String> listOne = Arrays.asList("a","b","c");
        List<String> listTwo = Arrays.asList("d","e","f");
        //merge of two lists
        Stream<List<String>> streamOfList = Stream.of(listOne, listTwo);

        List<String> mergedList = streamOfList.flatMap(s -> s.stream()).collect(Collectors.toList());
        System.out.println(mergedList);

    }
}
