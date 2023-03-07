package com.xuansy.queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @author SilenceShine
 * @since 1.0
 */
public class ArrayBlockingQueueTest {

    public static void main(String[] args) {
        BlockingQueue<String> queue = new ArrayBlockingQueue<>(1);
        queue.offer("111");
        queue.poll();
    }

}
