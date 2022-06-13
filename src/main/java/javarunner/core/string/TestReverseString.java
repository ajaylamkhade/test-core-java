package javarunner.core.string;

public class TestReverseString {

    public static void main(String[] args) {

        String str = "My Name is Dhawal";

        String rev=" ";

        for (String str1 : str.split(" ")){

             rev = str1 + " "+rev;

        }

        System.out.println("reverse string : "+rev );


    }
}
