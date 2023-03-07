package com.xuansy.map;

import java.util.concurrent.ConcurrentSkipListMap;

/**
 * @author SilenceShine
 * @since 1.0
 */
public class ConcurrentSkipListMapTest {

    public static void main(String[] args) {
        ConcurrentSkipListMap<Object, Object> map = new ConcurrentSkipListMap<>();
        map.put("1", "1");
        map.put("2", "1");
    }

}
