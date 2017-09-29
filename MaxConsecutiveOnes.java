class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int start = 0;
        int max = 1;
        if (nums.length > 0 && nums[0] == 1) {
            start = -1;
            max = 2;
        }
        int i = 1;
        for (; i < nums.length; i++) {
            if (nums[i] == 0) {
                if (i - start > max) {
                    max = i - start;
                }
                start = i;
            } 
        }
        if (nums[i-1] == 1 && i - start > max) {
            max = i - start;
        }
        return max-1;
    }
}
