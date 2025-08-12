package thread.start;

public class BadHelloThreadMain {
    public static void main(String[] args) {
        //  public static void main(String[] args) -> X
        // JVM이 프로그램 시작할 때 자동으로 만든 메인 스레드
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName() + ": main() start");

        HelloThread helloThread = new HelloThread();
        System.out.println(Thread.currentThread().getName() + ": start() 호출 전");
        helloThread.run();
        System.out.println(Thread.currentThread().getName() + ": start() 호출 후");

        System.out.println(thread.getName() + ": main() end");


    }
}
