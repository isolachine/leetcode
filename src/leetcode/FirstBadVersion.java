package leetcode;

public class FirstBadVersion {

    static boolean isBadVersion(int version) {
        if (version >= 100) {
            return true;
        }
        return false;
    }

    public static int firstBadVersion(int n) {
        if (!isBadVersion(n - 1)) {
            return n;
        }
        if (isBadVersion(1)) {
            return 1;
        }
        int firstBad = n / 2;
        int min = 1;
        int max = n;
        while (firstBad > 0) {
            if (max - min == 1) {
                return max;
            }
            if (isBadVersion(firstBad)) {
                max = firstBad;
                firstBad = (int) (firstBad / 2.0 + min / 2.0);
            } else {
                min = firstBad;
                firstBad = (int) (max / 2.0 + firstBad / 2.0);
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        for (int i = 100; i < 500; i++) {
            System.out.println(i + ":" + firstBadVersion(i));
        }
    }
}
