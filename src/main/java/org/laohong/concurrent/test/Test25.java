package org.laohong.concurrent.test;

import java.util.concurrent.TimeUnit;

public class Test25 {
//    static volatile boolean run = true;
//    public static void main(String[] args) throws InterruptedException {
//        Thread t = new Thread(() -> {
//            while (run) {
//                // do something
//            }
//        });
//        t.start();
//        TimeUnit.SECONDS.sleep(1);
//        run = false; //线程 t 会不会停下来？
//    }

    static boolean run = true;
    final static Object lock = new Object();
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            while (true) {
                synchronized (lock) {
                    if (!run) {
                        break;
                    }
                }
                // do something
            }
        });
        t.start();
        TimeUnit.SECONDS.sleep(1);

        synchronized (lock) {
            run = false;
        }
    }
}
