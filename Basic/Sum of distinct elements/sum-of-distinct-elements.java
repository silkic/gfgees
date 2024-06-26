//{ Driver Code Starts
//Initial Template for Java





import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().findSum(arr, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution {
    int findSum(int arr[], int n) {
        // code here
        Arrays.sort(arr);
        int sum = arr[0];
        for(int i = 0;i < n-1;i++){
            int j = i+1;
            if(arr[i] != arr[j]){
                sum += arr[j];
            }
        }
        return sum;
    }
}