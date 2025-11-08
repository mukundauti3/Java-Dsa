


public class HashImpl {
	
	class Node{
		int data;
		Node next;
		
		public Node(int data)
		{
			this.data=data;
			this.next=null;
		}
		
		
	}
	
	Node head[];
	
	public HashImpl(int hSize)
	{
		this.head=new Node[hSize]; 
	}
	
	
	public void getNodesValuesToHashMap(int data)
	{
		int mod=data % head.length;
		
		
		addDataToHashMap(mod,data);
	}


	private void addDataToHashMap(int mod,int data) {
		
		if(head[mod] == null)
		{
			Node newNode=new Node(data);
			head[mod]=newNode;
		}else {
			Node newNode=new Node(data);
			
			Node temp=head[mod];
			
			head[mod]=newNode;
			newNode.next=temp;
			temp=null;
		}
		
	}
	
	
	public void show() {
		
		
        for (int i = 0; i < head.length; i++) 
        {

            System.out.print("Index " + i + ": ");
            
            Node temp = head[i];
            
            if (temp == null) 
            {
                System.out.println("null");
                
            } else 
            {          	
                while (temp != null) 
                {
                	
                    System.out.print(temp.data + " -> ");
                    
                    temp = temp.next;
                }
                
                System.out.println("null");
            }
        }
    }

}
