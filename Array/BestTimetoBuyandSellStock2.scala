object Solution {
    def maxProfit(prices: Array[Int]): Int = {
        var max = 0;
        for (i <- 1 until prices.length) {
            if (prices(i) > prices(i-1)) {
                max += prices(i) - prices(i-1);
            }
        }
        max;
    }
}
