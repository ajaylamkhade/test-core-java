package javarunner.core.practicecoding.quiz.quiz2;

class A
{
    Integer i = 10;

    void methodCall(){
    System.out.println("methodA() called");
    }
}
 
class B extends A
{
    Integer i = 20;
    void methodCall(){
    System.out.println("methodB() called");
}
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        A a = new B();
        a.methodCall();
 
        System.out.println(a.i);
    }
}