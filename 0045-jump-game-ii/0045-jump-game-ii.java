class Solution {
    public int jump(int[] nums) {
         int max = 0; int a = 0; int b = 0; int n = nums.length;

        for(int i = 0; i < n-1; i++){
            max = Math.max(max, i + nums[i]);
          
            if(i == a){
                b++;   
                a = max;
            }
        }
        return b;
    }
}