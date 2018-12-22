package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class GroupsOfSpecialEquivalentStrings {
    public int numSpecialEquivGroups(String[] A) {
        Set<String> groups = new HashSet<>();
        for (String word : A) {
            int[] odd = new int[26];
            int[] even = new int[26];
            for (int i = 0; i < word.length(); i++) {
                if (i % 2 != 0) {
                    odd[word.charAt(i) - 'a']++;
                } else {
                    even[word.charAt(i) - 'a']++;
                }
            }

            String representation = Arrays.toString(even) + Arrays.toString(odd);
            groups.add(representation);

        }

        return groups.size();
    }
}
