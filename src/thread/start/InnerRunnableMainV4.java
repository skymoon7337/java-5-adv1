package thread.start;

import static util.MyLogger.log;

public class InnerRunnableMainV4 {
    public static void main(String[] args) {
        log("Main() start");

        // 람다
        Thread thread = new Thread(() -> log("run()"));
        thread.start();

        log("Main() end");
    }
}
