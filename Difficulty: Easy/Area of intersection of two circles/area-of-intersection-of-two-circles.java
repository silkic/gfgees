//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s[] = read.readLine().split(" ");
            double X1, Y1, R1, X2, Y2, R2;
            X1 = Double.parseDouble(s[0]);
            Y1 = Double.parseDouble(s[1]);
            R1 = Double.parseDouble(s[2]);
            X2 = Double.parseDouble(s[3]);
            Y2 = Double.parseDouble(s[4]);
            R2 = Double.parseDouble(s[5]);
            Solution ob = new Solution();
            long ans = ob.intersectionArea(X1, Y1, R1, X2, Y2, R2);
            System.out.println(ans);
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    long intersectionArea(double X1, double Y1, double R1, double X2, double Y2,
                          double R2) {
         double d = Math.sqrt((X2 - X1) * (X2 - X1) + (Y2 - Y1) * (Y2 - Y1));
        
        // No intersection
        if (d >= R1 + R2) return 0;
        
        // One circle completely inside the other
        if (d <= Math.abs(R1 - R2)) {
            double smallerArea = 3.14 * Math.min(R1, R2) * Math.min(R1, R2);
            return (int) Math.floor(smallerArea);
        }

        double r1Sq = R1 * R1;
        double r2Sq = R2 * R2;

        double alpha = 2 * Math.acos((r1Sq + (d * d) - r2Sq) / (2 * R1 * d));
        double beta = 2 * Math.acos((r2Sq + (d * d) - r1Sq) / (2 * R2 * d));

        double area1 = 0.5 * r1Sq * (alpha - Math.sin(alpha));
        double area2 = 0.5 * r2Sq * (beta - Math.sin(beta));

        return (int) Math.floor(area1 + area2);
    }
};