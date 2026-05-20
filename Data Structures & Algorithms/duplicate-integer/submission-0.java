class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hm= new HashSet<>();
        int flag=0;
        for(int i=0;i<nums.length;i++){
            
            if(hm.contains(nums[i])){
                flag++;
                break;
            }
            else{
                hm.add(nums[i]);
            }
        }
        if(flag==0)
        return false;
        else
        return true;
    }
}