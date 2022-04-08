package javarunner.core.checkcollection;

import java.util.Iterator;
import java.util.List;

public class MyIterable<E> implements Iterable <E> {
    //List<E> objectList;
    MyIterator myIterator;
    Iterable<E> objectIterable;
    public  MyIterable(Iterable<E> objectIterable){
        this.myIterator = new MyIterator(objectIterable);
        //this.objectIterable =objectIterable;
    }

    @Override
    public Iterator<E> iterator() {
        //enable to work with for loop
        //return this.objectIterable.iterator();
        return this.myIterator;
    }
}
