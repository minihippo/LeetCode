class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set set = new HashSet();
        for (int ele : nums) {
            if (set.add(ele) == false) {
                return true;
            }
        }
        return false;
    }
}
