class Solution {
    public void duplicateZeros(int[] arr) {
        int dups = 0;
        int newLength = arr.length - 1;
        
        for(int i=0;i<=newLength - dups ;i++){
            if(arr[i]==0){
                if(i == newLength - dups){
                    arr[newLength] = 0;
                    newLength -=1;
                    break;
                }
                dups++;
            }
        }

        int last = newLength - dups;
        for(int i= last;i>=0;i--){
            if(arr[i]==0){
                arr[i+dups]=0;
                dups--;
                arr[i+dups]=0;
            }else{
                arr[i+dups]=arr[i];
            }
        }
    }
}