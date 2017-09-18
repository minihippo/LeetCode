object Solution {
    def twoSum(nums: Array[Int], target: Int): Array[Int] = {
        val map = new scala.collection.mutable.HashMap[Int,Int];
        for (i <- 0 until nums.length) {
            map(nums(i)) = i;
        }
        for (i <- 0 until nums.length) {
            if (map.contains(target - nums(i)) && map(target - nums(i)) != i) {
                return Array(i,map(target - nums(i)));
            }
        }
        return null;
    }
}

