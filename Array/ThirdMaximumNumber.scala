object Solution {
    def thirdMax(nums: Array[Int]): Int = {
        var max = scala.Int.MinValue;
        var max1 = scala.Int.MinValue;
        var max2 = scala.Int.MinValue;
        var count = 0;
        for (ele <- nums) {
            if (ele > max) {
                max2 = max1;
                max1 = max;
                max = ele;
            } else if (ele > max1 && ele != max) {
                max2 = max1;
                max1 = ele;
            } else if (ele > max2 && ele != max && ele != max1) {
                max2 = ele;
            }
            if (ele == scala.Int.MinValue) {
                count = 1;
            }
        }
        if (max2 == scala.Int.MinValue && count == 0 || max1 == scala.Int.MinValue) {
            return max;
        }
        return max2;
    }
}
