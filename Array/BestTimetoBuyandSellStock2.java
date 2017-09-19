class Solution {
    public int maxProfit(int[] prices) {
        int max_sum = 0;
        int low = 0;
        int high = 0;
        int i = 0;
        while(i < prices.length-1) {
            while (i < prices.length-1 && prices[i] >=prices[i+1]) 
                i++;
            low = prices[i];
            while (i < prices.length-1 && prices[i]<=prices[i+1]) 
                i++;
            high = prices[i];
            max_sum += high - low;
        }
        return max_sum;
    }
}
