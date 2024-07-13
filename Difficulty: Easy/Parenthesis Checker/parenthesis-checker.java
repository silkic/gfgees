//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        //Reading total number of testcases
        int t= sc.nextInt();
        
        while(t-- >0)
        {
            //reading the string
            String st = sc.next();
            
            //calling ispar method of Paranthesis class 
            //and printing "balanced" if it returns true
            //else printing "not balanced"
            if(new Solution().ispar(st) == true)
                System.out.println("balanced");
            else
                System.out.println("not balanced");
        
        }
    }
}
// } Driver Code Ends



class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        // add your code here
              Stack<Character> stack = new Stack<>();

        // Iterate through each character in the string
        for (char ch : x.toCharArray()) {
            // If it's an opening bracket, push it onto the stack
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } 
            // If it's a closing bracket, check for balance
            else if (ch == ')' || ch == ']' || ch == '}') {
                // If stack is empty, it means there's no matching opening bracket
                if (stack.isEmpty()) {
                    return false;
                }
                // Pop the top of the stack and check if it matches the current closing bracket
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == ']' && top != '[') ||
                    (ch == '}' && top != '{')) {
                    return false;
                }
            }
        }

        // If the stack is empty, all brackets were balanced
        return stack.isEmpty();
    }
}