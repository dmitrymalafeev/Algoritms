package Numbers;

import java.util.Scanner;

public class IntToRomanParser {

    private static final int[] intValues = new int[] {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
    private static final String[] romanValues = new String[] {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};

    public static String intToRoman(int arabNum) {
        StringBuilder result = new StringBuilder();
        for (int i = intValues.length - 1; i >= 0; i--) {
            while(arabNum >= intValues[i]) {
                arabNum -= intValues[i];
                result.append(romanValues[i]);
            }
        }
        return result.toString();
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(intToRoman(Integer.parseInt(s.nextLine())));
    }
}
