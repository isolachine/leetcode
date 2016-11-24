package leetcode;

import java.util.HashMap;
import java.util.Map;

public class BullsAndCows {
    public static String getHint(String secret, String guess) {
        Map<Character, Integer> secretMap = new HashMap<Character, Integer>();
        Map<Character, Integer> guessMap = new HashMap<Character, Integer>();
        int bulls = 0;
        int cows = 0;
        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                bulls++;
            } else {
                secretMap.put(secret.charAt(i), secretMap.getOrDefault(secret.charAt(i), 0) + 1);
                guessMap.put(guess.charAt(i), guessMap.getOrDefault(guess.charAt(i), 0) + 1);
            }
        }
        for (int i = 0; i < 10; i++) {
            cows += Math.min(secretMap.getOrDefault((char) ('0' + i), 0), guessMap.getOrDefault((char) ('0' + i), 0));
        }
        return bulls + "A" + cows + "B";
    }

    public String getHintArray(String secret, String guess) {
        int[] secretarr = new int[10];
        int[] guessarr = new int[10];
        int bull = 0, cow = 0;
        for (int i = 0; i < secret.length(); ++i) {
            if (secret.charAt(i) == guess.charAt(i)) {
                ++bull;
            } else {
                ++secretarr[secret.charAt(i) - '0'];
                ++guessarr[guess.charAt(i) - '0'];
            }
        }
        for (int i = 0; i < 10; ++i) {
            cow += Math.min(secretarr[i], guessarr[i]);
        }
        return "" + bull + "A" + cow + "B";
    }

    public static void main(String[] args) {
        System.out.println(getHint("123", "213"));
    }
}
