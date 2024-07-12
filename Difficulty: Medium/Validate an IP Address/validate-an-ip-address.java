//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.util.*;
import java.io.*;

  public class validip {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            Solution obj = new Solution();

            if (obj.isValid(s))
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    public boolean isValid(String s) {
      String[] str = s.split("\\.");
        
        if (str.length != 4) {
            return false;
        }
        if (s.endsWith(".")) {
            return false;
        }
        if (s.length() < 7 || s.length() > 15) {
            return false;
        }
        
        for (String part : str) {
            try {
                int num = Integer.parseInt(part);
                if (part.length() > 1 && part.charAt(0) == '0') {
                    return false; // Leading zeroes are not allowed except for '0' itself
                }
                if (num < 0 || num > 255) {
                    return false;
                }
            } catch (NumberFormatException e) {
                return false;
            }
        }
        
        return true;
    }
}