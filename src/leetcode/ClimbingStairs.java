package leetcode;

public class ClimbingStairs {
    public static int climbStairs(int n) {
//        if (n == 1) {
//            return 1;
//        } else if (n == 2) {
//            return 2;
//        } else {
//            return climbStairs(n - 1) + climbStairs(n - 2);
//        }
        int temp1 = 1;
        int temp2 = 0;
        int res = 1;
        for (int i = 1; i <= n; i++) {
            
            res = temp1 + temp2;
            temp2 = temp1;
            temp1 = res;
        }
        return res;
    }
    
    public static void main(String[] args) {
        for (int i = 1; i < 44; i++) {
            System.out.println("i = " + i + " : " + climbStairs(i));
        }
    }
}
