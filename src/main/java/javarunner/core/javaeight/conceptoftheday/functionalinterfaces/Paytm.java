package javarunner.core.javaeight.conceptoftheday.functionalinterfaces;

public class Paytm implements UPIPayment{
    @Override
    public void doPayment(int amt) {
        String txnDate =UPIPayment.datePattern("yyyy-MM-dd");
    }

    @Override
    public double getCoupon() {
        return UPIPayment.super.getCoupon();
    }
}
