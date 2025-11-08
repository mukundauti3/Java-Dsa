import java.util.Scanner;

public class TestHash {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Size of Heads");
		int hSize=sc.nextInt();
		
		
		System.out.println("Enter the Size of data");
		int size=sc.nextInt();
		
		int[] arr=new int[size];

		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the data one by one");
			arr[i]=sc.nextInt();
		}
		
		
		
		HashImpl h=new HashImpl(hSize);
		

		
		for(int i=0;i<size;i++)
		{
			h.getNodesValuesToHashMap(arr[i]);
		}
		
		h.show();

	}

}
