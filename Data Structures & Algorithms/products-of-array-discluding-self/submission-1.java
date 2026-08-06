class Solution {
    public int[] productExceptSelf(int[] nums) {
        int multipleOfAll = 1;
        int numberOfZero = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) {
                numberOfZero++;
                continue;
            }
            multipleOfAll *= nums[i];
        }

        if(numberOfZero >= 2) return new int[nums.length];

        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) {
                ans[i] = multipleOfAll;
            } else {
                if(numberOfZero > 0) {
                    ans[i] = 0;
                    continue;
                }
                ans[i] = multipleOfAll/nums[i];
            }
        }
        return ans;
    }
}  
