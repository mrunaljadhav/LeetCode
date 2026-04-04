class Solution {
    public int characterReplacement(String s, int k) {
        int low=0, res=0;
        int maxInt =0;
        int[] charCount = new int[256];

   for(int high= 0;high<s.length();high++){
            char ch = s.charAt(high);
            charCount[ch]++;

             maxInt = Math.max(maxInt,charCount[ch]);

            while((high-low+1)-maxInt>k){
                char leftCh = s.charAt(low);
                charCount[leftCh]--;
                low++;
            }
            res=Math.max(res,high - low + 1);
        }
        return res;
    }
}