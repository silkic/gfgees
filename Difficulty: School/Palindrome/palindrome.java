//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            String ans = ob.is_palindrome(n);
            System.out.println(ans);
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String is_palindrome(int n)
    {
        // Code here
        String str = String.valueOf(n);
        int original = n;
        int rev = 0;
        for(int i = 0; i < str.length(); i++){
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        if(original == rev){
            return "Yes";
        }
        return "No";
    }
}