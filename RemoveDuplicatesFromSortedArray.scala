object Solution {
    def removeDuplicates(nums: Array[Int]): Int = {
        if (nums.length == 0) {
            return nums.length;
        }
        var j:Int = 0;
        for (i <- 1 until nums.length) {
            if (nums(i) != nums(j)) {
                j += 1
                nums(j) = nums(i)
            }
        }
        j+1;
    }
}
