class Solution {
    public long findTheArrayConcVal(int[] nums) {
        long res = 0;
       int left = 0, right = nums.length-1;
        while(left<=right){
             if(left == right){
                res+=nums[left];
                break;
            }
            long con =  Long.parseLong(String.valueOf(nums[left])+String.valueOf(nums[right]));
            res += con;
            left++;
            right--;
           
        }  
       return res;
    }
}