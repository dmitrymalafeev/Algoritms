package mainAlgoritms;

import java.util.Scanner;

public class BinarySearch {

    public static Integer searchItem(int[] array, int item) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = array[mid];
            if (guess == item) {
                return mid;
            }
            if (guess > item) {
                high = mid - 1;
            }
            if (guess < item) {
                low = mid + 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(searchItem(new int[]{1, 5, 6, 45, 89, 300, 1234, 1456}, Integer.parseInt(scanner.nextLine())));
    }

}
