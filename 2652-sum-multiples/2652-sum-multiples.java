class Solution {
    public int sumOfMultiples(int n) {
        int w=0;
        while(n!=0){
            if(n%3==0||n%5==0||n%7==0){
                w+=n;
            }
            n--;
        }
        return w;
    }
}