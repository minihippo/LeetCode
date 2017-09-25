object Solution {
    def twoSum(numbers: Array[Int], target: Int): Array[Int] = {
        var i = 0;
        var j = numbers.length -1;
        
        while (i < j) {
            if (numbers(i) + numbers(j) == target) {
                return Array(i+1,j+1);
            } else if (numbers(i) + numbers(j) > target) {
                j-=1;
            } else {
                i+=1;
            }
        }
        return new Array(2);
    }
}
