class Solution {
    public boolean isSubsequence(String s, String t) {
        //two pointer approach
        if(s.length()==0) return true;
        if(s.length() > t.length()) return false;

        int start = 0;
        int last = 0;

        for(int i=0;i<t.length();i++){
            if(start < s.length() && s.charAt(start)==t.charAt(last)){
                start++;
                last++;
            } else{
                last++;
            }
        }
        if(start == s.length()) return true;
        return false;
    }
}