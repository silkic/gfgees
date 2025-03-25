//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the test cases
        while (t-- > 0) {
            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the Long integers
            ArrayList<Long> array = new ArrayList<>();

            // Parse the tokens into Long integers and add to the array
            for (String token : tokens) {
                array.add(Long.parseLong(token));
            }

            // Convert ArrayList to array
            Long[] arr = new Long[array.size()];
            array.toArray(arr);

            Solution ob = new Solution();
            ob.sortIt(arr);

            StringBuilder output = new StringBuilder();
            for (Long value : arr) {
                output.append(value).append(" ");
            }
            System.out.println(output.toString().trim());
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {

    public void sortIt(Long arr[]) {
        // code here.
        ArrayList<Long> even = new ArrayList<>();
        ArrayList<Long> odd = new ArrayList<>();
        for(Long num : arr){
            if(num % 2 == 0){
                even.add(num);
            }
            else{
                odd.add(num);
            }
        }
        Collections.sort(even);
        odd.sort(Collections.reverseOrder());
        int i = 0;
        for(long num : odd){
            arr[i++] = num;
        }
        for(long num : even){
            arr[i++]=num;
        }
    }
}