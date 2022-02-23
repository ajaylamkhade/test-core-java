package javarunner.core.javaeight.conceptoftheday.realtimequeries;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/*
    Let’s try to solve some of the real time queries faced in the Employee Management
    System using Java 8 features.
 */
public class TestRealTimeQueries {
    static Supplier<List<Employee>> supplier = () -> new TestRealTimeQueries().getEmployeesList();
    public static void main(String[] args) {
     List<Employee> employeeList =supplier.get();

     //How many male and female employees are there in the organization?
     Map<String, Long> noOfMaleAndFemaleEmployees = employeeList.stream().collect(Collectors.groupingBy(e ->e.getGender(),Collectors.counting()));
     System.out.println(noOfMaleAndFemaleEmployees);

     //Print the name of all departments in the organization?
      Set<String> nameOfAllDepartments =  employeeList.stream().map(e ->e.getDepartment()).collect(Collectors.toSet());
      nameOfAllDepartments.forEach(d ->System.out.println(d));

      //What is the average age of male and female employees?
      Map<String,Double> averageAgeOfMaleFemale = employeeList.stream().collect(Collectors.groupingBy(e->e.getGender(),Collectors.averagingInt(e->e.getAge())));
      averageAgeOfMaleFemale.forEach((k,v) ->System.out.println(k+" : "+v));

      //Get the details of highest paid employee in the organization?
      //Optional<Employee> hihestPaidEmployee = employeeList.stream().max(( e1, e2) ->Double.valueOf(e1.getSalary()).compareTo(Double.valueOf(e2.getSalary()))) ;
      //List<Employee> hihestPaidEmployee= employeeList.stream().sorted(Comparator.comparingDouble((Employee e)->e.getSalary()).reversed()).limit(1).collect(Collectors.toList());
      Optional<Employee> hihestPaidEmployee =employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(s->s.getSalary())));
      //Optional<Employee> hihestPaidEmployee = employeeList.stream().max(Comparator.comparing(e ->e.getSalary())) ;
      System.out.println(" higest salary :"+hihestPaidEmployee);

      //Get the names of all employees who have joined after 2015?
       List<String> nameOfEmployeesJoinedAfter2015 = employeeList.stream().filter(e -> e.getYearOfJoining() >2015).map(e ->e.getName()).collect(Collectors.toList());
         nameOfEmployeesJoinedAfter2015.forEach( s ->System.out.println(s));
      //Count the number of employees in each department?
      Map<String,Long> numberOfEmployeesInEachDept = employeeList.stream().collect(Collectors.groupingBy(e ->e.getDepartment(),Collectors.counting()));
      System.out.println(numberOfEmployeesInEachDept);
      //What is the average salary of each department?
        Map<String,Double>  averageSalaryOfEachDepartment = employeeList.stream().collect(Collectors.groupingBy(e->e.getDepartment(),Collectors.averagingDouble(e ->e.getSalary())));
        System.out.println(averageSalaryOfEachDepartment);

      // Get the details of youngest male employee in the product development department?
        Optional<Employee> youngestEmpInProdDevDept = employeeList.stream().filter(e -> "Product Development".equals(e.getDepartment())).filter(e->"Male".equals(e.getGender())).collect(Collectors.minBy(Comparator.comparingInt(e->e.getAge())));
        System.out.println(youngestEmpInProdDevDept);
        //Who has the most working experience in the organization?
        //Optional<Employee> mostWorkingExperience = employeeList.stream().min(Comparator.comparingInt(e ->Integer.valueOf(e.yearOfJoining)));
        Optional<Employee> mostWorkingExperience = employeeList.stream().sorted(Comparator.comparingInt(e ->e.getYearOfJoining())).findFirst();
        System.out.println(mostWorkingExperience);
        //How many male and female employees are there in the sales and marketing team?
        Map<String,Long> numberOfMaleFemaleEmpInSalesMarketingDept = employeeList.stream().filter(e -> "Sales And Marketing".equals(e.getDepartment())).collect(Collectors.groupingBy(e ->e.getGender(),Collectors.counting()));
        System.out.println(numberOfMaleFemaleEmpInSalesMarketingDept);
        //What is the average salary of male and female employees?
        Map<String,Double> averageSalOfMaleFemale = employeeList.stream().collect(Collectors.groupingBy(e->e.getGender(),Collectors.averagingDouble(e->e.getSalary()) ));
        System.out.println(averageSalOfMaleFemale);
        //List down the names of all employees in each department?
       Map<String,List<Employee>> namesOfAllEmpInDept = employeeList.stream().collect(Collectors.groupingBy(e ->e.getDepartment()));
        Set<Map.Entry< String,List<Employee> >> entrySet = namesOfAllEmpInDept.entrySet();
        for (Map.Entry<String,List<Employee>> entry : entrySet ){
            System.out.println("---------------------------------------------");
            System.out.println("Names of all employees in : "+entry.getKey());
          System.out.println("---------------------------------------------");
          for (Employee employee :entry.getValue()){
              System.out.println(employee);
          }
        }
      //What is the average salary and total salary of the whole organization?
        DoubleSummaryStatistics avgSalAndTotalSal = employeeList.stream().collect(Collectors.summarizingDouble(e ->e.getSalary()));
        System.out.println("Average salary of the organization : "+avgSalAndTotalSal.getAverage());
        System.out.println("Total salary of the organization: "+ avgSalAndTotalSal.getSum());

     //Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.
      Map<Boolean,List<Employee>> partitionEmpByAge = employeeList.stream().collect(Collectors.partitioningBy(e ->e.getAge() > 25));
        Set<Map.Entry<Boolean,List<Employee>>> partitionEntrySet=  partitionEmpByAge.entrySet();
        for (Map.Entry<Boolean,List<Employee>> partEntry : partitionEntrySet){
            System.out.println("------------------------------------------------");
            if (partEntry.getKey()){
                System.out.println("Employees older than 25 years");
            }else{
                System.out.println("Employees younger than 25 years");
            }
            for (Employee employee : partEntry.getValue()){
                System.out.println(employee.getName());
            }
        }
     //Who is the oldest employee in the organization? What is his age and which department he belongs to?
      Optional<Employee>  oldestEmployee = employeeList.stream().collect(Collectors.maxBy(Comparator.comparingInt(e->e.getAge())));
      System.out.println("Name of oldest Employee: "+oldestEmployee.get().getName()+ " his age: "+oldestEmployee.get().getAge()+" department: "+oldestEmployee.get().getDepartment());

    }


    private List<Employee> getEmployeesList() {
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

        return employeeList;
    }
}
