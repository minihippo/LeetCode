object Solution {
    def findDisappearedNumbers(nums: Array[Int]): List[Int] = {
        var list:List[Int] = List();
        val n = nums.length;
        for (ele <- nums) {
            nums((ele-1)%n) += n;
        }
        for (i <- 0 until n) {
            if (nums(i) <= n) {
                list = list:+(i+1);
            }
        }
        list;
    }
}
