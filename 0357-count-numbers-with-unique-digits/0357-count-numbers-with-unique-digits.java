class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 1){
            return 10;
        }

        if (n == 0){
            return 1;
        }

        int prev = 10;
        int first = 9;
        int mult = 9;

        for (int i = 1; i < n; i++){
            first = first * mult;
            mult--;
            prev = first + prev;
            
        }
        return prev;
    }
}