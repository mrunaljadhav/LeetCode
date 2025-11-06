class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        
       /* for(int i=0;i<nums.length;i++){
            int count=0;
            if(nums[i]==1 && nums[i-1]!=1){
                count+=1;
            }
            
            if(count>maxCount){
                maxCount = count;
            }
        }
        
        int i=0;
        int j = 1;
        
        while(i<j && i < nums.length && j < nums.length){
            int count = 1;
            if(nums[i]==1 && nums[j]==1){
                count+=1;
                j++;
                
            }
                       
             if(count>maxCount){
                maxCount = count;
            }
            i++;
        }*/

        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count +=1;
                 if(count>maxCount){
                maxCount = count;
            }
            }else{
                count=0;
            }
        }
        
        return maxCount;
    }
}