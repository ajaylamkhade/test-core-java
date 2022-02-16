package javarunner.core.javaeight.conceptoftheday.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class TestFunctionalInterface {

    public static void main(String[] args) {

        List<Student> students = Arrays.asList(new Student(11,"Kapil","A"),
                new Student(12,"Jay","B"),
                new Student(13,"Akshay","C")
        );

        CheckFunctioalInterface checkFunctioalInterface = () ->System.out.println("please do called!");
        checkFunctioalInterface.pleaseDo();
       //test Consumer functional interface
        Consumer<Student> studentConsumer = (Student student) -> System.out.println("Student Name:" +student.getName());
        for (Student student :students){
            studentConsumer.accept(student);
        }


        String name;
        //Function functional interface
        Function<Student,String> studentFunction = (Student student) -> student.getName();
        List<String> nameList = new ArrayList<>();
        for (Student student : students){
            name = studentFunction.apply(student);
            nameList.add(name);
        }
        System.out.println(nameList);

        List<Student> studentList = new ArrayList<>();

        //functional interface
        Supplier<Student> studentSupplier = () -> new Student(27,"Pushparaj","A");
        studentList.add(studentSupplier.get());
        System.out.println(studentList.get(0).getName());
    }
}

@FunctionalInterface
interface CheckFunctioalInterface{
    default void add(){
        System.out.println("hello default add method");
    }

    void pleaseDo();
}