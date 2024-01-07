package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> map = new HashMap<>();

        sentence = sentence.toLowerCase().replaceAll(",","").replaceAll("\\.", "");
        String[] arr = sentence.split(" ");
        if (!sentence.isEmpty()){
            for (String str : arr) {
                if (!map.containsKey(str)) {
                    map.put(str, 1);
                } else {
                    map.put(str, map.get(str) + 1);
                }
            }
        }

        return map;
    }
}

