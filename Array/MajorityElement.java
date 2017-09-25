class Solution {
    public int majorityElement(int[] nums) {
        int maj = nums[0];
        int max = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] == maj) {
                max++;
            } else if (max == 0) {
                maj = nums[i];
            } else {
                max--;
            }
        }
        return maj;

    }
}
