/**
 * 
 */
package leetcode;

/**
 * @author Isolachine
 *
 */
public class ToeplitzMatrix {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;

        for (int i = 0; i < row; i++) {
            int start = matrix[i][0];
            for (int j = 1; j < column && j < row - i; j++) {
                if (start != matrix[i + j][j]) {
                    return false;
                }
            }
        }

        for (int i = 0; i < column; i++) {
            int start = matrix[0][i];
            for (int j = 1; j < row && j < column - i; j++) {
                if (start != matrix[j][i + j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
