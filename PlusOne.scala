object Solution {
    def plusOne(digits: Array[Int]): Array[Int] = {
        for (i <- (0 until digits.length).reverse) {
            if (digits(i) < 9) {
                digits(i) += 1;
                return digits;
            }
            digits(i) = 0;
        }
        
        var arr = new Array[Int](digits.length+1);
        arr(0) = 1;
        return arr;
    }
}
