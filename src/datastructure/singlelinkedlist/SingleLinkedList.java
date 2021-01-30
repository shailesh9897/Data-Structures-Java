package datastructure.singlelinkedlist;

public class SingleLinkedList {
	
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

	public static void main(String[] args) {
		
		//creat object of singlelinklist
		SingleLinkedList sll=new SingleLinkedList();
		//create head 
		sll.head=new NodeList(10);
		//create second node
		NodeList secondNode=new NodeList(20);
		//create third node
		NodeList thirdNode=new NodeList(30);
		//create fourth node
		NodeList fourthNode=new NodeList(40);
		
		//joining the heads and nodes
		
		sll.head.next=secondNode;//10-->20
		secondNode.next=thirdNode;//10-->20--->30
		thirdNode.next=fourthNode;//10-->20--->30--->40--->null
		//call the display method to display sll
		sll.display();
		
		/* OUTPUT
		 * 10-->20-->30-->40-->null
		 * 
		 */
		
		
		
	}

}
