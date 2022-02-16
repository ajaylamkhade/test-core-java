package javarunner.core.javaeight.conceptoftheday.methodref;

public interface InterfaceB {
        void method1();

        default void method2(){
            System.out.println("default method2 of InterfaceB!");
        }
        static void method3(){
            System.out.println("static method3 of InterfaceB!");
        }
}
