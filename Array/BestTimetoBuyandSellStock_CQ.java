class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;
        int min = prices[0];
        int max = prices[0];
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
                max = 0;
            } else if (prices[i] -min > profit) {
                max = prices[i];
                profit = max -min;
            }
        } 
       return profit;
    }
}
