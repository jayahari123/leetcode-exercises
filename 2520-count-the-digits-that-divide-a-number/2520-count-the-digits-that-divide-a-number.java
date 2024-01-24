class Solution {
    public int countDigits(int num) {
        int che=num;
        int sum=0;
        while(che!=0){
            int dig=che%10;
            che=che/10;
            if(num%dig==0){
                sum++;
            }
        }
        return sum;
    }
}