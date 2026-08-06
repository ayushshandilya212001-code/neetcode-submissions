class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> temp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            temp.put(nums[i], temp.getOrDefault(nums[i], 0) + 1);
        }
        //solve using PriorityQueue
        Queue<int[]> heap = new PriorityQueue<>((a,b) -> a[0] - b[0]);
        for(Map.Entry<Integer, Integer> entry : temp.entrySet()) {
            heap.offer(new int[]{entry.getValue(), entry.getKey()});
            if(heap.size() > k) {
                heap.poll();
            }
        }
        int[] ans = new int[k];
        for(int i=0; i<k; i++){ 
            ans[i] = heap.poll()[1];
        }
        return ans;
    }
}
