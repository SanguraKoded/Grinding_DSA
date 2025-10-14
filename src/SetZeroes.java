import java.util.*;
/**
 * Problem: Set Matrix Zeroes
 * --------------------------
 * Given an m x n integer matrix, if an element is 0, set its entire row and column to 0.
 *
 * Example:
 * Input: [[1,1,1],[1,0,1],[1,1,1]]
 * Output: [[1,0,1],[0,0,0],[1,0,1]]
 *
 * Approach:
 * - Use the first row and first column as markers.
 * - First check if the first row and first column need to be zeroed.
 * - Then use the rest of the matrix to set markers.
 * - Finally, zero out cells based on markers and handle the first row and column.
 *
 * Time Complexity: O(m*n)
 * Space Complexity: O(1)
 */

class SetZeroes {

    public static int [][] setZeroes(int [][] matrix){
        boolean firstColZero = false;
        boolean firstRowZero = false;

        for(int i = 0; i<matrix.length; i++){
            if(matrix[i][0]==0){
                firstColZero = true;
                break;
            }
        }
        for(int j = 0; j<matrix[0][j]; j++){
            if(matrix[0][j]==0){
                firstRowZero = true;
                break;
            }
        }

        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[i].length; j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[i].length; j++){
                if(matrix[0][j] ==0 || matrix[i][0]==0){
                    matrix[i][j]=0;
                }
            }
        }
        if(firstColZero){
            for(int i =0; i<matrix.length; i++){
                matrix[i][0]=0;
            }
        }
        if(firstRowZero){
            for(int j =0; j<matrix[0].length; j++){
                matrix[0][j]=0;
            }
        }
        return matrix;
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1,1,1},
            {1,0,1},
            {1,1,1}
        };
        int[][] result = setZeroes(matrix);
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }
}
