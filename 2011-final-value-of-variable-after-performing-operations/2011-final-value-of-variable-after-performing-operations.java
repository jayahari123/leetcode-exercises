class Solution {
    public int finalValueAfterOperations(String[] operations) {
       int sum=0;
        String a= "X++";
        String b="++X";
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals(a) || operations[i].equals(b)){
                sum++;
            }
            else{
                sum--;
            }
            
        }
        return sum;
    }
}