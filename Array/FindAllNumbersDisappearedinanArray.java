class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList();
        int n = nums.length;
        for (int i : nums) {
            nums[(i-1)%n] += n;
        } 
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= n) {
                list.add(i+1);
            }
        }
        return list;
    }
}
