class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> resMap = new HashMap<>();
        int n = s.length();
        int low = 0;
        int res=0;

        for(int high = 0;high<n;high++){
            char ch = s.charAt(high);
            resMap.put(ch, resMap.getOrDefault(ch,0)+1);
            while(resMap.get(ch)>1){
                char leftChar = s.charAt(low);
                int count = resMap.getOrDefault(leftChar,0);
                if(count<=1){
                    resMap.remove(leftChar);
                }else{
                    resMap.put(leftChar,count-1);
                }
                low++;
            }

           
                res=Math.max(res, high-low+1);
            
    }
    return res;
}
}