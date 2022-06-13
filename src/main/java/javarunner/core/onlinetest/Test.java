package javarunner.core.onlinetest;

public class Test<T> {

    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        Test obj = new Test();
        obj.setT("demo");
        obj.setT(10);
        obj.setT("%");
        System.out.println(obj.getT());
    }

}
