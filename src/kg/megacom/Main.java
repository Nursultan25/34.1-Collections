package kg.megacom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        Collections.addAll(list, getSecondsInMonth(), getSecondsInMinute(), getSecondsInWeek(), getSecondsInDay(), getSecondsInHour());
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        System.out.println(Collections.binarySearch(list, getSecondsInHour()));

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

        Collections.rotate(list, 2);
        System.out.println(list);
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));

        Collections.fill(list, 42);
        System.out.println(list);
    }

    public static int getSecondsInMinute() {
        return 60;
    }

    public static int getSecondsInHour() {
        return 60 * 60;
    }

    public static int getSecondsInDay() {
        return 60 * 60 * 12;
    }

    public static int getSecondsInWeek() {
        return (60 * 60 * 12) * 7;
    }

    public static int getSecondsInMonth() {
        return (60 * 60 * 12) * 30;
    }
}
