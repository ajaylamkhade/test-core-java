package javarunner.core.hash;

import java.util.HashSet;
import java.util.Set;

public class TestHashEqual {

    public static void main(String[] args) {
        Customer customer1 = new Customer("John",80000);
        Customer customer2 = new Customer("John",80000);

        Set<Customer> customers = new HashSet<>();
        customers.add(customer1);
        customers.add(customer2);

        System.out.println(customers);

    }
}
