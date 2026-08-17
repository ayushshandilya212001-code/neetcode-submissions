class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        return rob(0,nums,dp);
    }

    public int rob(int start, int[] nums,int[] dp) {
        if(start >= nums.length) return 0;
        if(dp[start]!=0) return dp[start];
        dp[start] = Math.max(nums[start] + rob(start+2,nums,dp), rob(start+1,nums,dp));
        return dp[start];
    }
}
