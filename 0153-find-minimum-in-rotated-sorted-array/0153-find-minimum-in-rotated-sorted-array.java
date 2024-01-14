class Solution {
    public int findMin(int[] nums) {
        int start = 0,end = nums.length - 1;
        
        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] < nums[end]) {
                // The minimum element is in the left half
                end = mid;
            } else {
                // The minimum element is in the right half
                start = mid + 1;
            }
        }
        return nums[start];
    }
}
