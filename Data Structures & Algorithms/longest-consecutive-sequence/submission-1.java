class Solution {
    public int longestConsecutive(int[] nums) {
        
        int max=Integer.MIN_VALUE;
        if(nums.length==0){
            return 0;
        }
        HashMap<Integer,Integer> hm =new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                continue;
            }
            else{
                hm.put(nums[i],0);
            }
        }

        for (int i=0;i<nums.length;i++){
            if(!hm.containsKey(nums[i]-1)){
                int c=0;
                while(hm.containsKey(nums[i]+c)){
                    c++;
                }
                max=Math.max(max,c);
            }
        }
        return max;
    }
}
