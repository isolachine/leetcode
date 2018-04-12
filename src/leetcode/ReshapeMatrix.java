package leetcode;

public class ReshapeMatrix {

    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int h = nums.length;
        int w = nums[0].length;
        if (h * w != r * c) {
            return nums;
        }
        int[][] result = new int[r][c];
        for (int i = 0; i < r * c; i++) {
            result[i / c][i % c] = nums[i / w][i % w];
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] nums = { { 1, 2 }, { 3, 4 } };
        int[][] result = new ReshapeMatrix().matrixReshape(nums, 1, 4);
        System.out.println(result);
    }

}
