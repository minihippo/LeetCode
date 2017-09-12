class Solution {
    public int searchInsert(int[] nums, int target) {
        int length = nums.length/2;
        int index = nums.length/2;
        while (true) {

            if (index == nums.length) {
                return index;
            }
            if (length == 0) {
                System.out.println(index);
                if (nums[index] >= target) {
                    return index;
                } else {
                    return index + 1;
                }
            }
            
            int temp = 1;
            if (length%2 == 0) {
                temp = 0;
            }
            
            if (nums[index] > target) {
                index = index-(length+temp)/2;
                length = length/2;
            } else if (nums[index] < target){
                index = index + (length+temp)/2;
                length = length/2;
            } else {
                return index;
            }
            
            
        }
    }
}
