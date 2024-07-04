//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine().trim());
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            System.out.println(ob.longestCommonPrefix(n, arr));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    String longestCommonPrefix(int n, String arr[]) {
        if(n == 0){
            return "-1";
        }
        String res = arr[0];
        for(int i = 1; i < n;i++){
            while(arr[i].indexOf(res) != 0){
                res = res.substring(0,res.length()-1);
                    if(res.isEmpty()){
                        return "-1";
                    }
                }
            }
        return res;
    }
}