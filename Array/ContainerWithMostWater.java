class Solution {
    public int maxArea(int[] height) {
        // Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int container = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            int temp = 0;
            if (height[left] - height[right] > 0) {
                temp = (right-left) * height[right];
                right -= 1;
            } else {
                temp = (right-left) * height[left];
                left += 1;
            }
            if (temp > container) {
                container = temp;
            }
	 /*    container = Math.max((right-left)*Math.min(height[left],height[right]), container);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }*/
        }
        return container;
    }
}
