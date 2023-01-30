package javarunner.core.javaeight.conceptoftheday.realtimequeries;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestMergeListAndFlatMap1 {

    public static void main(String[] args) {

        Stream<List<Employee>> streamOfemployeesList = Stream.of(getEmployeesList1(), getEmployeesList2());
        //decompose and merge two lists
        List<Employee> flattennedList = streamOfemployeesList.flatMap(employees -> employees.stream()).collect(Collectors.toList());

        //find the employee with highest paid salary from each department
        Map<String, Optional<Employee>> map = flattennedList.stream().collect(Collectors.groupingBy((e -> e.getDepartment()), Collectors.maxBy(Comparator.comparingDouble(e -> e.getSalary()))));
        System.out.println(map);
    }


    private static List<Employee> getEmployeesList1() {
        List<Employee> employeeList1 = new ArrayList<>();
        employeeList1.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Dept-1", 2016, 10500.0));
        employeeList1.add(new Employee(177, "Manu Sharma", 35, "Male", "Dept-1", 2010, 37000.0));
        employeeList1.add(new Employee(188, "Wang Liu", 31, "Male", "Dept-1", 2015, 34500.0));
        return employeeList1;
    }

    private static List<Employee> getEmployeesList2() {
        List<Employee> employeeList2 = new ArrayList<>();

        employeeList2.add(new Employee(111, "Jiya Brein", 32, "Female", "Dept-2", 2011, 25000.0));
        employeeList2.add(new Employee(122, "Paul Niksui", 25, "Male", "Dept-2", 2015, 13500.0));
        employeeList2.add(new Employee(133, "Martin Theron", 29, "Male", "Dept-2", 2012, 18000.0));

        return employeeList2;
    }

}