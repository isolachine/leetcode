package leetcode;

public class BestTimeToBuyAndSellStockII {
    public int maxProfit(int[] prices) {
        boolean hold = false;
        int profit = 0;
        int buy = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (!hold && prices[i] < prices[i + 1]) {
                buy = prices[i];
                hold = true;
            } else if (hold && prices[i] > prices[i + 1]) {
                hold = false;
                profit += prices[i] - buy;
            }
        }
        if (hold) {
            profit += prices[prices.length - 1] - buy;
        }
        return profit;
    }
}
