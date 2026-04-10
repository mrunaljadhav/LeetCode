class Solution {
    public int removeDuplicates(int[] nums) {
        int i=1,j=2, count=2;
        int n=nums.length-1;
        while(j<=n){
            
            if(nums[j]==nums[i] && nums[j]==nums[i-1]){
                j++;
                continue;
            }
           
            else{
                nums[i+1]=nums[j];
                i=i+1;
                j++;
                count++;

            }
        }
        return count;
    }
}