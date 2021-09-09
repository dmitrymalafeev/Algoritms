package Numbers;

import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class RomanToIntParser {

    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        char current = s.charAt(0);
        char prev;
        int result = 0;
        result = result + map.get(current);

        for (int i = 1; i < s.length(); i++) {
            current = s.charAt(i);
            prev = s.charAt(i - 1);
            int a = map.get(current);
            int b = map.get(prev);
            if (a > b) {
                result = result - b + (a - b);
            } else
                result = result + a;
        }
        return result;
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(romanToInt(s.nextLine()));
    }
}
