package javarunner.core.javaeight.conceptoftheday.checkinterfaces;


interface InterfaceOne1
{
    default void anyMethod()
    {
        System.out.println("Hi... From Interface One");
    }
}

interface InterfaceTwo2
{
    default void anyMethod()
    {
        System.out.println("Hi... From Interface Two");
    }
}

public class MyClass2 implements InterfaceOne1, InterfaceTwo2
{
    @Override
    public void anyMethod()
    {

        InterfaceOne1.super.anyMethod();
    }

    public static void main(String[] args)
    {
        new MyClass2().anyMethod();
    }
}
