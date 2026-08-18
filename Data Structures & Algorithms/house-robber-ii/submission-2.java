class Solution {
    public int rob(int[] nums) {
        //create 2 subarray
        if(nums.length==1) return nums[0];
        
        int[] nums1 = new int[nums.length-1];
        int[] nums2 = new int[nums.length-1];
        for(int i=0;i<nums.length-1;i++){
            nums1[i] = nums[i];
        }
        for(int i=1;i<nums.length;i++){
            nums2[i-1] = nums[i];
        }
        int[] memo1 = new int[nums1.length];
        int[] memo2 = new int[nums2.length];
        return Math.max(rob(0,nums1,memo1),rob(0,nums2,memo2));
    }

    public int rob(int start, int[] subarray,int[] memo) {

        if(start >= subarray.length) return 0;
        if(memo[start]!=0) return memo[start];
        memo[start] = Math.max(subarray[start] + rob(start+2, subarray,memo), rob(start+1, subarray,memo));
        return memo[start];
    }
}
