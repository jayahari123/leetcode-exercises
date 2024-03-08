import java.util.Arrays;
class Solution {
    public int heightChecker(int[] heights) {
        int[] sorted = Arrays.copyOf(heights,heights.length);
        Arrays.sort(sorted);
        int counter = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != sorted[i]) {
                counter++;
            }
        }
        
        return counter;
    }
}