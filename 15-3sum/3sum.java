class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n= nums.length;
       
 List<List<Integer>> res = new ArrayList<>();
Arrays.sort(nums);
        for(int i=0;i<n-2;i++){
             int left=i+1, right = n-1;
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            while(left<right){
                int sum = nums[left]+nums[right];
                int comp = -1 * nums[i];
                if(sum == comp){
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    
                    while(left<n && nums[left]==nums[left-1]){
                        left++;
                    }
                    while(right>=0 && nums[right]==nums[right+1]){
                        right--;
                    }
                }
                else if(sum>comp){
                    right--;
                }else{
                    left++;
                }
            }
        }

        return res;
    }
}