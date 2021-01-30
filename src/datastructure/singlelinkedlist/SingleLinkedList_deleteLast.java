package datastructure.singlelinkedlist;

import datastructure.singlelinkedlist.SingleLinkedList_insertAt.ListNode;

public class SingleLinkedList_deleteLast {
	
	private ListNode head;
	public static class ListNode{
		private int val;
		private ListNode next;
		public ListNode(int val) {
			this.val=val;
			this.next=null;
		}
	}
/*****************************************************************************************************************************/
	/*
	Display function
	*/public void display() {
		if(head==null)
		{
			System.out.print("null");
		}
		ListNode current=head;
		while(current!=null)
		{
			System.out.print(current.val+"--->");
			current=current.next;
		}
		System.out.print("null");
	}
	/*
	Length function
	*/
	public int length() {
		if(head==null) {
			return 0;
		}
		ListNode current=head;
		int counter=0;
		while(current!=null)
		{
			current=current.next;
			counter++;
		}
		return counter;
		
	}
	
	/*****************************************************************************************************************************/
	
	
	public void deleteLast()
	{
		
		if(head==null)
		{
			return;
		}
		ListNode dummy=new ListNode(-1);
		dummy.next=head;
		ListNode current=head;
		ListNode previous=dummy;
		while(current.next!=null)
		{
			previous=current;
			current=current.next;
		}
		previous.next=null;
		head=dummy.next;
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		SingleLinkedList_deleteLast sll=new SingleLinkedList_deleteLast();
		sll.head=null;
		ListNode node1=new ListNode(10);
		ListNode node2=new ListNode(20);
		ListNode node3=new ListNode(30);
		ListNode node4=new ListNode(40);
		//joining the nodes
		sll.head=node1;
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		
		sll.display();
		System.out.println("\nLength = "+sll.length());
		
		
		/***calling deleteLast method***/
		sll.deleteLast();
		
		sll.display();
		
	}

}
