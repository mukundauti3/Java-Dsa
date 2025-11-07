
public class StackDSA {
	
	Node top;
	public class Node{
		int data;
		Node next;
	//	Node top;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
			
		}
		
		}
	public StackDSA() {
		top=null;
	}
	public void push(int num){
		Node newNode=new Node(num);
		
		if(top==null) {
			top=newNode;
			System.out.println(num);
		}else {
			newNode.next=top;
			top=newNode;
			System.out.println(num);
		}
		
		
	}
	public void pop() {
		
		System.out.println("Pop() Called");
		
		if(top==null) {
			System.out.println("chup");
			
		}else {
		
			
			Node temp=top;
			System.out.println(temp.data);
			top=temp.next;
			temp.next=null;
			
		}
		
	}
	private boolean isEmpty() {
		
		return top==null;
	}
}
