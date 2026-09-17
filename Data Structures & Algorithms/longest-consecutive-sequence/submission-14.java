class Solution {
    public int longestConsecutive(int[] nums) {
        
        int maxCount = 0;
        Set<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }

        for(int i = 0 ; i<nums.length;i++){
            if(!set.contains(nums[i]-1)){
            int j = 1;
            int count = 1;
            
            while(set.contains(nums[i]+j)){
                count++;
                j++;
            }
             maxCount =Math.max(maxCount,count);

            }
            
        }
        return maxCount;
    }

}
