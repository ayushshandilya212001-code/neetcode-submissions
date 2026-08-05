class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> unique= new HashSet<>();
        for(int i=0;i<nums.length;i++){
            unique.add(nums[i]);
        }
        if(unique.size()==nums.length){
            return false;
        } else{
            return true;
        }
    }
}