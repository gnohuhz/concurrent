package org.laohong.concurrent.test;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Test39 {
    public static void main(String[] args) {

    }

    /**
     * 函数式编程
     * Supplier 提供者 无中生有 ()->结果
     * Function 函数 一个参数一个结果 (参数)->结果
     * BitFunction (参数1, 参数2)->结果
     * Consumer 消费者 一个参数没结果 (参数)->void
     * BiConsumer   (参数1, 参数2)->void
     */

    /**
     *
     * @param arraySupplier
     * @param lengthFun
     * @param putConsumer
     * @param printConsumer
     * @param <T>
     */
    private static <T> void demo(
            Supplier<T> arraySupplier,
            Function<T, Integer> lengthFun,
            BiConsumer<T, Integer> putConsumer,
            Consumer<T> printConsumer){

    }
}
