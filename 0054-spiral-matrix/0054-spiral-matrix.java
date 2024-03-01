import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        if (matrix == null || matrix.length == 0) {
            return list;
        }

        int bot = matrix.length - 1;
        int rig = matrix[0].length - 1;
        int top = 0;
        int lef = 0;

        while (top <= bot && lef <= rig) {
            for (int i = lef; i <= rig; i++) {
                list.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i <= bot; i++) {
                list.add(matrix[i][rig]);
            }
            rig--;
            if (top <= bot) { // Check if top is still less than or equal to bottom
                for (int i = rig; i >= lef; i--) {
                    list.add(matrix[bot][i]);
                }
                bot--;
            }
            if (lef <= rig) { // Check if left is still less than or equal to right
                for (int i = bot; i >= top; i--) {
                    list.add(matrix[i][lef]);
                }
                lef++;
            }
        }

        return list;
    }
}
