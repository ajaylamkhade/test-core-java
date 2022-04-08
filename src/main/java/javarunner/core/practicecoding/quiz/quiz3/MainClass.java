package javarunner.core.practicecoding.quiz.quiz3;

class A
{
    A (){
        System.out.println("class A constructor called !");
    }

    {
        System.out.println(1);

    }
}
 
class B extends A
{

}
 
class C extends B
{
    C (int a){
        System.out.println("class C constructor called !");
    }

    C (){
        this(5);
        System.out.println("class C default constructor called !");
    }


    {
        System.out.println(3);
    }
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        C c = new C();


    }


}