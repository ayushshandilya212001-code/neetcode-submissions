class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        int maxValue = 0;
        for(int i=0;i<nums.length;i++){
            int tempValue=rob(i,nums,dp);
            maxValue = Math.max(maxValue,tempValue);
        }
        return maxValue;
    }

    public int rob(int start, int[] nums,int[] dp) {
        if(start >= nums.length) return 0;
        if(dp[start]!=0) return dp[start];
        dp[start] = Math.max(nums[start] + rob(start+2,nums,dp), rob(start+1,nums,dp));
        return dp[start];
    }
}
