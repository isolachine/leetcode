package leetcode;

public class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int low, high;
        low = prices[0];
        high = prices[0];
        int profit = 0;
        for (int i : prices) {
            if (i > high) {
                high = i;
            }
            if (i < low) {
                low = i;
                high = i;
            }
            if (profit < high - low) {
                profit = high - low;
            }
        }
        return profit;
    }
    
    public static void main(String[] args) {
        int[] prices = {10, 3, 5, 4, 7, 1, 2, 1, 6, 2, 7};
        System.out.println(maxProfit(prices));
    }
}
