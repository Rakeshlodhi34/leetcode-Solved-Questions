//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node 
{
    int data;
    Node next;
    
    Node(int a)
        {
            data = a;
            next = null;
        }
}

class GfG
{
    static Scanner sc = new Scanner(System.in);
    
    public static Node inputList(int size)
    {
        Node head, tail;
        int val;
        
        val = sc.nextInt();
        
        head = tail = new Node(val);
        
        size--;
        
        while(size-->0)
        {
            val = sc.nextInt();
            tail.next = new Node(val);
            tail = tail.next;
        }
        
        return head;
    }
    
    public static void printList(Node n)
    {
        while(n!=null)
        {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
    
    public static void main(String args[])
    {
        int t = sc.nextInt();
        while(t-->0)
        {
            int n , m;
            
            n = sc.nextInt();
            Node head1 = inputList(n);
            
            m = sc.nextInt();
            Node head2 = inputList(m);
            
            Sol obj = new Sol();
            
            printList(obj.findUnion(head1, head2));
            System.out.println();
        }
    }
}
// } Driver Code Ends




/*
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class Sol
{
    public static Node findUnion(Node head1,Node head2)
    {
        //Add your code here.
        ArrayList<Integer>dist= new ArrayList<>();
        Node t1=head1;
        Node t2=head2;
        while(t1!=null)
        {
            
            if(!dist.contains(t1.data))
            dist.add(t1.data);
            t1=t1.next;
        }
        while(t2!=null)
        {
           if(!dist.contains(t2.data)){
           dist.add(t2.data); 
            }
     
            t2=t2.next;
            
        }
        Collections.sort(dist);
        int i=0;
        Node t3=head1;
        while(t3.next!=null)
        {
            t3.data=dist.get(i++);
            
            if(i>dist.size()-1){
            t3.next=null;
            break;
            }
             t3=t3.next;
            
        }
        if(i<dist.size())
        t3.data=dist.get(i++);
        while(i<dist.size())
        {
          Node n= new Node(dist.get(i++));
          t3.next=n;
          t3=t3.next;
        }
        return head1;
    }
}