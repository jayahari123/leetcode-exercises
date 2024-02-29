class Solution {
    public double average(int[] salary) {
        double total=0;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i:salary){
            if(i>max) {
                max=i;
            }
            if(i<min) {
                min=i;
            }
        }
        for(int i:salary) {
            if(i!=max && i!=min) {
                total= total+i;
            }
        }
        return total/(salary.length-2);
    }
}