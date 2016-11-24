package leetcode;

public class PowerOfFour {
    public static boolean isPowerOfFour(int num) {
        if (num < 1) {
            return false;
        }
        while (num % 4 == 0) {
            num /= 4;
        }
        return num == 1;
    }

    public static boolean isPowerOfFourNoLoop(int num) {
        return num > 0 && (num&(num-1)) == 0 && (num & 0x55555555) != 0;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfFour(4));
    }
}
