package javarunner.core.checkiterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestIterator {

    public static void main(String[] args) {
        //List<String> stringList = Arrays.asList("Ajay" ,"Jay","Kapil","Dhawal");
        List<String> stringList= new ArrayList<>();
        stringList.add("10");
        stringList.add("30");
        stringList.add("20");


        Iterator<String> iterator =stringList.iterator();
        while (iterator.hasNext()){
                stringList.remove(0);
                if (stringList.size() < 1) break;
                System.out.println("elements removed !!");
        /*    String cursorElement = iterator.next();
            System.out.println("cursorElement: "+cursorElement);*/

        }

        System.out.println(stringList.size());

    }
}
