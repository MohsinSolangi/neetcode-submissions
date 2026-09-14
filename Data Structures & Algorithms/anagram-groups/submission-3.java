class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>> map =new HashMap<>();

        for(int i =0; i<strs.length; i++){
            String word = strs[i];
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String key  = new String(charArray);
            
            map.putIfAbsent(key,new ArrayList<>());
                map.get(key).add(word);
        }
        return new ArrayList<>(map.values());
    
    }
}
