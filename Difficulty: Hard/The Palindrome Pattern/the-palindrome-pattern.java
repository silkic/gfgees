//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        Solution ob = new Solution();
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String input_line[] = read.readLine().trim().split("\\s+");
            int n = Integer.parseInt(input_line[0]);
            String input_line1[] = read.readLine().trim().split("\\s+");
            int[][] a = new int[n][n];
            int c = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = Integer.parseInt(input_line1[c]);
                    c++;
                }
            }
            String ans = ob.pattern(a);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    public String pattern(int[][] arr) {
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(prow(arr,i,n))return Integer.toString(i)+" R";
        }
        for(int i=0;i<n;i++){
            if(pcol(arr,i,n))return Integer.toString(i)+" C";
        }
        return "-1";
    }
    
    public boolean prow(int[][] arr,int row,int n){
        int start=0,end=n-1;
        while(start<end){
             if(arr[row][start]!=arr[row][end]) return false;
             start++;
             end--;
        }
        return true;
    }
    
    public boolean pcol(int[][] arr,int col,int n){
        int start=0,end=n-1;
        while(start<end){
             if(arr[start][col]!=arr[end][col]) return false;
             start++;
             end--;
        }
        return true;
    }
}