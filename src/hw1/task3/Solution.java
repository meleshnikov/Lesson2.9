package hw1.task3;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    private static void add(Map<String, Integer> map, String key, Integer value) {
        if (value.equals(map.put(key, value))) {
            throw new IllegalArgumentException("ключ - " + key + "; Значение - " + value + " уже есть в Map");
        }
    }

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("str1", 2);
        System.out.println(map);
        add(map, "str2", 1);
        add(map, "str1", 5);
        System.out.println(map);
        add(map, "str1", 2);
        add(map, "str1", 2);
    }
}
