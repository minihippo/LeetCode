class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int sum = 0;
        int max = 0;
        for (int ele : nums) {
            sum += ele;
            sum *= ele;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
}
