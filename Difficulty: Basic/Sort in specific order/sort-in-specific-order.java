//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Solution ob = new Solution();
            ob.sortIt(a, n);
            StringBuilder output = new StringBuilder();
            for(int i=0;i<n;i++)
            output.append(a[i]+" ");
            System.out.println(output);
            
        }
	}
}


// } Driver Code Ends

class Solution{
//User function Template for Java
public void sortIt(long arr[], long n)
    {
        List<Long> oddlist = new ArrayList<>();//create list for odd 
        List<Long> evenlist = new ArrayList<>();//create list for even
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                evenlist.add(arr[i]); //add num to even list if it is even num 
            }else{
                oddlist.add(arr[i]); // add num to odd list if it is odd num
            }
        }
        Collections.sort(evenlist); // sort in acsending order
        Collections.sort(oddlist,Collections.reverseOrder()); // sort in desending order
        int index =0;
        for(Long num : oddlist ){
            arr[index++] = num; // modify the arr
        }
        for(long num1 : evenlist){
            arr[index++] = num1;
        }
    }
    }