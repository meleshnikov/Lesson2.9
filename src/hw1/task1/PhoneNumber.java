package hw1.task1;

public class PhoneNumber {

    private final String number;

    public PhoneNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return getNumber();
    }
}
