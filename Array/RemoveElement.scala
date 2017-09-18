object Solution {
    def removeElement(nums: Array[Int], key: Int): Int = {
        var length = nums.length;
        if (length == 0) {
            return 0;
        }
        for (i <- (0 until nums.length).reverse) {
            if (nums(i).equals(key)) {
                nums(i) = nums(length-1);
                length -= 1;
            }
        }
        length;
    }
}
