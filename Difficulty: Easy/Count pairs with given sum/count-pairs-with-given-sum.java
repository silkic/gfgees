//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());

        while (t-- > 0) {
            int k = Integer.parseInt(read.readLine().trim());
            String line = read.readLine().trim();
            String[] numsStr = line.split(" ");
            int[] nums = new int[numsStr.length];
            for (int i = 0; i < numsStr.length; i++) {
                nums[i] = Integer.parseInt(numsStr[i]);
            }

            Solution obj = new Solution();
            int ans = obj.getPairsCount(nums, k);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends

class Solution {
    int getPairsCount(int[] arr, int sum) {
        // Create a HashMap to store the frequency of elements
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        int count = 0;

        // Traverse the array and populate the frequency map
        for (int i = 0; i < arr.length; i++) {
            // Check if there is a number that can be added to arr[i] to get the sum
            if (freqMap.containsKey(sum - arr[i])) {
                count += freqMap.get(sum - arr[i]);
            }

            // Update the frequency map
            freqMap.put(arr[i], freqMap.getOrDefault(arr[i], 0) + 1);
        }

        return count;
    }
}