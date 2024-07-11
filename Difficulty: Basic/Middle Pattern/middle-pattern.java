//{ Driver Code Starts
//initial code
import java.util.Scanner;
import java.lang.*;
class MiddlePattern
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            String s=sc.next();
            GfG g=new GfG();
            g.printPattern(s);
            System.out.println();
            t--;
        }
    }
}


// } Driver Code Ends


class GfG
{
/*method prints the given pattern in a single line */
	void printPattern(String s)
	{
	    String temp = "";
	    for(int i = s.length()/2;i <s.length();i++){
	        System.out.print(s.substring(s.length()/2,i+1)+"$"+" ");
	        temp = s.substring(s.length()/2,i+1);
	    }
	    for(int i = 0; i <s.length()/2;i++){
	        System.out.print(temp+s.substring(0,i+1)+"$"+" ");
	    if(i != s.length()/2){
	        System.out.print(" ");
	    }
	    }
    }
}

