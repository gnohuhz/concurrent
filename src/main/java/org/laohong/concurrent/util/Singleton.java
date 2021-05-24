package org.laohong.concurrent.util;

public final class Singleton {
    private Singleton() {}
    private static Singleton INSTANCE = null;

    public static Singleton getInstance() {
        // 首次访问会同步，而实例化之后的使用不会进入synchronized
        if (INSTANCE == null) {
            synchronized (Singleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton();
                }
            }
        }
        return INSTANCE;
    }
}
