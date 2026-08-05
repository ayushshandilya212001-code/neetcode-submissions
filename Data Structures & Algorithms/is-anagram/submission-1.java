class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] temp = s.toCharArray();
        char[] temp1 = t.toCharArray();
        Arrays.sort(temp);
        Arrays.sort(temp1);
        for(int i=0;i<temp.length;i++){
            if(temp[i]!=temp1[i]) return false;
        }
        return true;
    }
}
