
public class QueueList {
	
	Node front=null;
	Node rear=null;
	class Node{
		int data;
		Node next;
		
		public Node(int data)
		{
			this.data=data;
			this.next=null;
		}
		
	}
	
	public void enQueue(int data)
	{
		System.out.println("En Queue is Call");
		
		if(front == null)
		{
			System.out.println("First Time Node is Added");
			Node newNode=new Node(data);
			front=newNode;
			rear=newNode;
		}else {
			System.out.println("New Element is Added At Last in En Queue");
			Node newNode=new Node(data);
			
			rear.next=newNode;
			rear=newNode;
		}
	}

	
	public void deQueue()
	{
		System.out.println("De Queue is Call");
		
		if(front == null)
		{
			System.out.println("Queue is empty");
			
		}else {
			System.out.println(front.data);
			Node temp=front;
			front=temp.next;
			temp.next=null;
			
			if(front==null)
			{
				rear=null;
			}
		}
	}
}
