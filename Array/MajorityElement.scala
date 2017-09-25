object Solution {
    def majorityElement(nums: Array[Int]): Int = {
        var count = 1;
        var maj = nums(0);
        for (i <- 1 until nums.length) {
            if (count == 0) {
                maj = nums(i);
                count += 1;
            } else if (maj == nums(i)) {
                count += 1;
            } else {
                count -= 1;
            }
        }
        maj;
    }
}
