//2 possible solution:
//--> brute force approach will take n^2 
//--> so go with HashMap approach 
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> temp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            
            int current = nums[i];
            if(temp.containsKey(current)) {
                return new int[] {temp.get(current),i};
            }
            temp.put(target-current,i);
        }
        return new int[0];
    }
}
