package Numbers;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestDigitAString {

    public static int secondLargest(String s) {
        String[] splitInts = s.replaceAll("[^0-9]", "").split("");
        if (splitInts[0].isEmpty()) {return -1;}
        int[] ints = Arrays.stream(splitInts)
                .mapToInt(Integer::parseInt)
                .sorted()
                .distinct()
                .toArray();

        return ints.length > 1 ? ints[1] : -1;
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(secondLargest(s.nextLine()));
    }
}