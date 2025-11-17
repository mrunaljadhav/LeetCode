class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
           /*String currentStr= String.valueOf(nums[i]);
            if(currentStr.length()%2==0)
                count++;*/
            
            if(((int)Math.log10(Math.abs(nums[i])) + 1) %2==0)
                count++;
        }
        
        return count;
    }
}