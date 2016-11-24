package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllAnagramsInAString {
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> indices = new ArrayList<Integer>();
        Map<Character, Integer> sMap = new HashMap<Character, Integer>();
        Map<Character, Integer> pMap = new HashMap<Character, Integer>();
        for (char c = 'a'; c <= 'z'; c++) {
            sMap.put(c, 0);
            pMap.put(c, 0);
        }
        for (char c : p.toCharArray()) {
            pMap.put(c, pMap.get(c) + 1);
        }
        for (int i = 0; i <= s.length() - p.length(); i++) {
            if (i == 0) {
                for (char c : s.substring(0, p.length()).toCharArray()) {
                    sMap.put(c, sMap.get(c) + 1);
                }
            } else {
                sMap.put(s.charAt(i - 1), sMap.get(s.charAt(i - 1)) - 1);
                sMap.put(s.charAt(i + p.length() - 1), sMap.get(s.charAt(i + p.length() - 1)) + 1);
            }
            if (sMap.equals(pMap)) {
                indices.add(i);
            }
        }
        return indices;
    }

    public static List<Integer> findAnagramsGood(String s, String p) {
        List<Integer> list = new ArrayList<>();
        if (s == null || s.length() == 0 || p == null || p.length() == 0)
            return list;
        int[] hash = new int[256];
        for (char c : p.toCharArray()) {
            hash[c]++;
        }
        int left = 0, right = 0, count = p.length();
        while (right < s.length()) {
            if (hash[s.charAt(right)] >= 1) {
                count--;
            }
            hash[s.charAt(right)]--;
            right++;
            if (count == 0) {
                list.add(left);
            }
            if (right - left == p.length()) {
                if (hash[s.charAt(left)] >= 0) {
                    count++;
                }
                hash[s.charAt(left)]++;
                left++;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(findAnagramsGood("ababab", "ab"));
    }
}
