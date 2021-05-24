package org.laohong.concurrent.test2;

public final class Singleton {
    private Singleton() {}

    // 属于懒汉式。因为类加载就是懒汉式的
    private static class LazyHolder {
        static final Singleton INSTANCE = new Singleton();
    }
    // 在创建时是否有并发问题：类加载时由JVM保证线程安全
    public static Singleton getInstance() {
        return LazyHolder.INSTANCE;
    }
}
