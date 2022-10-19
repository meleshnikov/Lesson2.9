package hw2.task1;

import java.util.*;

public class Solution {

    private static final Random random = new Random();
    private static final int LIST_SIZE = 3;

    public static void main(String[] args) {
        Map<String, List<Integer>> map = generateMap("string", 0, 1000, 5);
        Map<String, Integer> newMap = transform(map);
        printMap(map);
        System.out.println();
        printMap(newMap);
    }

    private static List<Integer> generateList(int from, int to, int size) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(randomInt(from, to));
        }
        return list;
    }

    private static Map<String, List<Integer>> generateMap(String key, int from, int to, int size) {
        int n = 0;
        Map<String, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < size; i++) {
            map.put(String.format("%s%d", key, ++n), generateList(from, to, LIST_SIZE));
        }
        return map;
    }

    private static Map<String, Integer> transform(Map<String, List<Integer>> map) {
        Map<String, Integer> transformedMap = new HashMap<>();
        for (Map.Entry<String, List<Integer>> entry : map.entrySet()) {
            transformedMap.put(entry.getKey(), sum(entry.getValue()));
        }
        return transformedMap;
    }

    private static int sum(Collection<Integer> values) {
        int sum = 0;
        for (Integer v : values) {
            sum += v;
        }
        return sum;
    }

    private static <V> void printMap(Map<String, V> map) {
        for (Map.Entry<String, V> entry : map.entrySet()) {
            System.out.printf("%s -> ", entry.getKey());
            System.out.println(entry.getValue());
        }
    }

    private static int randomInt(int from, int to) {
        ++to;
        to -= from;
        return random.nextInt(to) + from;
    }

}
