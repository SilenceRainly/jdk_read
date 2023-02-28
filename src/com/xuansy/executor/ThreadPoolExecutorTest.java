package com.xuansy.executor;

import java.util.concurrent.*;

/**
 * @author : xuansy
 * @version : 1.0
 * @email : 1292798418@qq.com
 * @date : 2023/2/21 13:34
 * @project_name : jdk1.8
 * @package_name : com.xuansy.executor
 * @name : ThreadPoolExecutorTest
 * @description :
 */
public class ThreadPoolExecutorTest {

    public static void main(String[] args) {
        int corePoolSize = 1;
        int maximumPoolSize = 2;
        long keepAliveTime = 30L;
        TimeUnit unit = TimeUnit.SECONDS;
        BlockingQueue<Runnable> workQueue = new LinkedBlockingQueue<>();
        ThreadFactory threadFactory = r -> {
            Thread thread = new Thread(r);
            thread.setName("r");
            return thread;
        };
        RejectedExecutionHandler handler = (r, executor) -> {

        };

        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                corePoolSize,
                maximumPoolSize,
                keepAliveTime,
                unit,
                workQueue,
                threadFactory,
                handler
        );

        /*
         * 线程状态
         *     public static Thread.State toThreadState(int var0) {
         *         if ((var0 & 4) != 0) {
         *             return State.RUNNABLE;       // 运行中 & 4
         *         } else if ((var0 & 1024) != 0) {
         *             return State.BLOCKED;        // 阻塞   & 1024
         *         } else if ((var0 & 16) != 0) {
         *             return State.WAITING;        // 等待   & 16
         *         } else if ((var0 & 32) != 0) {
         *             return State.TIMED_WAITING;  // 等待   & 32
         *         } else if ((var0 & 2) != 0) {
         *             return State.TERMINATED;     // 终止   & 2
         *         } else {
         *             return (var0 & 1) == 0 ? State.NEW : State.RUNNABLE;  // 初始   运行中
         *         }
         *     }
         */
        executor.execute(new Runnable() {
            @Override
            public void run() {

            }
        });

        executor.submit(new Runnable() {
            @Override
            public void run() {

            }
        });

    }

}
