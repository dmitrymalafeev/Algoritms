package Numbers;

import java.util.Scanner;

public class Factorial {
    public static int factorial(int num) {
        if (num == 0) {
            return 1;
        }
        return num * factorial(num - 1);
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(factorial(Integer.parseInt(s.nextLine())));
    }
}
