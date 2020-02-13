package Threading;

public class RunnableExample implements Runnable {
    //If class extends thread class it cannot extend any other class
    //Only extend one class, runnable can extend other class
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i+" " + Thread.currentThread().getName());
        }
    }
}
