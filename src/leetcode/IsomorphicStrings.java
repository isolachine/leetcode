package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        Map<Character, List<Integer>> sMap = new HashMap<Character, List<Integer>>();
        Map<Character, List<Integer>> tMap = new HashMap<Character, List<Integer>>();
        for (int i = 0; i < s.length(); i++) {
            if (!sMap.containsKey(s.charAt(i))) {
                sMap.put(s.charAt(i), new ArrayList<Integer>());
            }
            sMap.get(s.charAt(i)).add(i);
            if (!tMap.containsKey(t.charAt(i))) {
                tMap.put(t.charAt(i), new ArrayList<Integer>());
            }
            tMap.get(t.charAt(i)).add(i);
        }
        Iterator<Map.Entry<Character, List<Integer>>> iterator = sMap.entrySet().iterator();
        while (iterator.hasNext()) {
            List<Integer> list = iterator.next().getValue();
            Character model = t.charAt(list.get(0));
            if (!tMap.get(model).equals(list)) {
                return false;
            }
        }
        return true;
    }

    public boolean isIsomorphicEasy(String s, String t) {
        Map<Character, Integer> map1 = new HashMap<Character, Integer>();
        Map<Character, Integer> map2 = new HashMap<Character, Integer>();
        for (Integer i = 0; i < s.length(); i++) {
            if (map1.put(s.charAt(i), i) != map2.put(t.charAt(i), i))
                return false;
        }
        return true;
    }

    public boolean isIsomorphicNoMap(String sString, String tString) {
        char[] s = sString.toCharArray();
        char[] t = tString.toCharArray();
        int length = s.length;
        char[] sm = new char[256];
        char[] tm = new char[256];
        for (int i = 0; i < length; i++) {
            char sc = s[i];
            char tc = t[i];
            if (sm[sc] == 0 && tm[tc] == 0) {
                sm[sc] = tc;
                tm[tc] = sc;
            } else {
                if (sm[sc] != tc || tm[tc] != sc) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("ab", "ds"));
    }
}
