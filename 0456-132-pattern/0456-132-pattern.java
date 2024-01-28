import java.util.Stack;

class Solution {
    public boolean find132pattern(int[] nums) {
        if (nums.length < 3) {
            return false;
        }

        int[] minArray = new int[nums.length];
        minArray[0] = nums[0];

        // Create an array to store the minimum value up to each index.
        for (int i = 1; i < nums.length; i++) {
            minArray[i] = Math.min(minArray[i - 1], nums[i]);
        }

        Stack<Integer> stack = new Stack<>();

        // Iterate from the end to find the 132 pattern.
        for (int j = nums.length - 1; j >= 0; j--) {
            // Check if nums[j] is a potential candidate for the second element in the 132 pattern.
            if (nums[j] > minArray[j]) {
                // Pop elements from the stack that are less than nums[j].
                while (!stack.isEmpty() && stack.peek() <= minArray[j]) {
                    stack.pop();
                }

                // Check if there is an element in the stack greater than minArray[j].
                if (!stack.isEmpty() && stack.peek() < nums[j]) {
                    return true;
                }

                // Push nums[j] onto the stack.
                stack.push(nums[j]);
            }
        }

        return false;
    }
}
