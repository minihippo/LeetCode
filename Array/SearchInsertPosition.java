class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while (right - left > 1) {
            int mid = left + (right -left)/2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] > target)  {
                right = mid;
            } else {
                left = mid;
            }
        }
        return (nums[left] >= target ? left : right);
    }
}
