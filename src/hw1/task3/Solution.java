package hw1.task3;

import hw1.task3.exception.ValueExistsInMapException;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    private static void add(Map<String, Integer> map, String key, Integer value) throws ValueExistsInMapException {
        if (value.equals(map.get(key))) {
            throw new ValueExistsInMapException("ключ - " + key + "; Значение - " + value + " уже есть в Map");
        } else {
            map.put(key, value);
        }
    }

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("str1", 2);
        System.out.println(map);
        try {
            add(map, "str2", 1);
            add(map, "str1", 5);
            System.out.println(map);
            add(map, "str1", 2);
            add(map, "str1", 2);
            add(map, "str1", 3);
        } catch (ValueExistsInMapException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(map);
    }
}
