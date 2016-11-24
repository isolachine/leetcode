package leetcode;

import java.util.ArrayList;
import java.util.List;

public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        List<Character> list = new ArrayList<Character>();
        char[] arr = ransomNote.toCharArray();
        for (char c : arr) {
            list.add(c);
        }
        
        char[] magazineArr = magazine.toCharArray();
        for (char c : magazineArr) {
            int index = list.indexOf(c);
            if (index != -1) {
                list.remove(index);
            }
        }
        return list.isEmpty();
    }
    
    public static void main(String[] args) {
        System.out.println(canConstruct("dasd", "das"));
    }
}
