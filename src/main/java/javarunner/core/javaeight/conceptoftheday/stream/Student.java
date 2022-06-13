package javarunner.core.javaeight.conceptoftheday.stream;

public class Student {
    Integer rollNumber;
    String name;
    String division;

    public Student(Integer rollNumber, String name, String division) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.division = division;
    }

    public Integer getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(Integer rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", division='" + division + '\'' +
                '}';
    }
}
