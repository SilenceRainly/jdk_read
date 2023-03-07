package com.xuansy.lock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author SilenceShine
 * @since 1.0
 */
public class ReentrantReadWriteLockTest {

    public static void main(String[] args) {
        ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
        ReentrantReadWriteLock.ReadLock readLock = readWriteLock.readLock();
        ReentrantReadWriteLock.WriteLock writeLock = readWriteLock.writeLock();
        readLock.lock();
        writeLock.lock();
    }

}
