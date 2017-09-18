class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if (numRows <= 0) {
            return list;
        }
        List<Integer> line = new ArrayList();
        line.add(1);
        list.add(line);
        for (int i = 1; i < numRows; i++) {
            line = new ArrayList();
            line.add(1);
            for (int j = 1; j < i; j ++) {
                line.add(list.get(i-1).get(j-1) + list.get(i-1).get(j));
            }
            line.add(1);
            list.add(line);
        }
        return list;
    }
}
