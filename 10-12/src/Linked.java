
import java.io.*;
import java.util.*;

class Node {
	int data;
	Node next;
	Node(int d) {
        data = d;
        next = null;
    }
}

public class Linked {
	
	
	public static  Node insert(Node head,int kk)
	{
		
		//head=new Node(data);
		
		head.data=kk;
		head.next=new Node(kk);
		head.next.next=null;
		
		//head.next=new Node(data);
		
		
		
		
		
		
		return head;
       
    }
	public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

   
	
	public static void main(String args[]) 
	{
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0)
        {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}