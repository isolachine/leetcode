package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MostCommonWord {
    public static String mostCommonWord(String paragraph, String[] banned) {
        String[] words = paragraph.toLowerCase().split("[^\\w]+");
        Map<String, Integer> wordCount = new HashMap<>();

        Set<String> banList = new HashSet<>();
        for (String banWord : banned) {
            banList.add(banWord);
        }

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        int max = 0;
        String maxWord = "";
        for (String word : wordCount.keySet()) {
            if (wordCount.get(word) > max && !banList.contains(word)) {
                max = wordCount.get(word);
                maxWord = word;
            }
        }
        return maxWord;

    }

    public static void main(String[] args) {
        System.out.println(
                mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", new String[] { "hit", "ball" }));
    }
}
