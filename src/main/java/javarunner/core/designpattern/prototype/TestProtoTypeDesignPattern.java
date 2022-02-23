package javarunner.core.designpattern.prototype;

import java.util.Scanner;

/**
 * prototypes design pattern allows you to create objects by cloning an existing object instead
 * of creating a new object from scratch.
 * This pattern is used when the process of object creation is costly.
 * when cloning, the newly copied object contains the same characteristics as its source object.
 * After cloning, we can change the values of the new object’s properties as required.
 * This pattern comes under a creational pattern.
 */
public class TestProtoTypeDesignPattern {

    public static void main(String[] args) throws CloneNotSupportedException {

        Registry registry = new Registry();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your order type: ");
        String dressType = scanner.next();
        System.out.println("Enter your quantity: ");
        int quantity = scanner.nextInt();

        Dress order = registry.getClone(dressType);
        order.setQuantity(quantity);

        System.out.println("Your order is : "+order.getQuantity()+" "+order.toString());
        System.out.println("The unit price of a "+order.toString()+" is "+order.getUnitPrice() );
        System.out.println("Your Total price is : "+order.calculateBill()+" INR");
    }
}
