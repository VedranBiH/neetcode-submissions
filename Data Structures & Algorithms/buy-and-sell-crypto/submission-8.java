class Solution {
    public int maxProfit(int[] prices) {
        int lowBuyPrice = prices[0];
        int highSellPrice = prices[0];
        int profit = -1;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < lowBuyPrice && i != prices.length - 1) {
                lowBuyPrice = prices[i];
                highSellPrice = prices[i];
            }
            highSellPrice = Math.max(highSellPrice, prices[i]);

            profit = Math.max(highSellPrice - lowBuyPrice, profit);
        }

        if (profit < 0) {
            profit = 0;
        }
        return profit;
    }
}
