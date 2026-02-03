class Solution {
    public int maxNumOfMarkedIndices(int[] nums) {
        int n= nums.length;
        int i=0, j=n/2, count =0;
        Arrays.sort(nums);

     while(i<n/2 && j<n){
            if(2*nums[i]<=nums[j]){
                count++;
                i++;
                j++;
            }else{
                j++;
            }
        }
        return count*2;
    }
}