package util;

import static util.MyLogger.*;

public class MyLoggerMain {
    public static void main(String[] args) {
        log("hello thread");
        MyLogger.log(123); // Alt Enter로 import static 가능
    }
}
