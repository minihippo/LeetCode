class Solution {
    public int findPairs(int[] nums, int k) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<Integer,Integer>();
        
        for (int ele : nums) {
             if (map.containsKey(ele)) {
                 map.put(ele, map.get(ele)+1);
             } else {
                 map.put(ele,1);
             }
        }
        
        for (int ele : map.keySet()) {
            if (map.containsKey(ele+k) && k > 0) {
                count++;
            } else if (k == 0 && map.get(ele) > 1) {
                count++;
            }
        }
        
        return count;
    }
}
