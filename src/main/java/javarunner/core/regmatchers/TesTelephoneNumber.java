package javarunner.core.regmatchers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TesTelephoneNumber {

    private static Pattern phoneNumberPattern = Pattern.compile("[^/0-9]");
    public static void main(String[] args) {

        String telephoneNumber="0497/630844";
        Matcher phoneNumberMatcher	= phoneNumberPattern.matcher(telephoneNumber.trim());
        if (!phoneNumberMatcher.find()) {
            System.out.println(telephoneNumber +" is valid");
        }
    }
}
