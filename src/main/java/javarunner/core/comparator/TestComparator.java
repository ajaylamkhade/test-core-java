package javarunner.core.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//sort Customer object by it's id
public class TestComparator {

    public static void main(String[] args) {

        List<Customer> customerList = getCustomersList();
        System.out.println(customerList);
        Collections.sort(customerList, new CustomerComparator());
        System.out.println("sorted list by Name: "+customerList);


    }

    private static List<Customer>  getCustomersList(){

        return Arrays.asList(new Customer(111,"John","France"),new Customer(112,"Kapil","India"),new Customer(113,"Alex","Belgium"),new Customer(115,"Honghao","China"));

    }


}
