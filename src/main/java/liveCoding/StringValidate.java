package liveCoding;

import java.util.*;

public class StringValidate {

    private static final Map<Character, Character> map = new HashMap<>();

    static {
        map.put('{', '}');
        map.put('(', ')');
        map.put('[', ']');
    }

    public static boolean stringValidate(String s) {

        Deque<Character> characters = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            if (isOpen(s.charAt(i))) {
                characters.push(s.charAt(i));
            }
            if (isClose(s.charAt(i))) {
                if (characters.isEmpty()) {
                    return false;
                }
                Character c = characters.peek();
                if (isClosedSymbolFor(c, s.charAt(i))) {
                    characters.pop();
                } else {
                    return false;
                }
            }
        }
        return characters.isEmpty();
    }

    private static boolean isClose(char c) {
        return map.containsValue(c);
    }

    private static boolean isOpen(char c) {
        return map.containsKey(c);
    }

    private static boolean isClosedSymbolFor(char open, char closed) {
        if (map.get(open).equals(closed)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(stringValidate("()())"));
    }
}
