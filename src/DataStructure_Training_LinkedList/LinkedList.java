package DataStructure_Training_LinkedList;

public class LinkedList {
	
	
	static class Node
	{
		int data;
		Node next;
		
	}
	
	
	static void traverse(Node head) {
		
		Node temp = head;
		
		int count = 0;
		
		while(temp.next != null) {
			
			System.out.print(temp.data+" ");
			temp = temp.next;
			
			count++;
		}
		System.out.println("length is : "+count);
	}
	
	
	
	public static void main(String[] args) {
		
		
		Node first = new Node();
		first.data=10;
		first.next=null;
		
		
		Node second = new Node();
		second.data=20;
		second.next=null;
		
		first.next=second;
		
		
		Node third = new Node();
		third.data=30;
		third.next=null;
		
		
		second.next=third;
		
		
		Node fourth = new Node();
		fourth.data=40;
		fourth.next=null;
		
		third.next=fourth;
		
		traverse(first);
		
	}

}
