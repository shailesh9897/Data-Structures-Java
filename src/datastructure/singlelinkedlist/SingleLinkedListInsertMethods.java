package datastructure.singlelinkedlist;
//WE HAVE IMPLEMENTED INSERTFIRST && INSERTEND && LENGTH FUNCTION FOR SINGLE LINKED LIST
public class SingleLinkedListInsertMethods {
	
	private NodeList head;
	
	private static class NodeList{
		private int data;
		private NodeList next;
		
		public NodeList(int data){
			this.data=data;
			this.next=null;
			
		}
		
	}
	
	public void display() {
		NodeList current=head;
		while(current!=null) {
			System.out.print(current.data+"-->");
			current=current.next;
		}
		System.out.print("null");
	}
	public int length() 
	{
		if(head==null)
		{
			return 0;
		}
		
		int count=0;
		NodeList current=head;
		while(current!=null)
		{
			count++;
			current=current.next;
		}
		
		return count;
		
		
	}
	
	public void insertEnd(int value) {
		NodeList newNode=new NodeList(value);
		if(head==null)
		{
			head=newNode;
			return;
		}
		
		NodeList current=head;
		while(current.next!=null)
		{
			current=current.next;
		}
		current.next=newNode;
		
	}
	
	public void insertFirst(int value)
	{
		NodeList newNode=new NodeList(value);
		
		if(head==null)
		{
			head=newNode;
			return;
		}
		newNode.next=head;
		head=newNode;
		
	}
	
	
	   
	
	
	
	
	public static void main(String[] args) {
		
		//Create object of singlelinklist
		SingleLinkedListInsertMethods sll=new SingleLinkedListInsertMethods();
		
		
		
		
	
		sll.insertEnd(10);
		sll.insertEnd(20);
		sll.insertEnd(30);
		//call the display method to display sll
		sll.display();
		//call the length method
		System.out.println("\nLength is "+sll.length());
		
		
		/* OUTPUT
		 *
		 * 10-->20-->30-->null
		 * Time complexity of display method - O(n)
		 * Space complexity of display method - O(1)
		 * 
		 * 
		 * Length is 4
		 * Time complexity of length method is O(n)
		 * Space complexity of length method is O(1)
		 * 
		 * Time complexity of insertFirst method is O(1)

		    Space complexity of insertFirst method is O(1)
		    
		    Time complexity of insertLast method is O(n)

			Space complexity of insertLast method is O(1)
		 * 
		 * 
		 * 
		 */
		
		
		
	}

}
