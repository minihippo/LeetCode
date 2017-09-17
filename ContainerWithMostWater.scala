object Solution {
    def maxArea(height: Array[Int]): Int = {
        var container = 0;
        var left = 0;
        var right = height.length - 1;
        
        while(left < right) {
            var temp = 0;
            if (height(left) - height(right) > 0) {
                temp = (right-left) * height(right);
                right -= 1;
            } else {
                temp = (right-left) * height(left);
                left += 1;
            }
            if (temp > container) {
                container = temp;
            }
        }
        return container;
    }
}
