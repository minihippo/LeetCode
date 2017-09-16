class Solution {
    public int maxArea(int[] height) {
        // Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int container = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            container = Math.max((right-left)*Math.min(height[left],height[right]), container);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return container;
    }
}
