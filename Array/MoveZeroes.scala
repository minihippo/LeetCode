object Solution {
    def moveZeroes(nums: Array[Int]): Unit = {
        var j = 0;
        for (ele <- nums) {
            if (ele != 0) {
                nums(j) = ele;
                j += 1;
            }
        }
        while (j < nums.length) {
            nums(j) = 0;
            j += 1;
        }
    }
}
