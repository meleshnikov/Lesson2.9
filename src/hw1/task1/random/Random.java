package hw1.task1.random;


import hw1.task1.Person;
import hw1.task1.PhoneNumber;

public final class Random {

    private static final java.util.Random random = new java.util.Random();

    public static Person generatePerson() {
        String name, surname;
        if (random.nextBoolean()) {
            name = getRandomName(Names.getMaleFirstNames());
            surname = getRandomName(Names.getMaleLastNames());
        } else {
            name = getRandomName(Names.getFemaleFirstNames());
            surname = getRandomName(Names.getFemaleLastNames());
        }
        return new Person(name, surname);
    }

    public static PhoneNumber generateNumber() {
        StringBuilder sb = new StringBuilder("+7");
        for (int i = 0; i < 10; i++) {
            sb.append(randomInt(0, 9));
        }
        return new PhoneNumber(sb.toString());
    }

    private static int randomInt(int min, int max) {
        max++;
        max -= min;
        return random.nextInt(max) + min;
    }

    private static String getRandomName(String[] names) {
        int index = randomInt(0, names.length - 1);
        return names[index];
    }
}
