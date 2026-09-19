class Solution {
        public int lengthOfLongestSubstring(String s) {
	    int l = 0;
	    int res = 0;
	    Set<Character> charset = new HashSet<>();
	
	for(int i = 0;i<s.length();i++){
	while(charset.contains(s.charAt(i))){
		charset.remove(s.charAt(l));
l++;

}
charset.add(s.charAt(i));
res = Math.max(res,i-l +1);
	
}
return res;
	}

    
    }

