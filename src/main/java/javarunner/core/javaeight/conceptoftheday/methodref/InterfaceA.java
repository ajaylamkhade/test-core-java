package javarunner.core.javaeight.conceptoftheday.methodref;

public interface InterfaceA {
    void method1();
    default void method2(){
        System.out.println("default method2!");
    }
    public static void method3(){
        System.out.println("static method3!");
    }

}
