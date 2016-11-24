package leetcode;

public class PowerOfThree {
    public static boolean isPowerOfThree(int n) {
        if (n < 1) {
            return false;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }
    
    public boolean isPowerOfThreeNoLoop(int n) {
        return n > 0 && 1162261467 % n == 0;
    }
    
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(-3));
    }
}
