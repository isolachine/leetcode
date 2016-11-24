package leetcode;

public class LongestPalindrome {
    public static int longestPalindrome(String s) {
        int count = 0;
        int[] counts = new int[128];
        for (char c : s.toCharArray()) {
            counts[c - 'A'] += 1;
        }
        for (int i : counts) {
            i = i / 2;
            count += i;
        }
        count = count * 2;
        for (int i : counts) {
            if (i%2 == 1) {
                count++;
                break;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        System.out.println(longestPalindrome("ASADBFASewqedsadaabbff"));
    }
}
