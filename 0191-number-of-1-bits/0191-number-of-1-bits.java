public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int a;
        int c=0;
        while (n!=0){
            a=n&1;
            if(a==1){
                c=c+1;
            }
            n>>>=1;
        }
        return c;
    }
}