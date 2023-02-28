package com.xuansy.concurrent;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/**
 * @author SilenceShine
 * @since 1.0
 */
public class FutureTaskTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<String> futureTask = new FutureTask<>(() -> {
            System.out.println(Thread.currentThread().getName() + " 测试callable");
            TimeUnit.SECONDS.sleep(4);
            return "success";
        });
        new Thread(futureTask, "A").start();
        // 启动两次无用 因为state已经是处理过了的
        new Thread(futureTask, "B").start();
        System.out.println(Thread.currentThread().getName() + "测试，在调用future.get()方法之前，可以执行其他逻辑 ");
        System.out.println(futureTask.get());
        System.out.println("测试futureTask的get方法阻塞");
    }

}
