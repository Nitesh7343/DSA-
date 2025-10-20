import java.util.*;
public class LInkedList1{
	
	public static class Node {
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
			
		}
	}
	
	Node head;
	
	
	public void insertLast(int data)
	{
		if(head==null)
		{
			head=new Node(data);
			return ;
		}
		
		Node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=new Node(data);
		return;
	}
	
	public void print()
	{
		System.out.println();
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data+" ");
			temp=temp.next;
		}
	}
	
	
	public static void main(String[] args) {
//		Student head=new Student("A");
//		head.next=new Student("B");
//		head.next.next=new Student("C");
		
		LInkedList1 ls =new LInkedList1();
		ls.insertLast(10);
		ls.insertLast(30);
		ls.insertLast(50);
		ls.print();

		
		
	}

}
