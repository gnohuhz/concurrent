package org.laohong.concurrent.test1;

import java.io.Serializable;

// 1、为什么加final：防止子类重写方法不安全
// 2、如果实现了序列化接口，还要做什么来防止反序列化破环单例：加 readResolve() 方法即可
public final class Singleton implements Serializable {
    // 3、为什么设置为私有，是否能防止反射创建薪得实例：如果设为public则其他类可以无限创建它的实例
    private Singleton() {}
    // 4、这样初始化是否能保证单例对象创建时的线程安全：可以保证，静态成员变量的初始化操作是在类加载阶段完成的，由jvm保证它的线程安全
    private static final Singleton INSTANCE = new Singleton();
    // 5、为什么提供静态方法而不是直接将INSTANCE设置为public：提供更好的封装性，内部可以实现懒惰的初始化等更多功能，还可以支持泛型
    public static Singleton getInstance() {
        return INSTANCE;
    }

    public Object readResolve(){
        return INSTANCE;
    }
}
