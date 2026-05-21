class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod=1;int c=0;int x=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0 && c==0){
                c++;
                x=i;
                continue;
            }
            if(nums[i]==0 && c==1){
                c=2;
                break;
            }
            prod=prod*nums[i];
        }
        int ans[]=new int[nums.length];
        if(c==2){
            return ans;
        }
        if(c==1){
            ans[x]=prod;
            return ans;
        }
        for(int i=0;i<nums.length;i++){
            ans[i]=prod/nums[i];
        }
        return ans;
    }
}  
