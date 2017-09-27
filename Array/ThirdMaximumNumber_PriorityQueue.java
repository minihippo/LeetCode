public class solution {
    public int thirdMax(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        Set<Integer> set = new HashSet<Integer>();
        for (int ele : nums) {
            if (set.add(ele)) {
                pq.offer(ele);
                if (pq.size() > 3)
                    pq.poll();
            }
        }
        if (pq.size() == 2)
            pq.poll();
        return pq.peek();
    }
}
