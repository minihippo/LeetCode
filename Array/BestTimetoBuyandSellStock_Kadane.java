class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            profit += prices[i]-prices[i-1];
            if (profit < 0) {
                profit = 0;
            }else if (profit > max) {
                max = profit;
            }
        } 
       return max;
    }
}
