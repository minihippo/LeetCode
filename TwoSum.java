class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i]) && map.get(target - nums[i]) != i) {
                return new int[] {i,map.get(target - nums[i])};
            }
        }
        return null;
    }
}

//map.containsKey()时间复杂度为O(1),若hashcode设计不合理，则复杂度会为O(n)
