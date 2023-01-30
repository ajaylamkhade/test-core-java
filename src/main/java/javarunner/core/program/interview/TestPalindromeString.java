package javarunner.core.program.interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

public class TestPalindromeString {

    public static void main(String[] args) {
        String original="";
        String subString="";
        //Scanner in = new Scanner(System.in);
        //original= in.nextLine();
        String [] arrayOfString = {"banana" , "malayalam" ,"agile"};
        for (int i=0; i <arrayOfString.length;i++){
            //System.out.println(arrayOfString[i]);
            if(isPalindromeString(arrayOfString[i])){
                System.out.println(arrayOfString[i] +" is palindrome!");
            }else {
                System.out.println(arrayOfString[i] +" is NOT palindrome!");
            }

        }
    }

    private static boolean isPalindromeString(String original){
        String reverse ="";
        for (int i=original.length()-1;i>=0;i--){
            reverse= reverse+original.charAt(i);
        }

        if (original.equals(reverse)){
            return true;
        }else {
            return false;
        }

    }

}
