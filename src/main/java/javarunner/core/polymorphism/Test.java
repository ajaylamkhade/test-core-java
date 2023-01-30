package javarunner.core.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) throws Exception {

        PolyA poly = new PolyB();
        poly.myMethod();

    }
}
