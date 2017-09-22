object Solution {
    def rotate(nums: Array[Int], k: Int): Unit = {
        var arr = new Array[Int](nums.length);
        for (i <- 0 until nums.length) {
            arr((i+k)%nums.length) = nums(i);
        }
        for (i <- 0 until nums.length) {
            nums(i) = arr(i);
        }
    }
}
