package javarunner.core.interview.javaeight;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class TestHashMapSortingOnCustomObject {

    public static void main(String[] args) {
        Supplier<Map<String,Employee>> supplierMap = () -> employeeMap();
        Map<String,Employee> employeeMap = supplierMap.get();
        //using TreeMap
        TreeMap<String,Employee> treeMap = new TreeMap<>(employeeMap);
        //treeMap.putAll(employeeMap);
        System.out.println("sorted list by key using tree map: "+treeMap);

        //using ArrayList
        List<String> keyList = new ArrayList<>(employeeMap.keySet());
        Collections.sort(keyList);
        System.out.println("sorted list by key using array list: "+keyList);
        List<Employee> valueList = new ArrayList<>(employeeMap.values());
        Collections.sort(valueList);
        System.out.println("sorted list by value using array list: "+valueList);

        Map<String,Employee> sortedMap= employeeMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(
                Collectors.toMap(e->e.getKey(), e->e.getValue(),(e1,e2) ->e2,LinkedHashMap::new));
        System.out.println("sorted map by value employee id: "+sortedMap);
    }

    static Map<String ,Employee> employeeMap(){
        Map<String,Employee> employeeMap = new HashMap<>();
        Employee employee1 = new Employee(1l,"Mher");
        employeeMap.put(employee1.getName(),employee1);
        Employee employee2 = new Employee(22l,"Annie");
        employeeMap.put(employee2.getName(),employee2);
        Employee employee3 = new Employee(8l,"John");
        employeeMap.put(employee3.getName(),employee3);
        Employee employee4 = new Employee(2l,"George");
        employeeMap.put(employee4.getName(),employee4);

        return employeeMap;

    }
}
