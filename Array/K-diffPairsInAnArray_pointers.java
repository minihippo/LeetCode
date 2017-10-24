public class Solution {
    public int findPairs(int[] nums, int k) {
        if (nums == null || nums.length < 2) {
            return 0;
        }
            
        int len = nums.length;
        int count = 0;
        int start = 0;
        int end = 1;
        
        Arrays.sort(nums);
        
        while (start < len && end < len) {
            if (nums[start]+k == nums[end]) {
                count++;
                start++;
                end++;
                while (start < len && nums[start-1] == nums[start]) {
                    start++;
                }
            } else if (nums[start]+k < nums[end]) {
                start++;
            } else {
                end++;
            }
            if (start >= end) {
                end = start+1;
            }
        }
        
        return count;
    }
}
