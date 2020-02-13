package Threading;

public class ThreadMain {
    public static void main(String[] args) {
        ThreadExample thread1 = new ThreadExample();
        //thread1.start();

        ThreadExample thread2 = new ThreadExample();
        //thread2.start();

        Thread thread3 = new Thread(new RunnableExample());
        thread3.start();

        Thread thread4 = new Thread(() -> {
            //Lambda used in runnable interface
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " " + Thread.currentThread().getName());
            }
        });

        thread4.start();

    }
}
