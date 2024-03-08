class Solution {
    public int maxFrequencyElements(int[] nums) {
        int maxelement=0;
        int result=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>maxelement){
                maxelement=nums[i];
            }
        }
        int count[]=new int[maxelement+1];
        for(int i=0;i<nums.length;i++){
            count[nums[i]]++;
        }
        int maxFrequency=0;
        for(int i=0;i<count.length;i++){
            if(count[i]>maxFrequency){
                maxFrequency=count[i];
            }
        }
        for(int i=0;i<count.length;i++){
            if(count[i]==maxFrequency){
               result+=count[i];
            }
        }
        return result;
    }
}