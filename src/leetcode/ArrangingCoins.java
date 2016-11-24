package leetcode;

public class ArrangingCoins {
    public static int arrangeCoins(int n) {
        if (n <= 0) {
            return 0;
        }
        int row = 0;
        while (row < 65536 && row / 2.0 * (row + 1) <= n) {
            row++;
        }
        return row - 1;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 1; i++) {

            System.out.println(i + ":" + arrangeCoins(1804289383));
        }
    }
}
