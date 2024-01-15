class Solution {
    
    public boolean bs(int[][] matrix,int row, int start, int end, int target){
        while(start <= end){
            int mid = start - ( start - end) / 2;
            if(target == matrix[row][mid]) return true;
            else if(target < matrix[row][mid]) end = mid-1;
            else if(target > matrix[row][mid]) start = start + 1;
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        
        //finding potential row
        int m = matrix[0].length-1;
        int sRow = 0;
        int eRow = matrix.length-1;
        while(sRow <= eRow){
            int mid = sRow - (sRow - eRow)/2;
            if(target == matrix[mid][0] || target == matrix[mid][m]) return true;
            else if(target > matrix[mid][0] && target < matrix[mid][m]){
                return bs(matrix, mid, 0, m, target);
            }
            else if(target < matrix[mid][0]){
                eRow = mid - 1;
            }
            else if(target > matrix[mid][m]){
                sRow = mid + 1;
            }
        }
        
        
        return false;
    }
    
    
}