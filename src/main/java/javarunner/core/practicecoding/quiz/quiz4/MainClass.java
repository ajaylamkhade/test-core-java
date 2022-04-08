package javarunner.core.practicecoding.quiz.quiz4;

class M
{
    int i;
 
    public M(int i)
    {

        i = i--;
        System.out.println("M constructor called: "+ this.i);
    }
}
 
class N extends M
{
    public N(int i)
    {
        super(++i);
 
        System.out.println(i);
    }
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        N n = new N(26);
    }
}