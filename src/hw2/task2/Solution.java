package hw2.task2;

import java.util.LinkedHashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Map<Integer, String> map = new LinkedHashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(i, String.valueOf(i * i));
        }
        System.out.println(map);
    }
}
