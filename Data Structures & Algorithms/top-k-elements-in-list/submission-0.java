class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> temp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            temp.put(nums[i], temp.getOrDefault(nums[i], 0) + 1);
        }
        //to return top k
        //as map can't be iteratable so let's convert into set view
        List<int[]> arr = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : temp.entrySet()){
            arr.add(new int[] {entry.getValue(),entry.getKey()});
        }

        //now we can iterate or sort
        arr.sort((a,b) -> b[0]-a[0]);

        int[] res = new int[k];
        for(int i=0;i<k;i++){
            res[i]=arr.get(i)[1];
        }
        return res;
    }
}
