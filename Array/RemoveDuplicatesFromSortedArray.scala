object Solution {
    def removeDuplicates(nums: Array[Int]): Int = {
        var j:Int = 0;
        for (i <- 0 until nums.length) {
            if (nums(i) != nums(j)) {
                j += 1
                nums(j) = nums(i)
            }
        }
        j+1;
    }
}
