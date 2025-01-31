//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = 9;
            int matrix[][] = new int[n][n];
            // String st[] = read.readLine().trim().split("\\s+");
            int k = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ob.solveSudoku(matrix);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) System.out.print(matrix[i][j] + " ");
                System.out.println();
            }
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {

    static void solveSudoku(int[][] mat) {
        boolean[][] rowUsed = new boolean[9][10];
        boolean[][] colUsed = new boolean[9][10];
        boolean[][] boxUsed = new boolean[9][10];

        // Initialize constraints from given board
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (mat[r][c] != 0) {
                    int num = mat[r][c];
                    int boxIndex = (r / 3) * 3 + (c / 3);
                    rowUsed[r][num] = colUsed[c][num] = boxUsed[boxIndex][num] = true;
                }
            }
        }

        // Solve the Sudoku puzzle
        solve(mat, rowUsed, colUsed, boxUsed, 0, 0);
    }

    private static boolean solve(int[][] mat, boolean[][] rowUsed, boolean[][] colUsed, boolean[][] boxUsed, int row, int col) {
        if (row == 9) return true; // Completed the board

        // Move to the next cell
        int nextRow = row + (col + 1) / 9;
        int nextCol = (col + 1) % 9;

        if (mat[row][col] != 0) {
            return solve(mat, rowUsed, colUsed, boxUsed, nextRow, nextCol);
        }

        int boxIndex = (row / 3) * 3 + (col / 3);
        for (int num = 1; num <= 9; num++) {
            if (!rowUsed[row][num] && !colUsed[col][num] && !boxUsed[boxIndex][num]) {
                // Place the number
                mat[row][col] = num;
                rowUsed[row][num] = colUsed[col][num] = boxUsed[boxIndex][num] = true;

                // Recur to solve the next cell
                if (solve(mat, rowUsed, colUsed, boxUsed, nextRow, nextCol)) {
                    return true;
                }

                // Backtrack
                mat[row][col] = 0;
                rowUsed[row][num] = colUsed[col][num] = boxUsed[boxIndex][num] = false;
            }
        }
        return false;
    }
}