class Solution {
    public int mySqrt(int x) {
       int start =1;
       int end= x;

       if(x<2){
           return x;
       }

       while(start<=end){
           int mid = start+(end-start)/2;
           if((long)mid*(long)mid==(long)x){
               return mid;
           }
           else if((long)mid*(long)mid<(long)x){
               start=mid+1;
           }
           else{
               end=mid-1;

           }
       }
       return Math.round(end);
    }
}