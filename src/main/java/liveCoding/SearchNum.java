package liveCoding;

import java.util.*;
import java.util.stream.Collectors;

public class SearchNum {

    public static <T> T searchNum(Collection<T> array) {
        HashMap<T, Integer> hashMap = new HashMap<>();
        for (T o : array) {
            hashMap.merge(o, 1, (x, y) -> x + y);
        }
        Integer valueMax = 0;
        T key = null;
        for (Map.Entry<T, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() > valueMax) {
                valueMax = entry.getValue();
                key = entry.getKey();
            }
        }
        return key;
    }

    private static int[] generateArray(int maxValue) {
        Random rnd = new Random();
        int indexLimit = maxValue + 1;
        int[] array = new int[indexLimit];
        for (int i = 1; i <= maxValue; ++i) {
            int index = getEmptyIndex(rnd, indexLimit, array);
            array[index] = i;
        }
        int lastIndex = getEmptyIndex(rnd, indexLimit, array);
        array[lastIndex] = rnd.nextInt(maxValue) + 1;
        return array;
    }

    private static int getEmptyIndex(Random rnd, int max, int[] array) {
        int index;
        do {
            index = rnd.nextInt(max);
        } while (array[index] != 0);
        return index;
    }

    public static void main(String[] args) {
        int [] array = generateArray(100);
        List<Integer> integers = Arrays.asList(1, 2, 4, 6, 7, 9, 2);

        System.out.println(searchNum(integers));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

}
