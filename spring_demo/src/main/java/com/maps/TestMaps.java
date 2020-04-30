package com.maps;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class TestMaps {

    static ConcurrentHashMap<String, String> maps = new ConcurrentHashMap<>(8);

    static HashMap<String, String> stringHashMap = new HashMap<>(4);

    public static void main(String[] args) {
        maps.put("asd","222");
        maps.put("qwe","222");
        maps.put("qwe","111");
    }
}
