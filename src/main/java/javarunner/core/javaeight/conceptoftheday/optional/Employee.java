package javarunner.core.javaeight.conceptoftheday.optional;

import java.util.Optional;

public class Employee {
    private String name;
    private Integer age;
    private String password;

    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public Optional<Integer> getAge() {
        return Optional.ofNullable(age);
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Optional<String> getPassword() {
        return Optional.ofNullable(password);
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Employee(String name, Integer age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }

    public Employee(){

    }
}
