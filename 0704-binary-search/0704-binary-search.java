class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1; // Adjusted end index

        while (start <= end) { // Changed the condition to handle the case when start == end
            int mid = start + (end - start) / 2;

            if (nums[mid] < target) {
                start = mid + 1; // Adjusted the start index
            } else if (nums[mid] > target) {
                end = mid - 1; // Adjusted the end index
            } else {
                return mid;
            }
        }

        return -1; // Return -1 when the target is not found
    }
}
