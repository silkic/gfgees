//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String s = br.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.reverse(s));                        
        }
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String reverse(String str)
    {
        int n = str.length();
        char[] ch = str.toCharArray();
        int low = 0;
        int high = ch.length-1;
        while(low < high){
            if(!Character.isLetterOrDigit(ch[low])){
                low++;
            }
            else if(!Character.isLetterOrDigit(ch[high])){
                high--;
            }
            else{
                char temp = ch[low];
                ch[low] = ch[high];
                ch[high] = temp;
                low++;
                high--;
            }
        }
        return new String(ch);
    }
}