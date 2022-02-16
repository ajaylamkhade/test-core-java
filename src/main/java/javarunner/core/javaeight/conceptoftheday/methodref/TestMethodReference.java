package javarunner.core.javaeight.conceptoftheday.methodref;

import java.util.Locale;
import java.util.function.Function;

public class TestMethodReference {

    public static void main(String[] args) {

        Function<String ,Integer> stringIntegerFunction = (String s) -> Integer.parseInt(s);
        System.out.println(stringIntegerFunction.apply("19"));

        //do the above step using method refernce syntax in java 8
        Function<String ,Integer> stringIntegerFunctionMethRef = Integer ::parseInt;
        System.out.println(stringIntegerFunctionMethRef.apply("11"));

        //calling toLowerCase method using lambda
        Function<String ,String> stringLowerCaseFunctionlambda = (String s) -> s.toLowerCase();
        System.out.println(stringLowerCaseFunctionlambda.apply("JAVA!"));
        //calling toLowerCase method using method reference

        Function<String ,String> stringLowerCaseFunctionMethRef = String::toLowerCase;
        System.out.println(stringLowerCaseFunctionMethRef.apply("CAP!"));


    }

}
