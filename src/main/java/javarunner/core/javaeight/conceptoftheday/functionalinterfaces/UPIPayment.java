package javarunner.core.javaeight.conceptoftheday.functionalinterfaces;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;


@FunctionalInterface
public interface UPIPayment{

    void doPayment(int amt);
    default double getCoupon(){
        return new Random().nextDouble();
    }
    //like a utility method used commonly across your application where it implements UPIPayment interface
    static String datePattern(String pattern){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        return simpleDateFormat.format(new Date());
    }
}
