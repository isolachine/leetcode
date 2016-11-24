package leetcode;

public class RotateFunction {
    public static int maxRotateFunction(int[] A) {
        if (A.length == 0) {
            return 0;
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++) {
            int sum = 0;
            for (int j = 0; j < A.length; j++) {
                if (j + i < A.length) {
                    sum += j * A[j + i];
                } else {
                    sum += j * A[j + i - A.length];
                }
            }
            max = sum > max ? sum : max;
        }
        return max;
    }
    
    public static void main(String[] args) {
        int[] A = {};
        System.out.println(maxRotateFunction(A));
    }
}
