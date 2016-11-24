package leetcode;

public class HappyNumber {
    public static boolean isHappy(int n) {
        if (n < 10) {
            if (n == 1 || n == 7) {
                return true;
            } else {
                return false;
            }
        } else {
            int sum = 0;
            while (n > 0) {
                sum += (n % 10) * (n % 10);
                n = n / 10;
            }
            return isHappy(sum);
        }
    }
    
    public static void main(String[] args) {
        System.out.println(isHappy(700));
    }
}
