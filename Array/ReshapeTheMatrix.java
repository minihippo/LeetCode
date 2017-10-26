class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int row = nums.length;
        int col = nums[0].length;
        if (r*c != row*col) {
            return nums;
        }
        int[][] ans = new int[r][c];
        int x = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ans[i][j] = nums[x/col][x%col];
                x++;
            }
        }
        return ans;
    }
}
