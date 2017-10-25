class Solution {
    public int arrayPairSum(int[] nums) {
        int bucket[] = new int [20001];
        for (int ele : nums) {
            bucket[ele+10000]++;
        }
        
        int sum = 0;
        boolean flag = true;
        for (int i = 0; i < bucket.length; i++) {
            while (bucket[i] > 0) {
                if (flag) {
                    sum += i - 10000;
                }
                flag = !flag;
                bucket[i]--;
            }
        }
        return sum;
    }
}
