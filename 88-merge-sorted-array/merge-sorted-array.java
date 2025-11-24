class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        for(int i = nums1.length-1;i>=0;i--){
            if(n>0 && m>0){
            if(nums1[m-1]>nums2[n-1]){
                nums1[i] = nums1[m-1];
                m--;
            }else{
                nums1[i] = nums2[n-1];
                n--;
            }
        }
       else if(n>0 && m<=0){
            nums1[i]=nums2[n-1];
            n--;
        }
        }
    }
}


//start from left-- check if n1<n2-- keep n1-- inc i for n1-- check again-- if n1>n2-- n1[i]=n2 and previous n1[i] = n[i+1]

//start at right -- n1 non zero from back continue till then-- non zero n1[i] compare wuth last of n2[j]-- whichever big-- put in n1[m]

//m is non zero ele, not size