class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        int co = target - numbers[i];
        while (i < j) {
            if (co == numbers[j]) {
                int ans[] = {i+1,j+1};
                return ans;
            }
            if (co < numbers[j]) {
                j--;
            } else {
                i++;
                co = target - numbers[i];
            }
        }
        return new int[2];
    }
}
