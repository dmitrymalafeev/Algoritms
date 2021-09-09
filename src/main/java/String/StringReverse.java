package String;

import java.util.Scanner;

public class StringReverse {
    public static String FirstReverse(String str) {
        StringBuilder builder = new StringBuilder(str);
        builder.reverse();
        return builder.toString();
    }

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(FirstReverse(s.nextLine()));
    }
}
