package leetcode;

import java.util.Arrays;

public class ValidAnagram {
    //For Unicode, sort and compare.
    public static boolean isAnagramUnicode(String s, String t) {
        if (s.length() == t.length()) {
            char[] sArr = s.toCharArray();
            Arrays.sort(sArr);
            char[] tArr = t.toCharArray();
            Arrays.sort(tArr);
            if (Arrays.equals(sArr, tArr)) {
                return true;
            }
            return false;
        } else {
            return false;
        }
    }
    
    //For alphabets,use hash table for O(n) time.
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        int[] mask = new int[256];
        for(char c : sArr) {
            mask[c]++;
        }
        for(char c : tArr) {
            if(mask[c] > 0) {
                mask[c]--;
            } else {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        System.out.println(isAnagram("das", "sad"));
    }
}
