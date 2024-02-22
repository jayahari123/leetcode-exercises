class Solution {
    public int arrangeCoins(int n) {
        int i=0;
        if(n==1){
            return n;
        }
        while(n>=0){
            i++;
            
            n=n-i;
        }
        return i-1;
    }
}