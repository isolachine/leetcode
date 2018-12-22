package leetcode;

import java.util.HashSet;
import java.util.Set;

public class UncommonWordsFromTwoSentences {
    public String[] uncommonFromSentences(String A, String B) {
        Set<String> single = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        String[] words = A.split(" ");
        for (String word : words) {
            if (single.contains(word)) {
                duplicates.add(word);
                single.remove(word);
            } else if (!single.contains(word) && !duplicates.contains(word)) {
                single.add(word);
            }
        }
        words = B.split(" ");
        for (String word : words) {
            if (single.contains(word)) {
                duplicates.add(word);
                single.remove(word);
            } else if (!single.contains(word) && !duplicates.contains(word)) {
                single.add(word);
            }
        }

        String[] res = new String[single.size()];
        int index = 0;
        for (String word : single) {
            res[index++] = word;
        }
        return res;
    }
}
