package javarunner.core.javaeight.conceptoftheday.stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestMapFlatMap {

    public static void main(String[] args) {
      List<Institute> instituteList = new ArrayList<>();
      instituteList.add(new Institute("IIM", Arrays.asList("Banglore", "Ahemadabad", "Kozhikode", "Luncknow")));
      instituteList.add(new Institute("IIT", Arrays.asList("Delhi", "Mumbai", "Kharagpur")));
      instituteList.add(new Institute("NIFT", Arrays.asList("Hyderabad", "Patna", "Mumbai", "Banglore")));

      List<String> instituteNames = instituteList.stream().map(institute -> institute.getName()).collect(Collectors.toList());
      System.out.println("Institute Names: " + instituteNames);

      List<List<String>> instituteList1 = instituteList.stream().map(institute -> institute.getLocations()).collect(Collectors.toList());
      System.out.println(instituteList1);
      //list returned after flattening the different lists
      Set<String> instituteList2 = instituteList.stream().flatMap(institute -> institute.getLocations().stream()).collect(Collectors.toSet());
      List<String> instituteList3 = instituteList2.stream().sorted(Comparator.comparing(s -> s, Comparator.reverseOrder())).collect(Collectors.toList());
      System.out.println(instituteList3);
    }

}
