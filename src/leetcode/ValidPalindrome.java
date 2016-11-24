package leetcode;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0, j = chars.length - 1; i <= j; i++, j--) {
            while (i < chars.length && !isAlphanumeric(chars[i])) {
                i++;
            }
            while (j >= 0 && !isAlphanumeric(chars[j])) {
                j--;
            }
            if (i <= j) {
                if (chars[i] <= 'Z') {
                    chars[i] += 32;
                }
                if (chars[j] <= 'Z') {
                    chars[j] += 32;
                }
                if (chars[i] != chars[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isAlphanumeric(char c) {
        if ((c >= '0' && c <= '9') || (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(" 0p0p"));
    }
}
