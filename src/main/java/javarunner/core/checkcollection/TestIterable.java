package javarunner.core.checkcollection;

import java.util.ArrayList;
import java.util.List;

public class TestIterable {

    public static void main(String[] args) {
        List<Customer> customerList = new ArrayList<>();
        Customer customer1 = new Customer();
        customer1.setId(111);
        customer1.setName("Deepak");
        customerList.add(customer1);

        MyIterable<Customer> myCollection = new MyIterable<>(customerList);

        for (Customer customer : myCollection){
            System.out.println("Name: "+customer.getName());
        }

        //System.out.println(myCollection.iterator().next());


    }
}
