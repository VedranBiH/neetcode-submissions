class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //For every element store a count and keep a sliding track

        int[] ans = new int[k];

        HashMap<Integer,Integer> map = new HashMap<>();

        PriorityQueue<Map.Entry<Integer, Integer>> heap = 
        new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        for (int i = 0; i < nums.length; i++) {
            map.merge(nums[i], 1, Integer::sum);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            heap.offer(entry);
        }

        int index = 0;
        while(index != k){
            ans[index] = heap.poll().getKey();
            index++;
        }
        return ans;
    }
}
