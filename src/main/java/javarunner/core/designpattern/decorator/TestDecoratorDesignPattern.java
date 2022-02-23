package javarunner.core.designpattern.decorator;

/**
 * Decorator design pattern is used to modify the functionality of an object at runtime.
 * At the same time other instances of the same class will not be affected by this,
 * so individual object gets the modified behavior. Decorator design pattern is one of
 * the structural design pattern
 * Decorator design pattern is helpful in providing runtime modification abilities
 * and hence more flexible. Its easy to maintain and extend when the number of choices are more.
 * Decorator pattern is used a lot in Java IO classes, such as FileReader, BufferedReader etc.
 */
public class TestDecoratorDesignPattern {
    public static void main(String[] args) {
    //lets design a sports car and of course sports car cannot be designed without basic card features,
    //so add basic car features
    SportsCar sportsCar = new SportsCar( new BasicCar());
    sportsCar.assemble();
    System.out.println("\n************************************");

    //now lets design luxury car with sports car features,basic card features are default
    LuxuryCar sportsLuxuryCar = new LuxuryCar( new SportsCar(new BasicCar()));
    sportsLuxuryCar.assemble();


    }
}
