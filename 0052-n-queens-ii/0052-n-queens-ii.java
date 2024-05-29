class Solution {
    public int totalNQueens(int n) {
        boolean boards[][]=new boolean [n][n];
        int count=checkboard(boards,0);
        return count;
    }
    static int checkboard(boolean[][] boards,int row){
                    int count=0;

        if(row==boards.length){
            return 1;
        }
        for(int col=0;col<boards.length;col++){
            if(issafe(boards,row,col)){
                boards[row][col]=true;
                count+= checkboard(boards,row+1);
                boards[row][col]=false;
            }
        }
        return count;
    }
    static boolean issafe(boolean boards[][],int row,int col){
        for(int i=0;i<row;i++){
            if(boards[i][col]){
                return false;
            }
        }
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (boards[i][j]) {
                return false;
            }
        }

        for (int i = row, j = col; i >= 0 && j < boards.length; i--, j++) {
            if (boards[i][j]) {
                return false;
            }
        }
        return true;
    }
}