package javarunner.core.arraylist.check;// Java program to illustrate ArrayList
import java.util.*;

class CopyDemo
{
    public static void main(String[] args)
    {
        ArrayList l = new ArrayList();
        l.add("A");
        l.add("B");
        l.add("C");
        Iterator itr = l.iterator();

        while (itr.hasNext())
        {
            String s = (String)itr.next();

            if (s.equals("B"))
            {
                // Can remove
                itr.remove();
            }
        }
        System.out.println(l);
    }
}
