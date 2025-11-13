import java.util.Scanner;

public class ArrayAddition {
	static Scanner sc=new Scanner(System.in);


	public static void printArray(int[] array) {
		System.out.println();
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
	}






	public static void acceptArray(int[] array,int[] array2) 
	{
		
		for(int i=0;i<array.length;i++)
		{
			System.out.println("Enter the Value for index "+(i+1));
			array[i]=array2[i]=sc.nextInt();
			
		}
		
		System.out.println("Array Values is Added");
	}
	
	
	public static void arrayAdditionSolution(int[] array,int[] array2) {

		for(int i=0;i<array2.length;i++)
		{
			int sum=0;
			for(int j=0;j<array2.length;j++)
			{
				if(i!=j)
				{
					sum=sum+array2[j];
				}
			}
			array[i]=sum;
		}
		
	}

}
