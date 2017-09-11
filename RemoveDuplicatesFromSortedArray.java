class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            nums[j] = nums[i-1];
            if (nums[i] == nums[i-1]) {
                continue;
            }
            j++;
            nums[j] = nums[i];
        }
        return j+1;
    }
}
