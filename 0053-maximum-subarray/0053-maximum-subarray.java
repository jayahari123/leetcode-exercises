class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
            ans=Math.max(ans,nums[i]);
        for(int i=0;i<nums.length;i++){
            if(nums[i]+sum<0){
                sum=0;
                continue;
            }
            else{
                sum=sum+nums[i];
                ans=Math.max(sum,ans);
            }
        }
        return ans;
    }
}