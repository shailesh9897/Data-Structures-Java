package datastructure.singlelinkedlist;

public class SingleLinkedList_searchElement {
	
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
	
	
	public int searchElemntOccurence(int val)
	{
		if(head==null)
		return -1;
		ListNode current=head;
		int count=0;
		while(current!=null)
		{
			if(current.val==val)
				{
				count++;
				
				}
				
			current=current.next;
		}
		return count;
		
		
		
	}
	
	public static void main(String[] args) {
		
		SingleLinkedList_searchElement sll=new SingleLinkedList_searchElement();
		sll.head=null;
		ListNode node1=new ListNode(10);
		ListNode node2=new ListNode(20);
		ListNode node3=new ListNode(10);
		ListNode node4=new ListNode(10);
		//joining the nodes
		sll.head=node1;
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		
		sll.display();
		System.out.println("\nLength = "+sll.length());
		
		
		/***calling searchElementOccurence method***/
		System.out.println("Element found "+sll.searchElemntOccurence(10)+" Time.");//3 time
		
		sll.display();
		
	}

}
