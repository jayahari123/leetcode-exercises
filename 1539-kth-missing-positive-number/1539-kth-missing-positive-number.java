class Solution {
    public int findKthPositive(int[] arr, int k) {
        int yo = 0;
        int index = 0;
        int count = 0;

        while (count < k) {
            yo++;
            if (index < arr.length && arr[index] == yo) {
                index++;
            } else {
                count++;
            }
        }

        return yo;
    }
}
