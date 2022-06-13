package javarunner.core.javaeight.conceptoftheday.functionalinterfaces;

public class AmazonPay implements UPIPayment{
    @Override
    public void doPayment(int amt) {
        String txnDate =UPIPayment.datePattern("yyyy-MM-dd");
    }
}
