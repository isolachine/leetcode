/**
 * 
 */
package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Isolachine
 *
 */
public class GoatLatin {
    public String toGoatLatin(String S) {
        Set<Character> vowel = new HashSet<>();
        for (char c : new char[] { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' }) {
            vowel.add(c);
        }
        String[] words = S.split(" ");
        StringBuffer sb = new StringBuffer();
        int i = 1;
        for (String word : words) {
            if (!vowel.contains(word.charAt(0))) {
                word = word.substring(1) + word.charAt(0);
            }
            sb.append(word);
            sb.append("ma");
            for (int j = 0; j < i; j++) {
                sb.append('a');
            }
            sb.append(' ');
            i++;
        }
        return sb.toString().substring(0, sb.length() - 1);
    }

    public static void main(String[] args) {
        String string = "The quick brown fox jumped over the lazy dog";
        System.out.println(new GoatLatin().toGoatLatin(string));
    }
}
