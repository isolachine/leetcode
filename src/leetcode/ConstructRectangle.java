package leetcode;

public class ConstructRectangle {
    public int[] constructRectangle(int area) {
        double sqrt = Math.sqrt(area);
        int max = (int) Math.floor(sqrt);

        for (int i = max; i > 0; i++) {
            if (area % i == 0) {
                int[] result = { area / i, i };
                return result;
            }
        }
        return new int[] { area, 1 };

    }

    public static void main(String[] args) {

    }

}
