package leetcode;

public class FactorialTrailingZeroes {
    public static int trailingZeroes(int n) {
        int zeroes = 0;
        while (n >= 5) {
            zeroes += n / 5;
            n /= 5;
        }
        return zeroes;
    }
    
    public static void main(String[] args) {
        System.out.println(trailingZeroes(1808548329));
    }
}
