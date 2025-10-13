import java.util.*;
/**
 * Problem: Valid Sudoku
 * ---------------------
 * Determine if a 9x9 Sudoku board is valid.
 *
 * A valid Sudoku board (partially filled) must satisfy the following rules:
 * 1. Each row must contain the digits 1-9 without repetition.
 * 2. Each column must contain the digits 1-9 without repetition.
 * 3. Each of the nine 3x3 sub-boxes must contain the digits 1-9 without repetition.
 *
 * Example:
 * Input:
 * [
 *   ["5","3",".",".","7",".",".",".","."],
 *   ["6",".",".","1","9","5",".",".","."],
 *   [".","9","8",".",".",".",".","6","."],
 *   ["8",".",".",".","6",".",".",".","3"],
 *   ["4",".",".","8",".","3",".",".","1"],
 *   ["7",".",".",".","2",".",".",".","6"],
 *   [".","6",".",".",".",".","2","8","."],
 *   [".",".",".","4","1","9",".",".","5"],
 *   [".",".",".",".","8",".",".","7","9"]
 * ]
 * Output: true
 *
 * Approach:
 * Use three sets to track seen numbers in rows, columns, and boxes.
 *
 * Time Complexity: O(1) - The board size is fixed (9x9).
 * Space Complexity: O(1) - The space used is constant due to fixed size.
 */
public class SudokuValidity {
    HashSet<String> seen = new HashSet<>();

    public static Boolean isValidSudoku(char [] [] board){
        HashSet<String> seen = new HashSet<>();
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                if(board[i][j]=='.'){
                    continue;
                }
                if(!seen.add(board[i][j]+" in row "+ i)){
                    return false;
                }
                if(!seen.add(board[i][j]+" in column "+ j)){
                    return false;
                }
                int boxNumber = (1/3)*3 + (j/3);
                if(!seen.add(board[i][j]+ " in box "+ boxNumber)){
                    return false;
                }
            }
        }
        return true;

    }

    public static void main(String[] args) {
        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        System.out.println("Is valid Sudoku: " + isValidSudoku(board));
    }
}
