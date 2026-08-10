class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] s1Count = new int[26];

        //fill s1Count
        for(int i=0;i<s1.length();i++){
            s1Count[s1.charAt(i) - 'a']++;
        }

        int first = 0;
        int second = s1.length();
        //take count of the current window and to have a count of current window we need nested loop
        while(second<=s2.length()){
            int[] windowCount = new int[26];
            for(int i=first;i<second;i++){
                windowCount[s2.charAt(i) - 'a']++;
            }
            //now check that windowCount == s1Count
            if(Arrays.equals(windowCount, s1Count)){
                return true;
            }
            first++;
            second++;
        }
        return false;
    }
}
