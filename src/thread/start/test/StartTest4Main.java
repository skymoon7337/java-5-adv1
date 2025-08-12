package thread.start.test;

import static util.MyLogger.log;

public class StartTest4Main {
    public static void main(String[] args) {
        Thread threadA = new Thread(new printAlphabet("A",1000),"Thread-A");
        Thread threadB = new Thread(new printAlphabet("B",500),"Thread-B");

        threadA.start();
        threadB.start();


    }

    static class printAlphabet implements Runnable{
        private String alphabet;
        private int second;

        public printAlphabet(String alphabet, int second) {
            this.alphabet = alphabet;
            this.second = second;
        }


        @Override
        public void run() {
            while(true){
                log(alphabet);
                try {
                    Thread.sleep(this.second);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
