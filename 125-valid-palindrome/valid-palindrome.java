class Solution {
    public boolean isPalindrome(String s) {
       /* String str = s.replaceAll("[^a-zA-Z0-9]", "");
        char[] charArray = str.toCharArray();

        int l = 0, r = charArray.length - 1;
        while (l < r) {
            if (Character.toLowerCase(charArray[l]) == Character.toLowerCase(charArray[r])) {
                l++;
                r--;
            } else {
                return false;
            }
        }
        return true;*/

       
        String str=s.replaceAll("[^a-zA-Z0-9]", "");
         int l=0, r= str.length()-1;
        while(l<r){
        if(Character.toLowerCase(str.charAt(l))==Character.toLowerCase(str.charAt(r))){
            l++;
            r--;
        }else{
            return false;
        }
    }
    return true;
}
}