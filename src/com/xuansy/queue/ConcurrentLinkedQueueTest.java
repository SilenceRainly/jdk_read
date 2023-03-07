package com.xuansy.queue;

import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * @author SilenceShine
 * @since 1.0
 */
public class ConcurrentLinkedQueueTest {

    public static void main(String[] args) {
        ConcurrentLinkedQueue<Object> queue = new ConcurrentLinkedQueue<>();
        queue.offer("111");

    }

}
