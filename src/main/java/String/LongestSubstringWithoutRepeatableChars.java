package String;

import java.util.Scanner;

public class LongestSubstringWithoutRepeatableChars {

    public static int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) {return 0;}

        String longestSubString = String.valueOf(s.charAt(0));

        for (int i = 0; i < s.length() - 1; i++) {
            StringBuilder currentSubstring = new StringBuilder().append(s.charAt(i));
            nextSubstring:
            for (int j = i + 1; j < s.length(); j++) {
                char c = s.charAt(j);
                for (int k = 0; k < currentSubstring.length(); k++) {
                    if (c == currentSubstring.charAt(k)) {
                        if (longestSubString.length() < currentSubstring.length()) {
                            longestSubString = currentSubstring.toString();
                        }
                        break nextSubstring;
                    }
                }
                currentSubstring.append(c);
                if (longestSubString.length() < currentSubstring.length()) {
                    longestSubString = currentSubstring.toString();
                }
            }
        }
        System.out.println(longestSubString);
        return longestSubString.length();
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(lengthOfLongestSubstring(s.nextLine()));
    }

}
