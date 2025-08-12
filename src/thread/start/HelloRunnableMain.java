package thread.start;

public class HelloRunnableMain {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+": run()");

        HelloRunnable Hellorunnable = new HelloRunnable();
        Thread thread = new Thread(Hellorunnable);
        thread.start();

        System.out.println(Thread.currentThread().getName()+": run()");

    }
}
