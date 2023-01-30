package javarunner.core.polymorphism;

import org.omg.IOP.IOR;

import java.io.IOException;

public class PolyB extends PolyA{

    @Override
    void myMethod() throws IOException {
        System.out.println("method of PolyB");
    }

}
