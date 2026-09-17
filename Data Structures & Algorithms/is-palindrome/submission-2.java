class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        String LCStr = s.toLowerCase(); 
        while(left<right){
            while(!Character.isLetterOrDigit(LCStr.charAt(left)) && left<right){
                left++;
            }
            while(!Character.isLetterOrDigit(LCStr.charAt(right)) && left<right){
                right--;
            }
            if(LCStr.charAt(left)!=LCStr.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;

    }
}
