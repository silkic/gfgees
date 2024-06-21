//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class GFG {
    public static void main(String args[]) throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        Solution ob = new Solution();
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String str = read.readLine().trim();
            String ans = ob.compareFrac(str);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {

    String compareFrac(String str) {
        // Code here
        // split by ', ' remember to add space
        String arr[]=str.split(", ");
        

        // split by '/' to separate 2 integers
        String f[] =arr[0].split("/");
        String s[] =arr[1].split("/");
        

        // handle zeros 
        if((f[0].equals("0") || f[1].equals("0")) 
            && (s[0].equals("0") || s[1].equals("0")) )return "equal";
   

       // number comparison    

        Double d1=Double.parseDouble(f[0])/Double.parseDouble(f[1]);
        Double d2=Double.parseDouble(s[0])/Double.parseDouble(s[1]);
        
        if(d1.equals(d2))return "equal";
        else if(d1>d2) return arr[0];
        
        return arr[1];
    }
}