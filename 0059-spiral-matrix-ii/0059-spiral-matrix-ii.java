class Solution {
    public int[][] generateMatrix(int n) {
        int arr[][]=new int[n][n];
        int count=1;
        int top=0,bot=n-1,lef=0,rig=n-1;
      while(top<=bot && lef <= rig){
            for(int i=lef;i<=rig;i++){
                arr[top][i]=count++;
            }
        top++;
         for(int i=top;i<=bot;i++){
                arr[i][rig]=count++;
            }
        rig--;
            for(int i=rig;i>=lef;i--){
                arr[bot][i]=count++;
            }
        bot--;
        for(int i=bot;i>=top;i--){
                arr[i][lef]=count++;
            }
        lef++;}
        
        return arr;
 }
}