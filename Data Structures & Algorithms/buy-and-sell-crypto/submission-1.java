class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int maxProfit = -1;

        for (int i = 1; i < prices.length; i++) {
            int sellPrice = prices[i];
            for (int y = i; y >= 0; y--) {
                int profit = sellPrice - prices[y];
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }

        if(maxProfit < 0){
            maxProfit = 0;
        }
        return maxProfit;
    }
}
