class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        for(int i=0;i<n;i++){
            sort(mat, 0, i, m, n);
        }

        for(int j=1;j<m;j++){
            sort(mat, j, 0, m, n);
        }

        return mat;
    }

    public static void sort(int mat[][], int row, int col, int m, int n){
        List<Integer> temp = new ArrayList<>();
        int r = row;
        int c = col;
        int q = 0;

        while(r<m && c<n){
            temp.add(mat[r][c]);
            r++;
            c++;
        }
        Collections.sort(temp);

        r = row;
        c = col;
        while(r<m && c<n){
            mat[r][c] = temp.get(q);
            r++;
            c++;
            q++;
        }
    }

}