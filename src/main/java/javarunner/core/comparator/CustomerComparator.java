package javarunner.core.comparator;

import java.util.Comparator;

public class CustomerComparator implements Comparator<Customer> {


    @Override
    public int compare(Customer o1, Customer o2) {

        return o1.getName().compareTo(o2.getName());
    }
}
