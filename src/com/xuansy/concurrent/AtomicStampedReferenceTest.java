package com.xuansy.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicStampedReference;

/**
 * @author : xuansy
 * @version : 1.0
 * @email : 1292798418@qq.com
 * @date : 2023/2/24 15:39
 * @project_name : jdk1.8
 * @package_name : com.xuansy.concurrent
 * @name : AtomicStampedReferenceTest
 * @description :
 */
public class AtomicStampedReferenceTest {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        //版本号默认是1，主内存的值是100
        AtomicStampedReference<Integer> reference = new AtomicStampedReference<>(100, 1);
        //创建线程a
        executorService.submit(() -> {
            int tamp = reference.getStamp();//初始版本号
            System.out.println(Thread.currentThread().getName() + "第一次版本号为： " + tamp);
            //暂停一秒，让b线程读取初始版本号
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //让a线程进行一次ABA操作
            reference.compareAndSet(100, 101, reference.getStamp(), reference.getStamp() + 1);
            System.out.println(Thread.currentThread().getName() + "第二次版本号为： " + reference.getStamp());
            //在将2019改回100，版本号+1
            reference.compareAndSet(101, 100, reference.getStamp(), reference.getStamp() + 1);
            System.out.println(Thread.currentThread().getName() + "第三次版本号为： " + reference.getStamp());
        }, "a");
        //创建线程b
        executorService.submit(() -> {
            int tamp = reference.getStamp();//初始版本号
            //暂停4秒，让a线程进行一次ABA操作
            try {
                TimeUnit.SECONDS.sleep(4);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "第一次版本号为： " + tamp);
            //b线程进行值的修改,版本号+1
            reference.compareAndSet(100, 2019, tamp, reference.getStamp() + 1);
            System.out.println(Thread.currentThread().getName() + "第二次版本号为： " + reference.getStamp());
            System.out.println(reference.getReference());
        }, "b");
    }
}
