//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


// } Driver Code Ends
// User function Template for Java

import java.util.*;

class Solution {
    void nextPermutation(int[] arr) {
        int n = arr.length;
        int idx = -1;

        // Step 1: Find the first decreasing element from the end
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                idx = i;
                break;
            }
        }

        if (idx == -1) {
            // If no such element is found, reverse the entire array (lowest permutation)
            reverse(arr, 0, n - 1);
            return;
        }

        // Step 2: Find the smallest element greater than arr[idx] from the right
        for (int i = n - 1; i > idx; i--) {
            if (arr[i] > arr[idx]) {
                swap(arr, i, idx);
                break;
            }
        }

        // Step 3: Reverse the subarray after idx to get the smallest lexicographic arrangement
        reverse(arr, idx + 1, n - 1);
    }

    // Swap two elements in the array
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Reverse the array between two indices
    private void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}


//{ Driver Code Starts.

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine()); // Number of test cases
        while (tc-- > 0) {
            String[] inputLine = br.readLine().split(" ");
            int[] arr = new int[inputLine.length];
            for (int i = 0; i < inputLine.length; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            int N = arr.length;
            Solution ob = new Solution();
            ob.nextPermutation(arr); // Generate the next permutation
            StringBuilder out = new StringBuilder();
            for (int i = 0; i < N; i++) {
                out.append(arr[i] + " "); // Corrected: use arr[i] instead of arr.get(i)
            }
            System.out.println(out.toString().trim()); // Print the output

            System.out.println("~");
        }
    }
}
// } Driver Code Ends