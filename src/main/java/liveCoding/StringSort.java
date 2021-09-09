package liveCoding;

import java.util.stream.Collector;

public class StringSort {

    public static void main(String[] args) {
        System.out.println(stringSort("AAAbbBaaB"));
    }

    public static String stringSort(String s) {
        return s.chars().mapToObj(i -> (char) i)
                .sorted((c1, c2) -> {
                    Character let1 = Character.toLowerCase(c1);
                    Character let2 = Character.toLowerCase(c2);
                    if (let1.compareTo(let2) == 0) {
                        return c1.compareTo(c2);
                    } else {
                        return let1.compareTo(let2);
                    }
                })
                .collect(Collector.of(
                        StringBuilder::new,
                        StringBuilder::append,
                        StringBuilder::append,
                        StringBuilder::toString));
    }

}
