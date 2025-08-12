package thread.start;

public class HelloThreadMain {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName() + ": main() start");
    }
}
