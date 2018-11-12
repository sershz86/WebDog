package utils;

public class Counter {
    private static int count = 0;

    public Counter() {
    }

    public static int getCount() {
        return count != 0 ? ++count : count++;
    }
}
