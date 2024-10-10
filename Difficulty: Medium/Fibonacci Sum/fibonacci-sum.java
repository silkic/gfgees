//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
// User function Template for Java
class Solution {
    static long fibSum(long N) {
        long mod = 1000000007;
        long first = 0;
        long sec = 1;
        long sum = 1;
        if(N == 0 || N == 1){
            return N;
        }
        for(int i = 2; i <= N; i++){
            long temp = (first + sec) % mod;
            sum += temp;
            first = sec;
            sec = temp;
        }
        return sum % mod;
    }
}

//{ Driver Code Starts.
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            long N = Long.parseLong(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.fibSum(N));
        }
    }
}
// } Driver Code Ends