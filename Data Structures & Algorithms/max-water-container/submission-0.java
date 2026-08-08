class Solution {
    public int maxArea(int[] heights) {
        int start = 0;
        int last = heights.length - 1;

        int waterContain = 0;
        while(start < last) {
            int width = last - start;
            int minHeight = Math.min(heights[start], heights[last]);
            waterContain = Math.max(waterContain, width * minHeight);
            
            if(heights[start] <= heights[last]){
                start++;
            } else if(heights[start] > heights[last]) {
                last--;
            }
        }
        return waterContain;
    }
}
