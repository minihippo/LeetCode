object Solution {
    def searchInsert(nums: Array[Int], target: Int): Int = {
        var left : Int = 0;
        var right : Int = nums.length - 1;
        while (left <= right) {
            val mid = left + (right -left)/2;
            if (nums(mid) == target) {
                return mid;
            } else if (nums(mid) > target) {
                right = mid - 1;
            } else if (nums(mid) < target) {
                left = mid + 1;
            }
        }
        return left;
    }
}
