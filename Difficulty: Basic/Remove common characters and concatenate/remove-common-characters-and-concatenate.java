//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        
        while(t--!=0){
            String s1=in.next(),
                   s2=in.next();
            
            Solution obj = new Solution();
            
            System.out.println(obj.concatenatedString(s1,s2));
        }
    }
}

// } Driver Code Ends


class Solution
{
    //Function to remove common characters and concatenate two strings.
    public static String concatenatedString(String s1,String s2)
    {
       StringBuilder res = new StringBuilder();
       int length_S1 = s1.length();
       for(int i = 0 ; i < length_S1 ; i++)
       {
           char c1 = s1.charAt(i);
            if(s2.indexOf(c1) < 0)
                res.append(c1);
       }
       int length_S2 = s2.length();
       for(int i = 0 ; i < length_S2 ; i++)
       {
           char c2 = s2.charAt(i);
            if(s1.indexOf(c2) < 0)
                res.append(c2);
       }
       if(res.length() > 0)
        return res.toString();
       return "-1";    
    }
}