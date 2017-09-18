object Solution {
    def maxProfit(prices: Array[Int]): Int = {
        var max_ending_here = 0;
        var max_so_far = 0;
        for (i <- 1 until prices.length) {
            max_ending_here = scala.math.max(max_ending_here+prices(i)-prices(i-1),0);
            max_so_far = scala.math.max(max_ending_here,max_so_far);
        }
        max_so_far;
    }
}
