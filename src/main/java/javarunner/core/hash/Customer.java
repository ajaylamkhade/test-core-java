package javarunner.core.hash;

import java.util.Objects;

public class Customer {
    private String name;
    private int salary;

    public Customer(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this==o){
            return true;
        }
        if(o==null || this.getClass()!=o.getClass()){
            return false;
        }
        Customer customer =(Customer)o;
        if (customer.salary!=this.salary){
            return false;
        }

        if (this.name!=null?!this.name.equals(customer.name):customer.name!=null){
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result=this.name!=null?this.name.hashCode():0;
        result=31*result+this.salary;
        return result;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
