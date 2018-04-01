/**
 * 
 */
package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Isolachine
 *
 */
public class PalindromePermutation {
    public boolean canPermutePalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int palindrome = 0;
        for (Integer count : map.values())
            if (count % 2 == 1)
                palindrome++;
        return palindrome <= 1;
    }

    public static void main(String[] args) {
        System.out.println(new PalindromePermutation().canPermutePalindrome("code"));
        System.out.println(new PalindromePermutation().canPermutePalindrome("aab"));
        System.out.println(new PalindromePermutation().canPermutePalindrome("carerac"));
    }
}
