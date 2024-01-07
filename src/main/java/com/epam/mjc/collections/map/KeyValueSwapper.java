package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> map = new HashMap<>();

        Set<Integer> set = sourceMap.keySet();
        for (Integer key : set) {
            map.putIfAbsent(sourceMap.get(key), key);
            map.compute(sourceMap.get(key), (k, v) -> (key < v) ? key : v);
        }

        return map;
    }
}
