class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    Map<Integer, Integer> countMap = new HashMap<>();
    List<Integer>[] bucket = new List[nums.length+1];
    

    for(int num : nums ){
                countMap.put(num,countMap.getOrDefault(num,0)+1);
    }

    for(int i = 0; i<bucket.length;i++){
        bucket[i] = new ArrayList<>();
    }

    for(Map.Entry<Integer,Integer> entrySet: countMap.entrySet()){
        bucket[entrySet.getValue()].add( entrySet.getKey());
    }


    int j= 0;
    int[] res = new int[k];    
    for(int i=bucket.length-1; k>j ; i--){
    if(bucket[i]!=null){
        for(int num : bucket[i]){
            res[j++]= num;

            if(j==k){
            return res;
            }
        }
    }
    }
    return res;
    }


}
