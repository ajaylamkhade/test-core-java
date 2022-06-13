package javarunner.core.javaeight.conceptoftheday.checkinterfaces;

interface InterfaceOne
{
    default void anyMethod()
    {
        System.out.println("Hi... From Interface One");
    }
}

interface InterfaceTwo extends InterfaceOne
{
    @Override
    default void anyMethod()
    {
        System.out.println("Hi... From Interface Two");
    }
}

class ClassOne implements InterfaceOne, InterfaceTwo
{
    @Override
    public void anyMethod()
    {
        System.out.println("Hi... From Class One");
    }
}

public class MyClass extends  ClassOne implements InterfaceOne,InterfaceTwo {

    public static void main(String[] args)
    {
        new MyClass().anyMethod();
    }
}

