//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java

//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    int sizeOfArray = Integer.parseInt(br.readLine());
		    int arr [] = new int[sizeOfArray];
		    
		    String line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    for(int i = 0;i<sizeOfArray;i++){
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    
		    Complete obj = new Complete();
		    arr = obj.greaterElement(arr, sizeOfArray);
		    for(int i=0; i< sizeOfArray;i++){
		        if(arr[i] == -10000000)
		            System.out.print("_ ");
		        else
		            System.out.print(arr[i] + " ");
		    }
		    System.out.println();
		}
	}
}



// } Driver Code Ends


//User function Template for Java

//User function Template for Java

//User function Template for Java

            

class Complete{
    
   
    // Function for finding maximum and value pair
    public static int[] greaterElement (int arr[], int n) {
          int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);
        int[] result = new int[n];
        
        for (int i = 0; i < n; i++) {
            int nextGreater = findNextGreater(sortedArr, arr[i]);
            result[i] = nextGreater;
        }
        
        return result;
    }
    
    private static int findNextGreater(int[] sortedArr, int target) {
        int left = 0;
        int right = sortedArr.length - 1;
        int result = -10000000;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (sortedArr[mid] > target) {
                result = sortedArr[mid];
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        
        return result;
    }
}