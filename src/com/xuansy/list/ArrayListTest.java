package com.xuansy.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SilenceShine
 * @since 1.0
 */
public class ArrayListTest {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add(0, "a");
        System.out.println(list);
    }

}
