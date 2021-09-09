package liveCoding;

//unfinished
public class MinValue {

    public static int findMinResult(int[] array) {
        int max = array[0];
        int min1 = array[0];
        int indexMin1 = 0;
        int indexMax = 0;

        int min2;

        for (int i = 1; i < array.length; i++) {
            if (min1 > array[i]) {
                min1 = array[i];
                indexMin1 = i;
            }
            if (max < array[i]) {
                max = array[i];
                indexMax = i;

            }
        }

        if (max > 0 & min1 < 0) {
            return max * min1;
        }



        if (max < 0) {
            for (int i = 0; i < array[i]; i++) {
                if (min1 < array[i] && indexMax != i) {
                    min1 = array[i];
                }
            }
            return max * min1;
        }

        if (min1 > 0) {
            for (int i = 0; i < array.length; i++) {
                if (max < array[i] && indexMin1 != i) {
                    max = array[i];
                }
            }
            return max * min1;
        }

        return min1 * max;
    }

    public static void main(String[] args) {
        System.out.println(findMinResult(new int[] {-1, -5, -6, 4, 6 }));
        System.out.println(findMinResult(new int[] {1, 5, 6, 4, 6 }));
        System.out.println(findMinResult(new int[] {-1, -5, -6, -4, -6 }));
    }

}
