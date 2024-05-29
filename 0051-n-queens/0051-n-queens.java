class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> solutions = new ArrayList<>();
        boolean[][] board = new boolean[n][n];
        placeQueens(board, 0, solutions);
        return solutions;
    }

    static void placeQueens(boolean[][] board, int row, List<List<String>> solutions) {
        if (row == board.length) {
            List<String> solution = new ArrayList<>();
            for (boolean[] rowArray : board) {
                StringBuilder sb = new StringBuilder();
                for (boolean cell : rowArray) {
                    sb.append(cell ? 'Q' : '.');
                }
                solution.add(sb.toString());
            }
            solutions.add(solution);
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                placeQueens(board, row + 1, solutions);
                board[row][col] = false;
            }
        }
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }

        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j]) {
                return false;
            }
        }

        for (int i = row, j = col; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j]) {
                return false;
            }
        }

        return true;
    }
}
    
