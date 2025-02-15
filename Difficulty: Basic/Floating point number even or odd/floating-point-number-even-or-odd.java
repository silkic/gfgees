//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(read.readLine());
            String s = read.readLine().trim(); 
            Solution obj = new Solution();
            if(obj.isEven(s,n))
                System.out.println("EVEN");
            else
                System.out.println("ODD");
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    boolean isEven(String s,int n) 
    { 
        // code here
        int i = n - 1;
        while(s.charAt(i) != '.'){
            if(s.charAt(i) != '0'){
                if((s.charAt(i) - '0') % 2 == 0){
                    return true;
            }
            else{
                return false;
            }
        }
        i--;
    }
    if((s.charAt(i-1)-'0') % 2 == 0){
        return true;
    }
    return false;
}
}