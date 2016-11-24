package leetcode;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int count = 0;
        int temp = x;
        while (temp > 0) {
            temp = temp / 10;
            count++;
        }
        int[] digits = new int[count];
        for (int i = count; i > 0; i--) {
            digits[i - 1] = x % 10;
            x /= 10;
        }
        for (int i = 0; i < digits.length / 2; i++) {
            if (digits[i] != digits[digits.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindromeEasy(int x) {
        if (x < 0)
            return false;
        int p = x;
        int q = 0;
        while (p >= 10) {
            q *= 10;
            q += p % 10;
            p /= 10;
        }
        return q == x / 10 && p == x % 10;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(10101));
    }
}
