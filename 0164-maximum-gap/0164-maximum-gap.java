class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int ans=0;
        int length=nums.length;
        for (int k = length - 1; k >= 1; k--) {
            int sub = nums[k] - nums[k - 1];
            if (ans < sub) {
                ans = sub;
            }
        }

        return ans;
    }
}