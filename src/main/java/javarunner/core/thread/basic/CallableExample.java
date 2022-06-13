package javarunner.core.thread.basic;

import java.util.concurrent.Callable;

public class CallableExample implements Callable {

    @Override
    public String call() throws Exception {
        System.out.println("In call!");
        String name ="test";
        return name;
    }
}
