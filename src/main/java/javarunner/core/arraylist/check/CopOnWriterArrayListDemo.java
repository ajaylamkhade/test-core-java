package javarunner.core.arraylist.check;

// Java program to illustrate CopyOnWriteArrayList
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.*;

public class CopOnWriterArrayListDemo {



        public static void main(String[] args)
        {
            CopyOnWriteArrayList l = new CopyOnWriteArrayList();

            l.add("A");
            l.add("B");
            l.add("C");
            Iterator itr = l.iterator();

            while (itr.hasNext())
            {
                String s = (String)itr.next();
                System.out.println(s);

                if (s.equals("B"))
                {
                    // Throws RuntimeException
                    itr.remove();
                }
               // Thread.sleep(1000);

                System.out.println(s);
            }
            //System.out.println(l);
        }
    }


