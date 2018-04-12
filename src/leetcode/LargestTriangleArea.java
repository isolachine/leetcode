package leetcode;

public class LargestTriangleArea {

    public double largestTriangleArea(int[][] points) {
        double result = 0;
        for (int[] p1 : points) {
            for (int[] p2 : points) {
                for (int[] p3 : points) {
                    result = Math.max(result, 0.5 * Math.abs(p1[0] * p3[1] + p2[0] * p1[1] + p3[0] * p2[1] - p1[0] * p2[1] - p2[0] * p3[1] - p3[0] * p1[1]));
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {

    }

}
