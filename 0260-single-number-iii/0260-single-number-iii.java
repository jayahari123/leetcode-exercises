class Solution {
   public int[] singleNumber(int[] nums) {
        // Step 1: Get the XOR of the two single numbers
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }
        
        // Step 2: Find the rightmost set bit in the XOR result
        int rightmostSetBit = 1;
        while ((rightmostSetBit & xor) == 0) {
            rightmostSetBit <<= 1;
        }
        
        // Step 3: Partition the array into two groups based on the rightmost set bit
        int num1 = 0, num2 = 0;
        for (int num : nums) {
            if ((num & rightmostSetBit) == 0) {
                num1 ^= num;
            } else {
                num2 ^= num;
            }
        }
        
        return new int[]{num1, num2};
    }
}