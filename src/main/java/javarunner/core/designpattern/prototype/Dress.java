package javarunner.core.designpattern.prototype;

/**
 * Assume you’re in a clothing store that offers T-shirts and denim.
 * Each time a customer places an order, a new Dress object should be created.
 * If creating a dress object from scratch each time is too expensive and time-consuming,
 * we can clone a source object instead
 */
public class Dress implements  Cloneable{
private int quantity=0;
private double unitPrice=0.0;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double calculateBill(){
        return unitPrice*quantity;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    @Override
    public String toString() {
        return "Dress{" +
                "quantity=" + quantity +
                ", unitPrice=" + unitPrice +
                '}';
    }
}
