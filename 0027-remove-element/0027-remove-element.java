class Solution {
    public int removeElement(int[] nums, int val) {
        int sum=0;
        int arr[]=new int [sum];
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                
                nums[sum++]=nums[i];
            }
        }
       return sum;
    }
}