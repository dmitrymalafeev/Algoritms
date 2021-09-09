package Numbers;

import java.util.Arrays;
import java.util.stream.Stream;

public class Ints {

    public static void ints(int[] ints) {
        Arrays.stream(ints).forEach(x -> {
            if ((x % 3 == 0) && (x % 5 == 0)) {
                System.out.println("hello world");
            } else if (x % 3 == 0) {
                System.out.println("hello");
            } else if (x % 5 == 0) {
                System.out.println("world");
            }
        });
    }

    public static void main(String[] args) {
        ints(new int[]{3, 5, 2, 5, 15});
    }

}
