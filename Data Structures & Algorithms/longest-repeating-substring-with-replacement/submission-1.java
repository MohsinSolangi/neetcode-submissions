
class Solution {
    public int characterReplacement(String s, int k) {
        int l= 0;
        int maxf = 0;
        int res = 0;

        Map<Character ,Integer> map = new HashMap<>();
        for (int r=0; r<s.length();r++){

            map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);
            
            maxf = Math.max(maxf, map.get(s.charAt(r)));

            if((r-l+1)-maxf >k){
                map.put(s.charAt(r) , map.get(s.charAt(r))-1);
                l++;
            }

            res =Math.max(res,r-l+1);

        }

        return res;
    }
}

