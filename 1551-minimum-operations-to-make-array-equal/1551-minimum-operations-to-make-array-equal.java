class Solution {
    public int minOperations(int n) {
        int targetValue = 0;

        // Calculate the target value
        for (int i = 0; i < n; i++) {
            targetValue += (2 * i) + 1;
        }
        targetValue /= n;

        int operations = 0;

        // Calculate operations for each element
        for (int i = 0; i < n; i++) {
            int currentValue = (2 * i) + 1;
            operations += Math.abs(currentValue - targetValue);
        }

        return operations / 2; // Since each operation involves two elements
    }
}
