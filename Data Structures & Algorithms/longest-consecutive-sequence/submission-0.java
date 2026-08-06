// the answer at first granse looks like O(n^2) but it is technically solving in O(n) or O(n)+O(n)
class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> unique = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            unique.add(nums[i]);
        }
        int maximum = 0;
        for(int i=0;i<nums.length;i++){
            int number = nums[i];
            if(!unique.contains(number-1)){
                int tempMax = 1;
                while(unique.contains(number+1)){
                    tempMax++;
                    number++;
                }
                maximum=Math.max(tempMax,maximum);
            }
        }
        return maximum;
    }
}
