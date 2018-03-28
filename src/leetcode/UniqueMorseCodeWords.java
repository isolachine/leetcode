package leetcode;

import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCodeWords {
    String[] codes = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };

    public int uniqueMorseRepresentations(String[] words) {
        Set<String> uniqueCodes = new HashSet<>();
        for (String string : words) {
            String code = "";
            for (char c : string.toCharArray()) {
                code += codes[c - 97];
            }
            uniqueCodes.add(code);
        }
        return uniqueCodes.size();
    }

    public static void main(String[] args) {
        System.out.println(new UniqueMorseCodeWords().uniqueMorseRepresentations(new String[] { "gqq", "qweq", "gig", "gdfd" }));
    }

}
