//{ Driver Code Starts
// driver

import java.io.*;
import java.util.*;


// } Driver Code Ends
/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution {
    static Node addTwoLists(Node num1, Node num2) {
        if(num1==null){
            return num2;
        }
        if(num2==null){
            return num1;
        }
        Node newNum1=reverse(num1);
        Node newNum2=reverse(num2);
        int carry=0;
        Node dummyNode=new Node(0);
        Node res=dummyNode;
        while(newNum1!=null || newNum2!=null){
            int sum=carry;
            if(newNum1!=null){
                sum+=newNum1.data;
            }
             if(newNum2!=null){
                sum+=newNum2.data;
            }
            Node newNode = new Node(sum%10);
            res.next=newNode;
            carry=sum/10;
            res=res.next;
            if(newNum1!=null){
                newNum1=newNum1.next;
            }
            if(newNum2!=null){
                newNum2=newNum2.next;
            }
        }
        if(carry!=0){
            Node newNode=new Node(carry);
            res.next=newNode;
            res=res.next;
        }
        Node ans=reverse(dummyNode.next);
        while(ans.data==0){
            ans=ans.next;
        }
        return ans;
       
    }
     static Node reverse(Node head){
            Node curr = head;
            Node prev=null;
            while(curr!=null){
                Node temp=curr.next;
                curr.next=prev;
                prev=curr;
                curr=temp;
                
            }
            return prev;
        }
}

//{ Driver Code Starts.

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GfG {

    static void printList(Node n) {
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(read.readLine());
        while (T-- > 0) {

            String str[] = read.readLine().trim().split(" ");
            int n = str.length;

            Node num1 = new Node(Integer.parseInt(str[0]));
            Node tail = num1;
            for (int i = 1; i < n; i++) {
                int val = Integer.parseInt(str[i]);
                tail.next = new Node(val);
                tail = tail.next;
            }

            String str2[] = read.readLine().trim().split(" ");
            int m = str2.length;

            Node num2 = new Node(Integer.parseInt(str2[0]));
            tail = num2;
            for (int i = 1; i < m; i++) {

                tail.next = new Node(Integer.parseInt(str2[i]));
                tail = tail.next;
            }

            Solution g = new Solution();
            Node res = g.addTwoLists(num1, num2);
            printList(res);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends