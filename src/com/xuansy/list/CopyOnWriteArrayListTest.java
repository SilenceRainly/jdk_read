package com.xuansy.list;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author SilenceShine
 * @since 1.0
 */
public class CopyOnWriteArrayListTest {

    public static void main(String[] args) {
        List<Object> list = new CopyOnWriteArrayList<>();
        list.add("string");
        System.out.println(list);
    }

}
