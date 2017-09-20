class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        int co = target - numbers[i];
        while (i < j) {
            if (co == numbers[j]) {
                int ans[] = {i+1,j+1};
                return ans;
            } else if (co < numbers[j]) {
                j = findJ(numbers,i,j,co);
            } else {
                i = findI(numbers,i,j,target-numbers[j]);
                co = target - numbers[i];
            }
        }
        return new int[2];
    }
    
    public int findJ(int[] numbers, int i, int j, int co) {
        while(i <= j) {
            int mid = i+(j-i)/2;
            if (numbers[mid] > co) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
        return j;
    }
    
    public int findI(int[] numbers, int i, int j, int co) {
        while(i <= j) {
            int mid = i+(j-i)/2;
            if (numbers[mid] < co) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }
}
