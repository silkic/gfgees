//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isTwistedPrime(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int isTwistedPrime(int N) {
        // code here
        if(!isprime(N)){
            return 0;
        }
        int rev = reverse(N);
        if(!isprime(rev)){
            return 0;
        }
        return 1;
    }
        boolean isprime(int N){
            if(N <= 1){
                return false;
            }
            int n = (int)Math.sqrt(N);
            for(int i = 2; i<=n;i++){
                if(N % i == 0){
                    return false;
                }
            }
            return true;
        }
        int rev = 0;
        int reverse(int N){
            while(N != 0){
            int rem = N % 10;
            rev = rev * 10 + rem;
            N /= 10;
        }
        return rev;
    }
}