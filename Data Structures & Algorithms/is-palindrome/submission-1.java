class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int last = s.length() - 1;
        
        while (start < last) {
            // Skip non-alphanumeric characters from the left
            if (!Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            }
            // Skip non-alphanumeric characters from the right
            else if (!Character.isLetterOrDigit(s.charAt(last))) {
                last--;
            }
            // Compare characters (case-insensitive)
            else if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(last))) {
                return false;
            }
            // Match found, move both pointers
            else {
                start++;
                last--;
            }
        }
        return true;
    }
}   