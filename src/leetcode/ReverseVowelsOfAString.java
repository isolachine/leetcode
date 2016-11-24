package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseVowelsOfAString {
    public static String reverseVowels(String s) {
        List<Character> characters = new ArrayList<Character>();
        List<Integer> indexs = new ArrayList<Integer>();
        int count = 0;
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (isVowel(c)) {
                characters.add(c);
                indexs.add(count);
            }
            count++;
        }
        Collections.reverse(characters);
        for (int i = 0; i < characters.size(); i++) {
            chars[indexs.get(i)] = characters.get(i);
        }
        return String.valueOf(chars);
    }

    public static boolean isVowel(char a) {
        switch (a) {
        case ('a'):
            return true;
        case ('e'):
            return true;
        case ('i'):
            return true;
        case ('o'):
            return true;
        case ('u'):
            return true;
        case ('A'):
            return true;
        case ('E'):
            return true;
        case ('I'):
            return true;
        case ('O'):
            return true;
        case ('U'):
            return true;
        default:
            return false;
        }
    }

    public static String reverseVowelsFast(String s) {
        if (s.length() < 2)
            return s;
        char[] tab = s.toCharArray();
        int j = tab.length - 1;
        int i = 0;
        while (i < j) {
            if (!isVowel(tab[i]))
                i++;
            else {
                while (j != i && !isVowel(tab[j]))
                    j--;
                char temp = tab[i];
                tab[i] = tab[j];
                tab[j] = temp;
                i++;
                j--;
            }
        }
        return new String(tab);
    }

    public static void main(String[] args) {
        String aString = reverseVowelsFast("leetcode");
        System.out.println(aString);
    }
}
