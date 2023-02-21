package com.xuansy.map;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author : xuansy
 * @version : 1.0
 * @email : 1292798418@qq.com
 * @date : 2023/2/20 16:36
 * @project_name : jdk1.8
 * @package_name : com.xuansy.test
 * @name : ConcurrentHashMapTest
 * @description :
 */
public class ConcurrentHashMapTest {

    public static void main(String[] args) {
        Map<String, String> map = new ConcurrentHashMap<>(2);
        map.put("5", "5");
        map.get("5");
        System.out.println(map);
    }

}
