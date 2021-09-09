package String;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class LongestWordInString {

    public static String LongestWord(String sen) {
        sen = sen.replaceAll("[^A-z0-9 ]", "");
        return Arrays.stream(sen.split(" "))
                .sorted(Comparator.comparingInt(String::length).reversed())
                .findFirst()
                .get();
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(LongestWord(s.nextLine()));
    }

}