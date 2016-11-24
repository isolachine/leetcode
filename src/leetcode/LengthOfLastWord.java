package leetcode;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        int lastSpace = s.lastIndexOf(' ');
        if (lastSpace == -1) {
            return s.length();
        } else if (lastSpace == s.length() - 1) {
            return lengthOfLastWord(s.substring(0, s.length() - 1));
        } else {
            return s.length() - lastSpace - 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello "));
    }
}
