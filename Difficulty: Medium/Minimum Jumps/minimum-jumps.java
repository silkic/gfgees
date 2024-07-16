//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int size = Integer.parseInt(br.readLine());
            String[] arrStr = ((String)br.readLine()).split("\\s+");
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = Integer.parseInt(arrStr[i]);
            }
            System.out.println(new Solution().minJumps(arr, size));
        }
    }
}

// } Driver Code Ends


class Solution {
    static int minJumps(int[] arr, int n) {
        if(n <= 1){
            return 0;
        }
        int jumps = 1;
        int far = arr[0];
        int curr = arr[0];
        for(int i= 1; i< n;i++){
            if(i > far){
                return -1;
            }
            if(i > curr){
                jumps++;
                curr = far;
            }
            far = Math.max(far,i+arr[i]);
        }
        return jumps;
    }
}