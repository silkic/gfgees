//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {

            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Long> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Long.parseLong(token));
            }

            long[] arr = new long[array.size()];
            int idx = 0;
            for (long i : array) arr[idx++] = i;

            Solution obj = new Solution();

            // calling maxSubarraySum() function
            System.out.println(obj.equilibriumPoint(arr));
        }
    }
}

// } Driver Code Ends

class Solution {
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[]) {
        int n = arr.length;
    
        if (n == 1) {
            return 1;
        }
    
        long totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
        }
        
    
        long leftSum = 0;
        long rightSum = totalSum - arr[0]; // rightSum is totalSum - arr[0] initially
        
        // Step 3: Iterate through the array to find equilibrium point
        for (int i = 0; i < n; i++) {
            // Check if current index i is equilibrium point
            if (leftSum == rightSum) {
                return i + 1; // return 1-based index of equilibrium point
            }
            
            // Update leftSum and rightSum for next iteration
            if (i < n - 1) {
                leftSum += arr[i];
                rightSum -= arr[i + 1];
            }
        }
        
        // Step 4: If no equilibrium point is found, return -1
        return -1;
    }
}