object Solution {
    def maxSubArray(nums: Array[Int]): Int = {
        var max = nums(0);
        var sum = nums(0);
        for (i <- 1 until nums.length) {
            sum = scala.math.max(sum+nums(i),nums(i));
            max = scala.math.max(sum,max);
        }
        max;
    }
}
