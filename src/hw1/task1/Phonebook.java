package hw1.task1;

import hw1.task1.random.Random;

import java.util.HashMap;
import java.util.Map;

public class Phonebook {

    private static final Map<Person, PhoneNumber> numbers = new HashMap<>();

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            numbers.put(Random.generatePerson(), Random.generateNumber());
        }
        printMap(numbers);
    }

    private static <K, V> void printMap(Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
