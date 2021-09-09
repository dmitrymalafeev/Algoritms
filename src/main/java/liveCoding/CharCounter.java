package liveCoding;

import java.util.Map;

public class CharCounter {

    public static String countingChars(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{");
        Character currentEl = s.charAt(0);
        Integer counter = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == currentEl) {
                counter++;
            } else {
                stringBuilder.append(currentEl + ":" + counter + ", ");
                counter = 1;
                currentEl = s.charAt(i);
            }
        }
        stringBuilder.append(currentEl + ":" + counter + "}");
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(countingChars("XXXXYYZZZX"));
    }

}
