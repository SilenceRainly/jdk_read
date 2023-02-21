package com.xuansy.map;

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
        Map<String, String> map = new HashMap<>(2);
        map.put("5", "5");
        map.get("5");
        System.out.println(map);
    }

}
