package leetcode;

public class FlippingAnImage {
    public int[][] flipAndInvertImage(int[][] A) {
        for (int[] row : A) {
            for (int i = 0; i < row.length / 2; i++) {
                int head = row[i];
                row[i] = 1 - row[row.length - 1 - i];
                row[row.length - 1 - i] = 1 - head;
            }
            if (row.length % 2 == 1) {
                row[row.length / 2] = 1 - row[row.length / 2];
            }
        }
        return A;
    }
}
