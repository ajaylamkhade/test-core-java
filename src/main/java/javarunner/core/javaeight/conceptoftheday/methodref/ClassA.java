package javarunner.core.javaeight.conceptoftheday.methodref;

public class ClassA implements InterfaceA ,InterfaceB{

    @Override
    public void method1() {
        System.out.println("method1 of class A");
    }

    @Override
    public void method2() {
        InterfaceB.super.method2();
    }


}
