//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            boolean flag = ob.armstrongNumber(n);
            if (flag) {
                System.out.println("true");

            } else {
                System.out.println("false");
            }
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        String str = Integer.toString(n);
        int org = n;
        int sum = 0;
        for(int i = 0;i < str.length();i++){
            int rem = n % 10;
            int cube = rem*rem*rem;
            sum += cube;
            n /= 10;
        }
        if(sum == org){
            return true;
        }
        return false;
    }
}