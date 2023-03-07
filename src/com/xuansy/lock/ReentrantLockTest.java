package com.xuansy.lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author SilenceShine
 * @since 1.0
 */
public class ReentrantLockTest {

    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        lock.lock();
        try {

        } finally {
            lock.unlock();
        }
    }

}
