class Solution {
    public int thirdMax(int[] nums) {
        int max = Integer.MIN_VALUE;
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int count = 0;
        for (int ele : nums) {
            if (ele > max) {
                max2 = max1;
                max1 = max;
                max = ele;
            } else if (ele > max1 && ele != max) {
                max2 = max1;
                max1 = ele;
            } else if (ele > max2 && ele != max1 && ele != max) {
                max2 = ele;
            }
            if (ele == Integer.MIN_VALUE) {
                count = 1;
            }
        }
        if (count == 0 && max2 == Integer.MIN_VALUE || max1 == Integer.MIN_VALUE) {
            return max;
        }
        return max2;
    }
}
