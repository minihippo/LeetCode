object Solution {
    def findMaxConsecutiveOnes(nums: Array[Int]): Int = {
        var max = 0;
        var sum = 0;
        for (ele <- nums) {
            sum += ele;
            if (ele == 0) {
                sum = 0;
            } else if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
}
