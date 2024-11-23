//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Read the number of test cases (t)
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            int k = Integer.parseInt(br.readLine().trim());
            String input = br.readLine().trim();

            // Split the input line into integers and store them in the array
            String[] tokens = input.split(" ");
            int[] arr = new int[tokens.length];
            for (int i = 0; i < tokens.length; i++) {
                arr[i] = Integer.parseInt(tokens[i]);
            }

            // Create an instance of the Solution class
            Solution ob = new Solution();

            // Call the getMinDiff method
            int res = ob.getMinDiff(k, arr);

            // Print the result
            System.out.println(res);
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    public int getMinDiff(int k, int[] arr) {
        // code here
          if (arr.length <= 1) {
            return 0;
        }
        
        // Sort the array to easily access smallest and largest elements
        Arrays.sort(arr);
        
        // Initialize the minimum difference
        int mindiff = arr[arr.length - 1] - arr[0];
        
        // We check the effect of adding/subtracting k to the smallest and largest elements
        int small = arr[0] + k;  // smallest element + k
        int large = arr[arr.length - 1] - k;  // largest element - k
        
        // Loop through the array and evaluate the minimum difference
        for (int i = 1; i < arr.length; i++) {
            int min = Math.min(small, arr[i] - k);  // For each element, check adding/subtracting k
            int max = Math.max(large, arr[i - 1] + k);
            
            mindiff = Math.min(mindiff, max - min);
        }
        
        return mindiff;
    }
}