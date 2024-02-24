class Solution {
    public void rotate(int[][] matrix) {
        int [][]ans=new int[matrix.length][matrix.length];
       int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                ans[j][i]=matrix[n-i-1][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=ans[i][j];
            }
        }
    }
}