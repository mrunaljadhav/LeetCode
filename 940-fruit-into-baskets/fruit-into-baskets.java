class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer,Integer> resMap = new HashMap<>();
        int n = fruits.length;
        int low=0;
        int res=-1;

        for(int high=0; high<n;high++){
            int curr = fruits[high];
            resMap.put(curr, resMap.getOrDefault(curr,0)+1);

            while(resMap.size() >2){
                int leftInt = fruits[low];
                int count =resMap.getOrDefault(leftInt,0);
                if(count<=1){
                    resMap.remove(leftInt);
                }else{
                    resMap.put(leftInt,count-1);
                }
                low++;
            }

            if(resMap.size()==2 || resMap.size()<2){
                res = Math.max(res, high-low+1);
            }
        }
        return res;
    }
}