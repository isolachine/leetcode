package leetcode;

public class TransposeMatrix {
    public int[][] transpose(int[][] A) {
        if (A.length == 0) {
            return new int[0][0];
        }
        int[][] t = new int[A[0].length][A.length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                t[j][i] = A[i][j];
            }
        }
        return t;
    }
}
