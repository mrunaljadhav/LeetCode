class Solution {
    public int[] sortedSquares(int[] nums) {
        List<Integer> neg = new ArrayList<>();
        List<Integer> pos = new ArrayList<>();
        
    for(int num:nums){
        if(num<0){
            neg.add(num);
        }else{
            pos.add(num);
        }
    }

    //1. No negative numbers
    if(neg.size()==0){
        for(int i=0;i<pos.size();i++){
            pos.set(i,pos.get(i)*pos.get(i));
        }
            return pos.stream().mapToInt(Integer::intValue).toArray();
    }
   
   //2. No positive numbers
   if(pos.size()==0){
    for(int i=0;i<neg.size();i++){
        neg.set(i,neg.get(i)*neg.get(i));
    }
    Collections.reverse(neg);
    return neg.stream().mapToInt(Integer::intValue).toArray();
   }

   //3. Both negative and positive numbers present
   int i=0, j=0, id=0;
   int n1 = neg.size();
   int p1 = pos.size();
   int[] res=new int[n1+p1];

   for(int k=0;k<n1;k++){
        neg.set(k,neg.get(k)*neg.get(k));
    }
    Collections.reverse(neg);

    for(int k=0;k<p1;k++){
            pos.set(k,pos.get(k)*pos.get(k));
        }

        i=0;
        while(i<n1 && j<p1){
            if(neg.get(i)<=pos.get(j)){
                res[id] = neg.get(i);
                id++;
                i++;
            }else{
                res[id] = pos.get(j);
                id++;
                j++;
            }
        }

        while(i<n1){
            res[id++] = neg.get(i++);
        }

        while(j<p1){
            res[id++] = pos.get(j++);
        }
        
        return res;
    }
}