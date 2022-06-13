package javarunner.core.javaeight.conceptoftheday.stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TestStreamCommaSplitArray {

    public static void main(String[] args) {
        String  roles = "ADMIN,USER,MANAGER";
        List<SimpleGrantedAuthority> simpleGrantedAuthorityList = Arrays.stream(roles.split(",")).map(s -> new SimpleGrantedAuthority(s)).collect(Collectors.toList());
        simpleGrantedAuthorityList.stream().forEach(s -> System.out.println(s.getAuthority()));
        Integer  numbers[] = {1,2,4};
        Set<Integer> integerSet = new HashSet<>();
        Arrays.stream(numbers).filter( i -> integerSet.add(i));

        Integer number =1;
        Integer copyNumber = 10110101%10;
        System.out.println("copyNumber: "+copyNumber);

    }
}
