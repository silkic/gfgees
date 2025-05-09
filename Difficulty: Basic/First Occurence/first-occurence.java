//{ Driver Code Starts
import java.util.*;

class Implement_strstr {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t > 0) {
            String line = sc.nextLine();
            String a = line.split(" ")[0];
            line = sc.nextLine();
            String b = line.split(" ")[0];

            Solution g = new Solution();
            System.out.println(g.firstOccurence(a, b));

            t--;

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to locate the occurrence of the string x in the string s.
    int firstOccurence(String txt, String pat) {
        // Your code here
        int ind = -1;
        int l = 0;
        int r = 0;
        while(r < txt.length()){
            if(r-l+1 == pat.length()){
                if(txt.substring(l,r+1).equals(pat)){
                    return l;
                }
                l++;
            }
            r++;
        }
        return -1;
    }
}
