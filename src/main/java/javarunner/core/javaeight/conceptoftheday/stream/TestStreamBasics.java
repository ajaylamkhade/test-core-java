package javarunner.core.javaeight.conceptoftheday.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TestStreamBasics {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student(11,"Kapil","A"),
                new Student(12,"Jay","B"),
                new Student(13,"Akshay","C")
                );

        //print the name of each student
        //students.stream().map(student -> student.getName()).forEach(System.out::println);

        //use of filter ,return stream of elements of which satisfies the predicate
        //students.stream().map(student -> student.getName()).filter( nameOfStudent -> nameOfStudent.length() >3).forEach(System.out::println);
        //Returns a stream consisting of elements sorted according to supplied Comparator.
        // students.stream().map(student -> student.getName()).sorted((String name1 ,String name2)-> name1.length()-name2.length()).forEach(System.out::println);
        //reduce():This method performs reduction operation on elements of a stream using initial value and binary operation.
       //Integer totalOfRollNumber = students.stream().map(student -> student.getRollNumber()).reduce(0,(a,b)-> a+b);
       //System.out.println("totalOfRollNumber: "+totalOfRollNumber);

       // peek() : Performs an additional action on each element of a stream. This method is only to support debugging where you want to see the elements as you pass in a pipeline.
        // students.stream().map(student -> student.getName()).filter(studentName -> studentName.length() >3)
          //     .peek( nameAfterFilter -> System.out.println("Filtered Name: "+nameAfterFilter)).map(String ::toUpperCase)
           //    .peek(nameAfterMap -> System.out.println("Mapped Name: "+nameAfterMap)).toArray();

  /*     students.stream().sorted(new Comparator<Student>() {
           @Override
           public int compare(Student o1, Student o2) {
               return o2.getName().compareTo(o1.getName());
           }
       }).map(student -> student.getName()).forEach(System.out::println);
*/
    /*    if(students.stream().map(student -> student.getName()).allMatch((String name) -> name.length() >2)){
           System.out.println("names greater than length 2!");
       }
*/
        //students.stream().map(student -> student.getName()).sorted((String name1,String name2) -> name2.compareTo(name1)).forEach(System.out::println);
        students.stream().sorted(Comparator.comparing((s1 ->s1.getRollNumber()),Comparator.reverseOrder())).collect(Collectors.toList()).stream().map(s1->s1.getRollNumber()).forEach(System.out::println);
       List<Student> studentList = students.stream().sorted(Comparator.comparingInt((Student s)-> s.getRollNumber()).reversed()).collect(Collectors.toList());
       studentList.forEach(emp -> System.out.println(emp.toString()));

      Optional<Student> student = studentList.stream().max(Comparator.comparingInt(r ->r.getRollNumber()));
        System.out.println("student with max roll number: "+student.toString());

    }
}
