class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        if (m > n) return false;

        int[] s1Count = new int[26];
        int[] windowCount = new int[26];

        // build s1Count and the first window of size m in one pass
        for (int i = 0; i < m; i++) {
            s1Count[s1.charAt(i) - 'a']++;
            windowCount[s2.charAt(i) - 'a']++;
        }

        int left = 0; // start of current window, window is [left, left+m-1]

        for (int right = m; right <= n; right++) {
            // check the window ending just before `right` was added
            if (Arrays.equals(windowCount, s1Count)) {
                return true;
            }
            if (right == n) break; // no more characters to slide in

            // slide: add s2.charAt(right), remove s2.charAt(left)
            windowCount[s2.charAt(right) - 'a']++;
            windowCount[s2.charAt(left) - 'a']--;
            left++;
        }

        return false;
    }
}