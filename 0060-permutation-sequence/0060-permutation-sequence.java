import java.util.ArrayList;

class Solution {
    public String getPermutation(int n, int k) {
        
        int[] factorial = new int[n + 1];
        factorial[0] = 1;
        for (int i = 1; i <= n; i++) {
            factorial[i] = factorial[i - 1] * i;
        }

        StringBuilder result = new StringBuilder();
        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            nums.add(i);
        }

        k--; 
        for (int i = 1; i <= n; i++) {
            int index = k / factorial[n - i];
            result.append(nums.get(index));
            nums.remove(index);
            k %= factorial[n - i];
        }

        return result.toString();
    }
}
