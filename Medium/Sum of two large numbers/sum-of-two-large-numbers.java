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
            String x = read.readLine();
            String y = read.readLine();
            Solution ob = new Solution();
            String result = ob.findSum(x, y);

            System.out.println(result);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    String findSum(String X, String Y) {
              int len1 = X.length();
        int len2 = Y.length();
        
        StringBuilder ans = new StringBuilder();
        int sum = 0;
        int carry = 0;
        
        int end1 = len1 - 1;
        int end2 = len2 - 1;
        
        while (end1 >= 0 || end2 >= 0 || carry != 0) {
            
            int v1 = 0;
            int v2 = 0;
            
            if (end1 >= 0) {
                v1 = X.charAt(end1) - '0';
            }
            if (end2 >= 0) {
                v2 = Y.charAt(end2) - '0';
            }
            
            sum = v1 + v2 + carry;
            carry = sum / 10;
            
            ans.append(sum % 10);
            
            end1--;
            end2--;
        }
        
        String result = ans.reverse().toString();
        result = removeStartZeros(new StringBuilder(result), result.length());
        if (result.isEmpty()) {
            return "0";
        }
        
        return result;
        
    }
    
    private String removeStartZeros(StringBuilder str, int size) {
        
        int start = 0;
        
        while (start < size) {
            if (str.charAt(start) == '0') {
                str.setCharAt(start, ' ');
            }
            else {
                break;
            }
            
            start++;
        }
        
        return str.toString().trim();
    }
}