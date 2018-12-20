package leetcode;

import java.util.HashMap;
import java.util.Map;

public class VerifyingAnAlienDictionary {
    public static void main(String[] args) {
        String[] words = new String[] { "word", "world", "row" };
        String order = "worldabcefghijkmnpqstuvxyz";
        System.out.println(isAlienSorted(words, order));

        String[] words1 = new String[] { "hello", "leetcode" };
        String order1 = "hlabcdefgijkmnopqrstuvwxyz";
        System.out.println(isAlienSorted(words1, order1));

        String[] words2 = new String[] { "apple", "app" };
        String order2 = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(isAlienSorted(words2, order2));
    }

    public static boolean isAlienSorted(String[] words, String order) {
        if (words.length == 1) {
            return true;
        }
        Map<Character, Integer> lex = new HashMap<>();
        for (int i = 0; i < order.length(); i++) {
            char c = order.charAt(i);
            lex.put(c, i);
        }

        int current = 1;
        while (current != words.length) {
            boolean samePre = true;
            for (int i = 0; i < words[current].length() && i < words[current - 1].length(); i++) {
                if (lex.get(words[current].charAt(i)) < lex.get(words[current - 1].charAt(i))) {
                    samePre = false;
                    return false;
                } else if (lex.get(words[current].charAt(i)) > lex.get(words[current - 1].charAt(i))) {
                    samePre = false;
                    break;
                } else {
                    continue;
                }
            }
            if (samePre && words[current].length() < words[current - 1].length()) {
                return false;
            }
            current++;
        }

        return true;
    }
}
