package javarunner.core.javaeight.conceptoftheday.optional;

import java.util.Optional;

public class TestFlatOptional {

    public static void main(String[] args) {

        Employee employee = new Employee("Jammy",21,"test123");
        Optional <Employee> employeeOptional = Optional.of(employee);

       Optional<Optional<String>> nameOptionalWrapper =  employeeOptional.map(e -> e.getName());

       Optional <String > nameOptionalWrapper1 =  employeeOptional.flatMap(e -> e.getName());

       Optional<String> nameOptional = nameOptionalWrapper.orElseThrow(IllegalAccessError::new);
       System.out.println(nameOptionalWrapper1.get());

    }
}
