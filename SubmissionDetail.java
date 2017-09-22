class Solution {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        int i = 0;
        int j = nums.length - k;
        int space[] = new int[k];
        for (; j < nums.length; j++) {
            space[i] = nums[j];
            i++;
        }
        for (i = nums.length -1; i > k-1; i--) {
            nums[i] = nums[i-k];
        }
        for (i = 0; i < k; i++) {
            nums[i] = space[i];
        }
    }
}
