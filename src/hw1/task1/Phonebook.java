package hw1.task1;

import java.util.HashMap;
import java.util.Map;

public class Phonebook {

    private static final Map<String, String> numbers = new HashMap<>();

    public static void main(String[] args) {
        numbers.put("Иван Иванов", "+79776122234");
        numbers.put("Петр Семенов", "+797761324235");
        numbers.put("Федор Васильев", "+79324612223");
        numbers.put("Василий Петров", "+7324612223");
        numbers.put("Андрей Андреев", "+7345612223");
        numbers.put("Ольга Иванова", "+7973612223");
        numbers.put("Анна Сидорова", "+7897612223");
        numbers.put("Катя Макарова", "+789567612223");
        numbers.put("Таня Соловьева", "+78946612223");
        numbers.put("Александр Александоров", "+79845612223");
        numbers.put("Алексей Левашов", "+7977612454");
        numbers.put("Максим Борисов", "+8977612223");
        numbers.put("Денис Дорохов", "89977612223");
        numbers.put("Алиса Харрис", "84977612223");
        numbers.put("Лена Головач", "+73577612223");
        numbers.put("Павел Павлов", "853977612223");
        numbers.put("Кирилл Горелов", "88977642223");
        numbers.put("Роман Романов", "+7977645223");
        numbers.put("Семен Семенов", "+7965645223");
        numbers.put("Зураб Васильев", "84577612223");
        System.out.println(numbers);
    }
}
