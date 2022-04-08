package javarunner.core.checkcollection;

import java.util.Iterator;
import java.util.List;

public class MyIterator<T> implements Iterator<T> {
    T obj;
    private Iterator<T> myIterator;
    public MyIterator(Iterable<T> objIterable){
        myIterator = objIterable.iterator();
    }

    @Override
    public boolean hasNext() {
        System.out.println("myIterator.hasNext(): " +myIterator.hasNext());
        return myIterator.hasNext();
    }

    @Override
    public T next() {
        System.out.println("next called !");
        T obj1=null;
       if(myIterator.hasNext()) {
            obj1 = myIterator.next();
       }
        return obj1;
        //return obj;
    }


}
