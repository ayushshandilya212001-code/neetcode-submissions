class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> validate = new HashSet<>();
        int first = 0;
        int second = 0;

        int maxLength = 0;
        while (second < s.length()) {
            if(!validate.contains(s.charAt(second))){
                validate.add(s.charAt(second));
                second++;
                maxLength = Math.max(maxLength, second-first);
            } else{
                validate.remove(s.charAt(first));
                first++;
            }
        }
        return maxLength;
    }
}
