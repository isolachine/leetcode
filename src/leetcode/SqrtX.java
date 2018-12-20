package leetcode;

public class SqrtX {

    public static void main(String[] args) {
        System.out.println(mySqrt(256));
    }

    public static int mySqrt(int x) {
        int lo = 0;
        int hi = 46340;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (mid * mid > x) {
                hi = mid - 1;
            } else if (mid * mid < x) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }
        return hi;
    }
}
