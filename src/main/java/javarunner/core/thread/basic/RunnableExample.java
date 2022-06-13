package javarunner.core.thread.basic;

public class RunnableExample  implements Runnable{

    @Override
    public void run() {
        System.out.println("Hello From Runnable!");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new RunnableExample());
        thread.start();

    }
}
