class Solution {
    public int strStr(String haystack, String needle) {
   int n = needle.length();
        int h = haystack.length();
        
        // 'low' is the starting point in haystack we are currently testing
        for (int low = 0; low <= h - n; low++) {
            int high = 0; // 'high' acts as the needle index
            
            // Check if characters match starting from 'low'
            while (high < n && haystack.charAt(low + high) == needle.charAt(high)) {
                high++;
            }
            
            // If we matched the entire needle length, we found it!
            if (high == n) {
                return low;
            }
        }
        return -1;
    }
}