package javarunner.core.javaeight.conceptoftheday.stream;

import java.util.*;
import java.util.stream.Collectors;

public class TestCollectors {

    public static void main(String[] args) {

       List<Integer> numberList = Arrays.asList(8,2,5,7,3,6);
       //collect method returns list of odd numbers
       List<Integer> oddNumbers = numberList.stream().filter(number -> number %2 !=0).collect(Collectors.toList());
       oddNumbers.forEach(n -> System.out.println(n));
       //create new student list
       TestCollectors testCollectors = new TestCollectors();
        List<Student> studentList = testCollectors.getCreatedStudentList();
        //Collect top 3 performing students in the list
        //List<Student> top3Students = studentList.stream().sorted(Comparator.comparing((s -> s.getPercentage()),Comparator.reverseOrder())).limit(3).collect(Collectors.toList());
        List<Student> top3Students = studentList.stream().sorted(Comparator.comparingDouble((Student s) ->s.getPercentage()).reversed()).limit(3).collect(Collectors.toList());
        top3Students.forEach( s -> System.out.println(s));
        //collecting subjects offered in to set
        Set<String> subjects = studentList.stream().map(student -> student.getSubject()).collect(Collectors.toSet());
        System.out.println(subjects);
        //Collecting name and percentage of each student into a Map
        Map<String,Double> nameAndPercentageMap = studentList.stream().collect(Collectors.toMap(st ->st.getName(), st -> st.getPercentage()));
        System.out.println(nameAndPercentageMap);
        //collecting first three students into linkedlist
        LinkedList<Student> studentLinkedList = studentList.stream().limit(3).collect(Collectors.toCollection( ()-> new LinkedList<>()));
        System.out.println(studentLinkedList);
        //Collecting the names of all students joined as string.delimited by comma ','
       String nameDelimited = studentList.stream().map(s ->s.getName()).collect(Collectors.joining(" ** "));
       System.out.println(nameDelimited);
       //counting the number of students
       Long studentsCount = studentList.stream().collect(Collectors.counting());
       System.out.println(studentsCount);
       //find highest percentage
       Double highestPercentage = studentList.stream().map(s -> s.getPercentage()).max(Comparator.comparingDouble(s -> s)).get();
       System.out.println(highestPercentage);
        //collecting highest percentage using collector
        Optional<Double> highestPercentageOptional = studentList.stream().map(s -> s.getPercentage()).collect(Collectors.maxBy(Comparator.naturalOrder()));
        System.out.println(highestPercentageOptional);
        //collecting lowest percentage
        Double lowestPercentage = studentList.stream().map(s -> s.getPercentage()).collect(Collectors.minBy(Comparator.naturalOrder())).get();
        System.out.println(lowestPercentage);
        //collecting sum of percentages
        Double sumOfPercentage = studentList.stream().collect(Collectors.summingDouble(student -> student.getPercentage()));
        System.out.println(sumOfPercentage);
        //collecting average percentage
        Double averagePercentage = studentList.stream().collect(Collectors.averagingDouble(student -> student.getPercentage()));
        System.out.println(averagePercentage);
        //Extracting highest, lowest and average of percentage of students ,collecting statistical information
         DoubleSummaryStatistics studentStat = studentList.stream().collect(Collectors.summarizingDouble(student -> student.getPercentage()));
         System.out.println("Highest Percentage : "+studentStat.getMax());
         System.out.println("Lowest Percentage : "+studentStat.getMin());
         System.out.println("Average Percentage : "+studentStat.getAverage());
         //grouping the students by subject
         Map<String ,List<Student>> studentsGroupBySubject= studentList.stream().collect(Collectors.groupingBy(s -> s.getSubject()));
         System.out.println(studentsGroupBySubject);
         //partitioning the students who got above 80.0% from who don't
        Map<Boolean,List<Student>> studentspartionedByPercentage =  studentList.stream().collect(Collectors.partitioningBy(s ->s.getPercentage() > 80.0));
        System.out.println(studentspartionedByPercentage);
        //collecting first three students into list and making it unmodifiable
        List<Student> first3Students = studentList.stream().limit(3).collect(Collectors.collectingAndThen(Collectors.toList(),Collections::unmodifiableList));
        System.out.println(first3Students);

 }

    class Student {
        String name;
        Integer rollNumber;
        String subject;
        Double percentage;

        public Student(String name, Integer rollNumber, String subject, Double percentage) {
            this.name = name;
            this.rollNumber = rollNumber;
            this.subject = subject;
            this.percentage = percentage;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getRollNumber() {
            return rollNumber;
        }

        public void setRollNumber(Integer rollNumber) {
            this.rollNumber = rollNumber;
        }

        public String getSubject() {
            return subject;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }

        public Double getPercentage() {
            return percentage;
        }

        public void setPercentage(Double percentage) {
            this.percentage = percentage;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", rollNumber=" + rollNumber +
                    ", subject='" + subject + '\'' +
                    ", percentage=" + percentage +
                    '}';
        }
    }


    private List<Student> getCreatedStudentList(){
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Paul", 11, "Economics", 78.9));
        studentList.add(new Student("Zevin", 12, "Computer Science", 91.2));
        studentList.add(new Student("Harish", 13, "History", 83.7));
        studentList.add(new Student("Xiano", 14, "Literature", 71.5));
        studentList.add(new Student("Soumya", 15, "Economics", 77.5));
        studentList.add(new Student("Asif", 16, "Mathematics", 89.4));
        studentList.add(new Student("Nihira", 17, "Computer Science", 84.6));
        studentList.add(new Student("Mitshu", 18, "History", 73.5));
        studentList.add(new Student("Vijay", 19, "Mathematics", 92.8));
        studentList.add(new Student("Harry", 20, "History", 71.9));

        return studentList;
    }
}
