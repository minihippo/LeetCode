object Solution {
    def generate(numRows: Int): List[List[Int]] = {
        var list = new List[List[Int]]();
        var line = new List[Int]();
        line :+ 1;
        list :+ line;
        for (i <- 1 until numRows) {
            line = new List[Int]();
            1::line;
            for (j <- 1 until i) {
                line :+ (list(i-1)(j-1) + list(i-1)(j));
            }
            line :+ 1;
            list :+ line;
        }
        list;
    }
}
