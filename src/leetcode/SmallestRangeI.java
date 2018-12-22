package leetcode;

public class SmallestRangeI {
    public int smallestRangeI(int[] A, int K) {
        int small = A[0], large = A[0];
        for (int i = 1; i < A.length; i++) {
            if (small > A[i]) {
                small = A[i];
            } else if (large < A[i]) {
                large = A[i];
            }
        }
        return Math.max(large - small - 2 * K, 0);
    }
}
