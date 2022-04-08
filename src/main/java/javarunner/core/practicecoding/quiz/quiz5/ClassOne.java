package javarunner.core.practicecoding.quiz.quiz5;

import javarunner.core.practicecoding.quiz.quiz1.C;

class ClassOne
{
    static int i = 111;
 
    int j = 222;
 
    {
        i = i++ - j++;
    }
}
 
class ClassTwo extends ClassOne
{
    {
        j = i-- + --j;
    }

    public static void main(String[] args) {
        ClassTwo classTwo = new ClassTwo();
        System.out.println( "i: "+classTwo.i +" j: "+classTwo.j);
    }
}