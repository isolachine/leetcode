package leetcode;

public class PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        if (n < 1) {
            return false;
        }
        while (n % 2 == 0) {
            n /= 2;
        }
        return n == 1;
    }
    
    public static boolean isPowerOfThreeNoLoop(int n) {
        return n > 0 && 1073741824 % n == 0;
    }
    
    public static boolean isPowerOfTwoBitCounting(int n) {
        return Integer.bitCount(n) == 1 && n > 0;
    }
    
    public static void main(String[] args) {
        System.out.println(isPowerOfTwoBitCounting(0));
    }
}
