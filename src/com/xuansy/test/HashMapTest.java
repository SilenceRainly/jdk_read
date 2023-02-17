package com.xuansy.test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : xuansy
 * @version : 1.0
 * @email : 1292798418@qq.com
 * @date : 2023/2/17 14:33
 * @project_name : jdk1.8
 * @package_name : com.xuansy.test
 * @name : HashMapTest
 * @description :
 */
public class HashMapTest {

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>(3);
        for (int i = 0; i < 12; i++) {
            map.put(i, i);
        }
        map.put(1000130, null);
        map.put(1000130, null);
    }

}
