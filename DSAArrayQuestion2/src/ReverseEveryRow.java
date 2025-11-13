import java.util.Scanner;

public class ReverseEveryRow {
	static Scanner sc=new Scanner(System.in);

	public static void accept(int[][] array) {
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[i].length;j++)
			{
				System.out.println("Enter the Value for "+(i+1)+" "+(j+1)+" index");
				array[i][j]=sc.nextInt();
			}
		}
	}
	
	
	public static void showArray(int[][] array)
	{
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[i].length;j++)
			{
				System.out.print(array[i][j]);
				
			}
			
			System.out.println();
		}
	}
	
	

	public static void reverseEveryRow(int[][] array) {

		int[][] array2=new int[array.length][];
		
		
		for(int i=0;i<array.length;i++)
		{	int k=0;
			array2[i]=new int[array[i].length];
			for(int j=array[i].length-1;j>=0;j--)
			{
				array2[i][k]=array[i][j];
				k++;
			}
		}
		
		showArray(array2);
		
	}


	public static void maxOddNumber(int[][] array) {

		for(int i=0;i<array.length;i++)
		{
			int max=0;
			for(int j=0;j<array[i].length;j++)
			{
				if(array[i][j] % 2 !=0 && max<array[i][j])
				{
					max= array[i][j];
					
				}
				
			}
			
			System.out.println("Max "+max);
		}
		
	}
	
	
	
	
}
