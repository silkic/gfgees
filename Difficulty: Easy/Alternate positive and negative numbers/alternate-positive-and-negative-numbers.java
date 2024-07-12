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

            new Solution().rearrange(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends

class Solution {
    void rearrange(int arr[], int n) {
        // code here
int[] pos = new int[n];
        int[] neg = new int[n];
        int posIndex = 0, negIndex = 0;
        
        // Separate positive and negative elements
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                pos[posIndex++] = arr[i];
            } else {
                neg[negIndex++] = arr[i];
            }
        }
        
        int i = 0, k = 0;
        
        // Interleave positive and negative elements
        while (i < posIndex && i < negIndex) {
            arr[k++] = pos[i];
            arr[k++] = neg[i];
            i++;
        }
        
        // Add remaining positive elements
        while (i < posIndex) {
            arr[k++] = pos[i++];
        }
        
        // Add remaining negative elements
        while (i < negIndex) {
            arr[k++] = neg[i++];
        }
    }
}