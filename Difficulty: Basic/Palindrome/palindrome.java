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
        
System.out.println("~");
}
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String is_palindrome(int n)
    {
        int org = n;
        String s = Integer.toString(n);
        String str = "";
        for(int i = 0; i < s.length();i++)
        {
            int rem = n % 10;
            str += rem;
            n /= 10;
        }
        int res = Integer.parseInt(str);
        if(res == org){
            return "Yes";
        }
        return "No";
    }
}